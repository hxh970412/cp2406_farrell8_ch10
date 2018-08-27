public class PetSold extends ItemSold{
    private boolean isVaccinated;
    private boolean isNeutered;
    private boolean isHousebroken;

    public boolean getIsHousebroken() {
        return isHousebroken;
    }

    public boolean getIsNeutered() {
        return isNeutered;
    }

    public boolean getIsVaccinated() {
        return isVaccinated;
    }
    public void setIsVaccinated(boolean isVac)
    {
        isVaccinated = isVac;
    }
    public void setIsNeutered(boolean isNeu)
    {
        isNeutered = isNeu;
    }
    public void setIsHousebroken(boolean isHo)
    {
        isHousebroken = isHo;
    }
}
