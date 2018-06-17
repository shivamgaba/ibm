package jsoupdemo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Document doc = Jsoup.connect("http://www.cricbuzz.com/cricket-match/live-scores").userAgent("Mozilla/17.0").get();
		System.out.println(doc.title());
		Elements els = doc.select("div.cb-lv-scrs-col.text-black");//to store elements dom
			System.out.println(els.first().text());
			System.out.println(els.last().text());
		int i=0;
		for (Element element : els) {
			i++;	
			//String title=element.select("div.cb-series-sch-dot").text();
				System.out.println(i+" "+element.getAllElements().text());
			//to print particular score below is the method	
			if(i==3){
					System.out.println("----------- "+element.text());
					break;
				}
		}
		
			//element.getElementsByTag("")
			
	}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
