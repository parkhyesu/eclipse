
public enum FieldName {
	
	DOB("DOB"),
	NICKNAME("NICKNAME"),
	ADDRESS_CITY("ADDRESS_POSTCODE"),
	ADDRESS_STATE("ADDRESS_STATE"),
	ADDRESS_POSTCODE("ADDRESS_POSTCODE"),
	ADDRESS_STREET("ADDRESS_POSTCODE")
	;
	
	
	private String value;
	private FieldName(String value) {
		this.value = value;
	}
	
	public String value() {
		return this.value;
	}
}
