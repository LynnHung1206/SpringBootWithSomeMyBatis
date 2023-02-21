package tw.idv.lynn.core.pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class Core implements Serializable {
	private static final long serialVersionUID = 1457755989409740329L;
	private boolean successful;
	public boolean isSuccessful() {
		return successful;
	}
	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String message;
}
