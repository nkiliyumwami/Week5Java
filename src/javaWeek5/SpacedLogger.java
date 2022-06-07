package javaWeek5;

public class SpacedLogger  implements Logger{
    @Override
    public void log(String log) {
        for(int i = 0; i < log.length(); i++) {
            System.out.print(log.charAt(i)+" ");
        }
        System.out.println( " ");
    }

    @Override
    public void error(String error) {
        String result = " ";
        for(int k = 0; k < error.length(); k++) {
            result += (error.charAt(k)+" ");
        }
        System.out.print("Error:" + result);

    }
}

