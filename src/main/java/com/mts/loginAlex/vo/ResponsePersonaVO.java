package com.mts.loginAlex.vo;

import java.util.ArrayList;

public class ResponsePersonaVO {

		private ArrayList<Persona> personas;
		private Respuesta respuesta;
		
		public ResponsePersonaVO(ArrayList<Persona> personas, Respuesta respuesta){
			this.personas=personas;
			this.respuesta=respuesta;
		}
		
		public ResponsePersonaVO(){
			
		}
		public ArrayList<Persona> getPersonas() {
			return personas;
		}
		public void setPersonas(ArrayList<Persona> personas) {
			this.personas = personas;
		}
		public Respuesta getRespuesta() {
			return respuesta;
		}
		public void setRespuesta(Respuesta respuesta) {
			this.respuesta = respuesta;
		}
		
		
}
