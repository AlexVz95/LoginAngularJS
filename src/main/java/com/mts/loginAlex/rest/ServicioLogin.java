package com.mts.loginAlex.rest;

 
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mts.loginAlex.vo.Persona;
import com.mts.loginAlex.vo.ResponsePersonaVO;
import com.mts.loginAlex.vo.Respuesta;

@Path("/usuario/")
public class ServicioLogin {
	
	ArrayList<Persona> prueba = new ArrayList<Persona>();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Persona getIt(){
		Persona p = new Persona();
		p.setUsuario("Alex");
		p.setPassword("12345");
		return p;
	}
	
	@POST
	@Path("/nombre")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponsePersonaVO getMsg(Persona parametros){
		int cont=0;
		
		prueba.add(new Persona(parametros.getUsuario()+cont,parametros.getPassword()));
		ResponsePersonaVO respuesta = new ResponsePersonaVO();
		System.out.println(parametros.getUsuario());
		System.out.println(parametros.getPassword());
		
		Respuesta mensajeService = new Respuesta();
		
		if(parametros.getUsuario().equals("Alex") && parametros.getPassword().equals("12345")){
			respuesta.setPersonas(prueba);
			mensajeService.setMensajeSuccess("La peticion es correcta");
			mensajeService.setSuccess(true);
			respuesta.setRespuesta(mensajeService);
		}else{
			mensajeService.setMensajeError("La peticion es incorrecta");
			mensajeService.setSuccess(false);
			respuesta.setRespuesta(mensajeService);
		}
		/*
		if("alex".equals("alex")){	
			ArrayList<Persona> testArrayList = new ArrayList<Persona>();
			testArrayList.add(new Persona("Alex","Perez"));
			testArrayList.add(new Persona("Ivan","Perez"));
			testArrayList.add(new Persona("Fer","Perez"));
			respuesta.setPersonas(testArrayList);
			mensajeService.setMensajeSuccess("La peticion es correcta");
			mensajeService.setSuccess(true);
			respuesta.setRespuesta(mensajeService);
			
			
		}else{
			mensajeService.setMensajeError("La peticion es incorrecta");
			mensajeService.setSuccess(false);
			respuesta.setRespuesta(mensajeService);
			
		}*/
			
		
		return respuesta;
	}
	
	
	
	@POST
	@Path("/personas")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Persona postIt(Persona dp){
		Persona respuesta = new Persona();
		System.out.println(dp.getUsuario());
		System.out.println(dp.getPassword());
		
		if(dp.getUsuario().equals("Alex") && dp.getPassword().equals("12345")){
			
			//respuesta.setEstado(true);
		}else{
			//respuesta.setEstado(false);
		}
			
		//System.out.println(respuesta.isEstado());
		
		return respuesta;
		
	}
	
	
	
	
}
