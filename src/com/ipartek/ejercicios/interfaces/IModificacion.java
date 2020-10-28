package com.ipartek.ejercicios.interfaces;

import java.io.Serializable;

public interface IModificacion extends Serializable, Cloneable{
	
	void incremento(int a) throws Exception;

}
