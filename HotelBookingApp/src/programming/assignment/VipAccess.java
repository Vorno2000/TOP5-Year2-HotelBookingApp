package programming.assignment;
/**
 * This abstract class is a representation of VIP options. 
 * Each VIP options has a cost and whether it is selected or not.
 * Set and get methods are created for each variable.
 * This class is the parent class for each VIP option.
 * @author Sukhman Singh & Vaughn Carroll
 */
public abstract class VipAccess {

    protected float cost = 0.0f;
    protected boolean var_isSelected = false;

    public void setCost(float Cost){
        this.cost = Cost;
    }
    public void setIsSelected(boolean isSelected) {
        this.var_isSelected = isSelected;
    }

    public float getCost(){
        return this.cost;
    }

    public boolean getIsSelected(){
        return this.var_isSelected;
    }
}