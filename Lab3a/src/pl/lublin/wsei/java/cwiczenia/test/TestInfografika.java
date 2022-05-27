package pl.lublin.wsei.java.cwiczenia.test;

import pl.lublin.wsei.java.cwiczenia.Infografika;
public class TestInfografika {
    public static void main (String[] args) {
        String exItem = "\t\t\t<item>\n" +
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
        Infografika infografika= new Infografika(exItem);
        System.out.println("Inforgrafika");
        System.out.println("Tytuł: "+infografika.tytul);
        System.out.println("Adres strony: " + infografika.adresStrony);
        System.out.println("Adres Grafiki: " + infografika.adresGrafiki);
        System.out.println("Adres Miniaturki: " + infografika.adresMiniaturki);
        System.out.println("Rozmiar: " + infografika.wysokosc+" x "+ infografika.szerokosc );
    }
}
