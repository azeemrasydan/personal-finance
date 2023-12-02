package azeem.play.finance;

import azeem.play.world.World;

public class RealEstate extends Asset {

    public RealEstate(String name, double value, World world) {
        super(name, value, AssetType.REAL_ESTATE, world);
    }

    @Override
    public void onDayPassed() {
        
    }

}
