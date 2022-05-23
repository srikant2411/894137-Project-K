package com.cts.processPension.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Model class for process pension response
 * 
 *  @author Srikant Babu
 *  @author 894137
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProcessPensionResponse {

	@ApiModelProperty(value = "Status code after processing pension. 10 for success and 21 for failure")
	private int processPensionStatusCode;

	public int getProcessPensionStatusCode() {
		return processPensionStatusCode;
	}

	public void setProcessPensionStatusCode(int processPensionStatusCode) {
		this.processPensionStatusCode = processPensionStatusCode;
	}
public ProcessPensionResponse() {
	
}
	public ProcessPensionResponse(int processPensionStatusCode) {
		
		this.processPensionStatusCode = processPensionStatusCode;
	}

}
