

public class FieldExample {
  
   
    int validField;
    String validFieldName;

    public static void main(String[] args) {
        
        FieldExample instance = new FieldExample();
        System.out.println("Uninitialized int field: " + instance.validField);
        System.out.println("Uninitialized String field: " + instance.validFieldName);

      
    }
}

