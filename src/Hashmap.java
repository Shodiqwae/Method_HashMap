import java.util.HashMap;

public class Hashmap{
    public static void main(String[] args) throws Exception {
      // Isi data awal
        HashMap<Integer, String> data = new HashMap<Integer, String>();
        data.put(1, "Darma");
        data.put(2, "Solihin");
        data.put(3, "wanto");
        data.put(4, "Slamet");
        data.put(5, "Gunawan");

      // Isi data kedua
        HashMap<Integer, String> data1 = new HashMap<Integer, String>();
        data1.put(1, "Kemal");
        data1.put(2, "Sahru");
        data1.put(3, "Satrio");
        data1.put(4, "Rifai");
        data1.put(5, "Erji"); 

      // Data Awalan
        System.out.println();
        System.out.println("Urutan Data : " + data);
        System.out.println();
      // 1. isempty
        System.out.println("1. Ini adalah isempty : " + data.isEmpty());
        System.out.println();
      // 2. size  
        System.out.println("2. ini adalah size : " + data.size());
        System.out.println();
      // 3. values
        System.out.println("3. Ini adalah values : " + data.values());
        System.out.println();
      // 4. keyset
        System.out.println("4. Ini adalah keyset : " + data.keySet());
        System.out.println();
      // 5. clone
        System.out.println("5. Ini adalah clone : " + data.clone());
        System.out.println();
      // 6. get
        System.out.println("6. Ini adalah get : " + data.get(3));
        System.out.println();
      // 7. containskey
        System.out.println("7. Ini adalah Containskey  : " + data.containsKey(4));
        System.out.println();
      // 8. containsValue
         System.out.println("8. Ini adalah ContainsValue : " + data.containsValue("Darma"));
         System.out.println();
      // 9. remove Boolean
        System.out.println("9. Ini adalah Remove dalam bentuk boolean  : " + data.remove(5, "Gunawan"));
        System.out.println();
      // 10. remove key
         System.out.println("10. Ini adalah Remove dalam bentuk kunci  : " + data.remove(1));
         System.out.println();

        // 11. Replace
        data.replace(3, "wanto", "Dewanto");
        System.out.println("11. Ini adalah Replace : "  + data);
        System.out.println();
        // 12. entryset
         System.out.println("12. Ini adalah entrySet : " + data.entrySet());
         System.out.println();

         // 13. getOrdefault
         System.out.println("13. Ini adalah getOrefault : " + data.getOrDefault(6, "Sepuh"));
         System.out.println();

        // 14. computeIfAbsent
        data.computeIfAbsent(1, k -> "Darma" );
        data.computeIfAbsent(5, k -> "Udin" );
        
        System.out.println("14. Ini adalah computeIfAbsent : " +data);
        System.out.println();

        // 15. computeIfPresent
        data.computeIfPresent(5, (key, val) -> "Gunawan" );
        System.out.println("15. Ini adalah computeIfPresent : " + data);
        System.out.println();

        // 16. Merge/ Forech / equalsIgonoreCase
        data.forEach((key, value) -> data1.merge(key, value, (v1, v2) -> v1.equalsIgnoreCase(v2)? v1 : v1 + " : " + v2));
        System.out.println("16. Ini adalah bentuk dari merge : " + data1);
        System.out.println();

   
        // 16. clear
        data.clear();
        

        
    }
}