package com.gitlab.emradbuba.learning.java_examples.codewars.parse_int_reloaded;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ReloadedIntParser {
    private static final String MILLION = "million";
    private static final String THOUSAND = "thous";
    private static final String HUNDRED = "hundred";
    private static final String AND = "and";

    public int parseInt(String number) {
        // two hundred forty-two thousand seven hundred eighty-three
        // two hundred forty-two thousand seven hundred three
        // sixty-two thousand seven hundred three
        // thousand five
        // forty-three thousand
        // thousand
        StringBuilder builder = new StringBuilder();
        String normalizedNumber = normalizeString(number);
        if(normalizedNumber.equals(THOUSAND)) return 1000;
        if(normalizedNumber.equals(HUNDRED)) return 100;
        if (normalizedNumber.contains(MILLION)) builder.append("1");
        String numberWithoutMillion = getRidOfMillion(normalizedNumber);
        String parsedNumberWithoutMillion = parseNumberWithoutMillion(numberWithoutMillion);
        builder.append(parsedNumberWithoutMillion);
        String s = builder.toString();
        s = s.replaceFirst("^0*", "");
        return Integer.parseInt(s);
    }

    private String getRidOfMillion(String normalizedNumber) {
        if (normalizedNumber.contains(MILLION)) {
            if (normalizedNumber.endsWith(MILLION)) return "";
            int idxMillion = normalizedNumber.indexOf(MILLION);
            return normalizedNumber.substring(idxMillion + MILLION.length());
        }
        return normalizedNumber;
    }

    private String parseNumberWithoutMillion(String numberWithoutMillion) {
        if (numberWithoutMillion.contains(THOUSAND)) {
            int index = numberWithoutMillion.indexOf(THOUSAND);
            String firstPart = numberWithoutMillion.substring(0, index).trim();
            String secondPart = numberWithoutMillion.substring(index + THOUSAND.length()).trim();
            return parseThreeDigitsNumber(firstPart) + parseThreeDigitsNumber(secondPart);
        } else {
            return "000" + parseThreeDigitsNumber(numberWithoutMillion);
        }
    }

    private String normalizeString(String stringToNormalize) {
        return Optional.of(stringToNormalize)
                .map(String::trim)
                .map(String::toLowerCase)
                .map(s -> s.replaceAll(AND, ""))
                .orElseThrow(() -> new RuntimeException("Sth unexpected happened"));
    }

    private String parseThreeDigitsNumber(String normalizedString) {
        if (normalizedString.contains(HUNDRED)) {
            int index = normalizedString.indexOf(HUNDRED);
            String firstPart = normalizedString.substring(0, index).trim();
            String secondPart = normalizedString.substring(index + HUNDRED.length()).trim();
            return parseFinal(firstPart) + parseHyphenOrNormalDigit(secondPart);
        } else {
            return "000" + parseHyphenOrNormalDigit(normalizedString);
        }
    }

    private String parseHyphenOrNormalDigit(String secondPart) {
        if (secondPart.contains("-")) {
            return parseFinal(secondPart.split("-")[0])
                    + parseFinal(secondPart.split("-")[1]);
        } else {
            return parseFinal(secondPart);
        }
    }

    private String parseFinal(String single) {
        if (single.isEmpty()) {
            return "0";
        } else {
            return MAP.get(single);
        }
    }

    private Map<String, String> MAP = new HashMap<String, String>() {{
        put("one", "1");
        put("two", "2");
        put("three", "3");
        put("four", "4");
        put("five", "5");
        put("six", "6");
        put("seven", "7");
        put("eight", "8");
        put("nine", "9");
        put("ten", "1");
        put("eleven", "11");
        put("twelve", "12");
        put("thirteen", "13");
        put("fourteen", "14");
        put("fifteen", "15");
        put("sixteen", "16");
        put("seventeen", "17");
        put("eighteen", "18");
        put("nineteen", "19");
        put("twenty", "2");
        put("thirty", "3");
        put("forty", "4");
        put("fifty", "5");
        put("sixty", "6");
        put("seventy", "7");
        put("eighty", "8");
        put("ninety", "9");
    }};
}