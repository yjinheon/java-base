package parse;

// import json-simple-1.1.1.jar
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


public class JsonApi {

    public static void main(String[] args) {
        try{
            /*요청정보입력
             * 아래와 같은 정보들은 사용자 가이드를 확인하여 찾아주시면 됩니다.
             * 위도 경도는 엑셀파일 안에 있습니다.
             * */

            //자신이 조회를 원하는 지역의 경도와 위도를 입력해주세요
            // https://open.neis.go.kr/hub/mealServiceDietInfo?KEY={SERVICEKEY}&Type=json&pIndex={pIndex}&pSize=1000&ATPT_OFCDC_SC_CODE={code}&SD_SCHUL_CODE={school_code}&MLSV_YMD=

            String Type = "json";  //json
            String pIndex = "1";   //
            String pSize = "100"; //
            String ATPT_OFCDC_SC_CODE = "T10"; //
            String SERVICEKEY = "9caeec59f45a414c899f432b7ba14bba";
            String SD_SCHUL_CODE = "9290083";
            String BaseUrl = "https://open.neis.go.kr/hub/mealServiceDietInfo?";
            String MLSV_YMD="202208";
            // 정보를 모아서 URL정보를 만들면됩니다. 맨 마지막 "&_type=json"에 따라 반환 데이터의 형태가 정해집니다.
            String urlStr = BaseUrl + "KEY=" + SERVICEKEY + "&Type=" + Type + "&pIndex=" + pIndex + "&pSize=" + pSize + "&ATPT_OFCDC_SC_CODE=" + ATPT_OFCDC_SC_CODE + "&SD_SCHUL_CODE=" + SD_SCHUL_CODE + "&MLSV_YMD=" + MLSV_YMD;
            URL url = new URL(urlStr); // 위 urlStr을 이용해서 URL 객체를 만들어줍니다.
            BufferedReader bf;
            String line = "";
            String result="";

            //정보를 받아옵니다.
            bf = new BufferedReader(new InputStreamReader(url.openStream()));

            //버퍼에 있는 정보를 하나의 문자열로 변환.
            while((line=bf.readLine())!=null){
                result=result.concat(line);
                System.out.println(result);  // 받아온 데이터를 확인해봅니다.
            }

            // for loop JSON Array
            JSONParser parser = new JSONParser();
            Object obj  = parser.parse(result);
            JSONArray array = new JSONArray();
            array.add(obj);

            // for loop JSON Array
            for(int i=0; i<array.size(); i++){
                JSONObject entity = (JSONObject) array.get(i);
                JSONObject parse_res = (JSONObject)  entity.get("mealServiceDietInfo");
                JSONObject parse_item = (JSONObject) parse_res.get("row");


                String date;
                JSONObject menu; // parse_item은 배열형태이기 때문에 하나씩 데이터를 하나씩 가져올때 사용합니다.
                date = (String) parse_item.get("MLSV_YMD");
                menu = (JSONObject) parse_item.get("DDISH_NM");
                System.out.println(date);
                System.out.println(menu);

                for(int j = 0 ; j < parse_item.size(); j++)
                {
                    menu = (JSONObject) parse_item.get(j);
                    //String base_Date = (String)weather.get("baseDate");
                    //String fcst_Time = (String)weather.get("fcstDate");
                    String dish = ((String)menu.get("DDISH_NM")); //실수로된 값과 정수로된 값이 둘다 있어서 실수로 통일했습니다.
                    //String nX = (String)weather.get("nx");
                    //String nY = (String)weather.get("ny");
                    date = (String)menu.get("MLSV_YMD");
                    //String base_Time = (String)weather.get("baseTime");
                    //String fcscDate = (String)weather.get("fcscDate");

                    // 출력합니다.
                    System.out.print("배열의 "+j+"번째 요소");
                    System.out.print("   date : "+ date);
                    System.out.print("   menu_nm : "+ dish);
                    System.out.println();
                }



            }

            // Top레벨 단계인 response 키를 가지고 데이터를 파싱합니다.

            // response 로 부터 body 찾아옵니다.

            // body 로 부터 items 받아옵니다.
            // JSONObject parse_items = (JSONObject) parse_body.get("items");

            // items로 부터 itemlist 를 받아오기 itemlist : 뒤에 [ 로 시작하므로 jsonarray이다
            //JSONArray parse_item = (JSONArray) parse_body.get("item");

            // 필요한 데이터만 가져오려고합니다.
            // 마지막에보면 에러가 발생하였는데 casting문제입니다.
            // 이는 반환되는 데이터타입이 달라서인데 이번 글에서는 여기까지만하고
            // 데이터베이스에 입력할때는 수정해서 하겠습니다.


            bf.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
