
package bugModel.results;

/** StoreMovements interface which will be extended by the Results class.
 *  Used to append to chosen data structure or to undo move.
 *	
 * @author Victor Oza
 */
public interface StoreMovements {
    // add appropriate method
    /** Used to add value to Results data structure.
     *
     *  @param movement value to append to data structure
     */
    public void addToList(int movement);
    /** Used to remove last value from data structure.
     *  If no value to remove, a 0 should be appended.
     *
     */
    public void undoLastMove();

} 
