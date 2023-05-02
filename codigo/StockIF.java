package es.uned.lsi.eped.pract2022_2023;

import es.uned.lsi.eped.DataStructures.SequenceIF;

/**
 * Representa un Stock en el que se indexan valores enteros
 * bajo un indice formado por una cadena de caracteres
 * -----EXOLICACION DE LA CLASE -----
 * - Desde esta clase definimos un conjunto de metodos
 * que pueden ser implementados por cualquier clase que represente un Stock
 * 
 * --> public int retrieveStock(String p);
 * --> updateStock(String p, int u)
 * --> listStock(String prefix)
 */
public interface StockIF {

	/** Devuelve el valor indexado bajo el indice p.
     * @PRE: p != "" 
	 * ------> esta anotacion significa que se espera que el argumento "p"
	 * 			sea una cadena no vacia, que tenga al menos un caracter 
	 * ------> Anotacion como restriccion previa que indica que la operacion
	 * 			solo puede ejecutarse si se cumple esta condicion.
     * Si no existe un valor indexado bajo el indice p,
     * devuelve el valor -1.
	 * 
     */
	public int retrieveStock(String p);
  
    /* Indexa el valor u bajo el indice p.
     * @PRE: p != "" y u >= 0
     * Si ya habia un valor bajo el mismo indice,
     * el nuevo valor substituye al anterior.
     */
	public void updateStock(String p, int u);

	/* Devuelve una secuencia de todos los pares <p,u>
	 * presentes en el stock tales que:
	 * -El valor indexado bajo el índice p es u
	 * -El índice p comienza por la cadena prefix
	 * Además, la secuencia deberá estar ordenada según
	 * el orden alfabético de los productos
	 */
	public SequenceIF<StockPair> listStock(String prefix);
}
