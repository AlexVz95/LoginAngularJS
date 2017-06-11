package com.mts.loginAlex.vo;

public class Respuesta {
	
	private String mensajeSuccess;
	private boolean success;
	private String mensajeError;
	
	public Respuesta(){
	
	}
	
	public Respuesta(String mensajeSuccess, boolean success, String mensajeError){
		this.mensajeSuccess=mensajeSuccess;
		this.success=success;
		this.mensajeError=mensajeError;
	}
	
	public String getMensajeSuccess() {
		return mensajeSuccess;
	}
	public void setMensajeSuccess(String mensajeSuccess) {
		this.mensajeSuccess = mensajeSuccess;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMensajeError() {
		return mensajeError;
	}
	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}
	
}
