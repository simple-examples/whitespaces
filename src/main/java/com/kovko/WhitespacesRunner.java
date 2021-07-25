package com.kovko;

import java.util.LinkedHashMap;
import java.util.Map;

public class WhitespacesRunner
{
    // Trim removes only the characters that has integer value less or equals 32
    public static void main( String[] args ) {

        Map<String, Character> whitespaces = new LinkedHashMap<>();
        whitespaces.put("SPACE", '\u0020');
        whitespaces.put("NO-BREAK SPACE", '\u00A0');
        whitespaces.put("OGHAM SPACE MARK", '\u1680');
        whitespaces.put("MONGOLIAN VOWEL SEPARATOR", '\u180E');
        whitespaces.put("EN QUAD", '\u2000');
        whitespaces.put("EM QUAD", '\u2001');
        whitespaces.put("EN SPACE (nut)", '\u2002');
        whitespaces.put("EM SPACE (mutton)", '\u2003');
        whitespaces.put("THREE-PER-EM SPACE (thick space)", '\u2004');
        whitespaces.put("FOUR-PER-EM SPACE (mid space)", '\u2005');
        whitespaces.put("SIX-PER-EM SPACE", '\u2006');
        whitespaces.put("FIGURE SPACE", '\u2007');
        whitespaces.put("PUNCTUATION SPACE", '\u2008');
        whitespaces.put("THIN SPACE", '\u2009');
        whitespaces.put("HAIR SPACE", '\u200A');
        whitespaces.put("ZERO WIDTH SPACE", '\u200B');
        whitespaces.put("NARROW NO-BREAK SPACE", '\u202F');
        whitespaces.put("MEDIUM MATHEMATICAL SPACE", '\u205F');
        whitespaces.put("IDEOGRAPHIC SPACE", '\u3000');
        whitespaces.put("ZERO WIDTH NO-BREAK SPACE", '\uFEFF');

        whitespaces.forEach((name, character) -> {
            String foo = "foo";
            String bar = character + "bar";
            System.out.println(name);
            System.out.println("Trim  :" + foo.trim() + bar.trim());
            System.out.println("Strip :" + foo.strip() + bar.strip());
            System.out.println();
        });
    }
}
