package com.ipartek.modelo;

import com.ipartek.pojo.Persona;

public interface IpersonaDAO extends IDao<Persona> {
	
	Persona recuperarPorDni(String dni);

}
