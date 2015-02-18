package bugModel.bug;

/** AllDirectionsBug interface which will be extended by the Bug class.
 *  Used to move the bug in various directions aswell as undo the move.
 *	
 * @author Victor Oza
 */
public interface AllDirectionsBug {

    // methods to move right, left, up, down
    /** MoveRight method to append 1 to result storage container 
     */
    public void moveRight();
    /** MoveLeft method to append 2 to result storage container 
     */
    public void moveLeft();
    /** MoveUp method to append 3 to result storage container 
     */
    public void moveUp();
    /** MoveDown method to append 4 to result storage container 
     */
    public void moveDown();
    /** Method used to remove last movement
     */
    public void undoPrev();

}
