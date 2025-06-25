public class stringmethod {
    public static void main(String[] args) {
        String s = " poonam ";
        System.out.println("length  of string:" + s.length());
        System.out.println("convert string into lowercase:" + s.toLowerCase());
        System.out.println("uppercase:" + s.toUpperCase());
        System.out.println("remove spaces:" + s.trim());
        System.out.println("print letter:" + s.substring(1));
        System.out.println(s.substring(1,4));
        System.out.println(s.replace('m','l'));
        System.out.println(s.startsWith("p"));
        System.out.println(s.endsWith("l"));
        System.out.println(s.charAt(4));
        System.out.println(s.indexOf("oon"));
        System.out.println(s.indexOf("oo", 4));
        System.out.println(s.equals("POonam"));
        System.out.println(s.equalsIgnoreCase("poonaM"));      
    }
    
}
