package com.ipartek.modelo;

import com.ipartek.pojo.Perro;

/**
 * DAO para definir las operaciones de CRUD<br>
 * Fijaros como interferimos la clase generica {@code IDao<P>} por {@code IDao<Perro> }
 * @author ur00
 *
 */
public interface PerroDao extends IDao<Perro>{

}
