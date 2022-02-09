public class InputParamVO {
	private String paramName;
	private Object paramValue;

	public InputParamVO() {
	}

	public InputParamVO(String paramName, Object paramValue) {
		this.paramName = paramName;
		this.paramValue = paramValue;
	}

	public String getParamName() {
		return paramName;
	}

	public Object getParamValue() {
		return paramValue;
	}
}