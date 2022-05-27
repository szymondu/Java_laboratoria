package pl.lublin.wsei.java.cwiczenia.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx {
    public static void main (String[] args) {
        String exItem = "\t \t <item>\n" +
                "\t\t\t<title><![CDATA[Zeszyt metodologiczny Indeksy cen eksportu i importu]]></title> \n"+
                "\t\t\t<pubDate><![CDATA[Fri, 27 May 2022 08:45:00 +0200]]></pubDate>\n"+
                "\t\t\t<link>https://stat.gov.pl/obszary-tematyczne/ceny-handel/ceny/zeszyt-metodologiczny-indeksy-cen-eksportu-i-importu,11,1.html</link> \n"+
                "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/obszary-tematyczne/ceny-handel/ceny/zeszyt-metodologiczny-indeksy-cen-eksportu-i-importu,11,1.html</guid>\n"+
                "\t\t\t<category>Publikacja</category>\n"+
                "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5465/11/1/1/przechwytywanie.png\" type=\"image/png\" width=\"654\" height=\"853\">\n"+
                "\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n"+
                "\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5465/11/1/1/przechwytywanie,k1uUwl-caFOE6tCTiHtf.png\" />\n"+
                "\t\t\t</media:content>\n"+
                "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5465/11/1/1/przechwytywanie,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div>W ramach niniejszego zeszytu metodologicznego zaprezentowana została metodologia i organizacja badania cen w handlu zagranicznym. Treść tego dokumentu stanowi podsumowanie doświadczeń zdobytych podczas realizacji badania poświęconego cenom w handlu zagranicznym, jak również wyników prac metodologicznych przeprowadzonych w tym obszarze w ostatnich latach.]]></description>\n"+
                "\t\t</item>";
        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(exItem);
        if (m.find())
            System.out.println("Znaleziono tytuł: " + m.group(1));
        else
            System.out.println("Nie zleziono tytułu " );
    }
}