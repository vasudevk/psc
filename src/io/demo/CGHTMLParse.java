//package io.demo;
//
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.List;
//
//public class CGHTMLParse {
//
//
//    public static final String HTTPS_SFBAY_CRAIGSLIST_ORG_SEARCH_SSS_S_120_QUERY_TOYOTA = "https://sfbay.craigslist.org/search/sss?s=120&query=toyota";
//    public static final String RESULT_TITLE_HDRLNK = "result-title hdrlnk";
//    public static final String GET = "GET";
//
//    public static void main(String asd[]) throws Exception {
//
//        URL obj = new URL(HTTPS_SFBAY_CRAIGSLIST_ORG_SEARCH_SSS_S_120_QUERY_TOYOTA);
//
//
//        HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
//        httpURLConnection.setDoOutput(true);
//
//        httpURLConnection.setRequestMethod(GET);
//        BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
//        String l2 = null;
//        String s = null;
//        while ((l2 = br.readLine()) != null) {
//            s = s + l2;
//        }
//
//        Document document = Jsoup.parse(s);
//        org.jsoup.select.Elements ttls = document.getElementsByClass(RESULT_TITLE_HDRLNK);
//        List<String> titlesList = new ArrayList();
//        for (Element titles21 : ttls) {
//            titlesList.add(titles21.wholeText());
//        }
//        System.out.println(titlesList);
//    }
//}
