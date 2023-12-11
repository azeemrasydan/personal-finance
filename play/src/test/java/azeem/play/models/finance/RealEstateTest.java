package azeem.play.models.finance;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import azeem.play.finance.RealEstate;
import azeem.play.world.World;

public class RealEstateTest {
    private RealEstate house;
    private World world;

    @Before
    public void setUp() {
        world = new World(
                azeem.play.utility.Date.of("2023-01-01").inLocalDate());

        house = new RealEstate(
                "House",
                300000,
                world);
        house.setAnnualAppreciationRate(6.5);
    }

    @Test
    public void testRealEstateAppreciationRate() {
        world.pass(365).days();
        assertEquals(319500, house.value(), 1e-2);
    }
}
