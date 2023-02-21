package parse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.net.URL;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonApi2 {
    public static void main(String[] args) throws Exception {
        // 1. URL을 만들기 위한 StringBuilder.
        StringBuilder urlBuilder = new StringBuilder("https://open.neis.go.kr/hub/mealServiceDietInfo"); /*URL*/
        // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
        // https://open.neis.go.kr/hub/mealServiceDietInfo?KEY={SERVICEKEY}&Type=json&pIndex={pIndex}&pSize=1000&ATPT_OFCDC_SC_CODE={code}&SD_SCHUL_CODE={school_code}&MLSV_YMD=
        // https://open.neis.go.kr/hub/mealServiceDietInfo?KEY=9caeec59f45a414c899f432b7ba14bba&Type=json&pIndex=1&pSize=100&ATPT_OFCDC_SC_CODE=T10&SD_SCHUL_CODE=9290083&MLSV_YMD=202208

        String Type = "json";  //json
        String pIndex = "1";   //
        String pSize = "100"; //
        String ATPT_OFCDC_SC_CODE = "T10"; //
        String SERVICEKEY = "9caeec59f45a414c899f432b7ba14bba";
        String SD_SCHUL_CODE = "9290083";
        String BaseUrl = "https://open.neis.go.kr/hub/mealServiceDietInfo?";
        String MLSV_YMD="202208";

        urlBuilder.append("?" + URLEncoder.encode("KEY","UTF-8") + "=" + URLEncoder.encode(SERVICEKEY)); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("Type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*XML 또는 JSON*/
        urlBuilder.append("&" + URLEncoder.encode("pIndex","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("pSize","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8"));
        urlBuilder.append("&" + URLEncoder.encode("ATPT_OFCDC_SC_CODE","UTF-8") + "=" + URLEncoder.encode("T10", "UTF-8"));
        urlBuilder.append("&" + URLEncoder.encode("SD_SCHUL_CODE","UTF-8") + "=" + URLEncoder.encode("9290083", "UTF-8"));
        // 3. URL 객체 생성.
        URL url = new URL(urlBuilder.toString());
        // 4. 요청하고자 하는 URL과 통신하기 위한 Connection 객체 생성.
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        // 5. 통신을 위한 메소드 SET.
        conn.setRequestMethod("GET");
        // 6. 통신을 위한 Content-type SET.


        conn.setRequestProperty("Content-type", "application/json");
        // 7. 통신 응답 코드 확인.
        System.out.println("Response code: " + conn.getResponseCode());
        // 8. 전달받은 데이터를 BufferedReader 객체로 저장.
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        // 9. 저장된 데이터를 라인별로 읽어 StringBuilder 객체로 저장.
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
            // System.out.println(line);
        }

        // print row.DDISH_NMf
        JSONParser parser = new JSONParser();
        JSONObject obj = (JSONObject) parser.parse(sb.toString());
        System.out.println(obj.get("mealServiceDietInfo"));
        Object meal = obj.get("mealServiceDietInfo");
        System.out.println(meal);

        JSONArray row = (JSONArray) meal;
        //System.out.println(row);
        System.out.println(row.get(1));

        JSONObject row2 = (JSONObject) row.get(1);
        System.out.println(row2.get("row"));
        JSONArray row3 = (JSONArray) row2.get("row");
        System.out.println("테스트:  "+"\n"+row3.get(0)); // row 1번째

        List<JSONObject> res3;
        for(int i=0; i<row3.size(); i++) {  // row 1번째
            JSONObject res = (JSONObject) row3.get(i);
            System.out.println(res.get("DDISH_NM"));
        }
        // empty array

        // json array parsing

        // 10. 객체 해제.
        rd.close();
        conn.disconnect();
        // 11. 전달받은 데이터 확인.
        //System.out.println(sb.toString());
    }
}
