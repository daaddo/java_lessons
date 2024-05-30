package it.cascella.utils;

public class Analizer {
    public final static String LOGGERG = "LoggerG.setMessage";
    public String analize(String text) {
        StringBuilder stringBuilder = new StringBuilder();

        text = text.replaceAll("System.out.println", LOGGERG);

        String[] split = text.split(LOGGERG);
        for (String s : split) {
            int i1 = s.indexOf(";");
            String substring = s.substring(0, i1);
            String substring1 = s.substring(i1);
            substring = "LoggerG.setMessage"+substring+".system()";
            stringBuilder.append(substring);
            stringBuilder.append(substring1);
            /*String[] split1 = s.split(";");
            split1[0] = "LoggerG.setMessage"+split1[0] + ".system();";
            stringBuilder.append(split1[0]);
            for (int i = 1; i < split1.length; i++) {

                stringBuilder.append(split1[i]);
            }*/
        }
        return stringBuilder.toString();
    }

}
