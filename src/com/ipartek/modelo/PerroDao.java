package com.ipartek.modelo;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

/**
 * DAO para definir las operaciones de CRUD
 * @author ur00
 *
 */
public interface PerroDao {
	
	/**
	 * lista perros
	 * @return todos los perros, si no existe ninguno ArrayList<Perro> vacio no null
	 */
	ArrayList<Perro> listar();
	
	/**
	 * Recupera el detalle de un Perro
	 * @param id identificador
	 * @return Perro con susa datos o null si no encuentra por su id
	 */
	Perro recuperar(int id);
	
	/**
	 * Crea un nuevo perro y cuando es guardado se le asigan una nueva id
	 * @param p Perro con los datos a guardar
	 * @throws Exception si el nombre del perro ya existe
	 * @return Perro con su id actualizado
	 */
	Perro crear( Perro p ) throws Exception;
	
	
	/**
	 * Modifica un perro
	 * @param p Perro con los datos nuevos
	 * @return Perro modificado
	 * @throws Exception si no encuentra el Perro, o el nombre ya existe
	 */
	Perro modificar(Perro p)throws Exception;
	
	/**
	 * Elimina el Perro gracias a su identificador
	 * @param id identificador
	 * @throws Exception TODO hasta que veamos la bbdd
	 * @return true si elimina, false en caso contrario
	 */
	boolean eliminar( int id ) throws Exception;
	
	

}
