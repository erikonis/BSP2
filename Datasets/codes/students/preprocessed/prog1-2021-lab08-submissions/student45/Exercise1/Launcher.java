public class Launcher {
    public static void main(String[] args) {
        Package p1= new Package("Ms. Sara-Elena Vatavu", "Rue du Soleil. 15, 1261, Howald", "League of Legends Skins", Method.EXPRESS, Country.LUXEMBOURG);
        Package p2= new Package("Ms. Ruelle", "Rue de la Resistence. 72, 43141, Lyon", "CD ALBUM", Method.CLASSIC, Country.FRANCE);
        Package p3= new Package("Mr. Rekkles Larsson", "Rue du Dispensaire. 23, 12524, Arlon", "Christmas Tree", Method.PRIORITY, Country.BELGIUM);
        Package p4= new Package("Mr. Lucas de Rooy", "Oppenheimer Str. 53, 54241, Frankfurt", "RTX 3090", Method.NORUSH, Country.GERMANY);
       
       
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    
    
    }
}
