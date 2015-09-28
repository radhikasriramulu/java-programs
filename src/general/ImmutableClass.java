/**
 * Immutable classes are those class, whose object can not be modified once created, 
 * it means any modification on immutable object will result in another immutable object.
 * best example to understand immutable and mutable objects are, String and StringBuffer. 

 */
package general;

public final class ImmutableClass {
	private final String contactName;
    private final String contactAddress;

    public ImmutableClass(String contactName, String contactAddress) {
        this.contactName = contactName;
        this.contactAddress = contactAddress;
    }
  
    public String getContactAddress(){
        return contactAddress;
    }
  
    public String getContactName(){
        return contactName;
    }


}
