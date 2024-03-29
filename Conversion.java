public class Conversion {

    protected String fromPST(int inputHour, String inputMin) {
        inputHour = inputHour + 9;
       if (inputHour >= 24) {
           inputHour = inputHour - 24;
           return "Converted from PST to CET: " + inputHour + inputMin + " (of the day after)";}
       else return "Converted from PST to CET: " + inputHour + inputMin;
    }

    protected String fromCST(int inputHour, String inputMin) {
        inputHour = inputHour + 7;
       if (inputHour >= 24) {
           inputHour = inputHour - 24;
           return "Converted from CST to CET: " + inputHour + inputMin + " (of the day after)";}
       else return "Converted from CST to CET: " + inputHour + inputMin;
    }

    protected String fromEST(int inputHour, String inputMin) {
        inputHour = inputHour + 6;
        if (inputHour >= 24) {
            inputHour = inputHour - 24;
            return "Converted from EST to CET: " + inputHour + inputMin + " (of the day after)";}
        else return "Converted from EST to CET: " + inputHour + inputMin;
    }

    protected String fromUTC(int inputHour, String inputMin) {
        inputHour = inputHour + 1;
       if (inputHour >= 24) {
           inputHour = inputHour + 24;
           return "Converted from UTC to CET: " + inputHour + inputMin + " (of the day after)";}
        return "Converted from UTC to CET: " + inputHour + inputMin;
    }

    protected String fromEET(int inputHour, String inputMin) {
        inputHour = inputHour - 2;
        if (inputHour < 0) {
            inputHour = inputHour + 24;
            return "Converted from EET to CET: " + inputHour + inputMin + " (of the day before)";}
        return "Converted from EET to CET: " + inputHour + inputMin;
    }

    protected String fromJST(int inputHour, String inputMin) {
        inputHour = inputHour - 8;
        if (inputHour < 0) {
            inputHour = inputHour + 24;
            return "Converted from JST to CET: " + inputHour + inputMin + " (of the day before)";}
        return "Converted from JST to CET: " + inputHour + inputMin;
    }

    protected String fromBJT(int inputHour, String inputMin) {
        inputHour = inputHour - 7;
        if (inputHour < 0) {
            inputHour = inputHour + 24;
            return "Converted from BJT to CET: " + inputHour + inputMin + " (of the day before)";}
        return "Converted from BJT to CET: " + inputHour + inputMin;
    }

    protected String fromACT(int inputHour, String inputMin) {
        inputHour = inputHour - 10;
        if (inputHour < 0) {
            inputHour = inputHour + 24;
            return "Converted from ACT to CET: " + inputHour + inputMin + " (of the day before)";}
        return "Converted from ACT to CET: " + inputHour + inputMin;
    }
}
