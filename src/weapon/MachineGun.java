package weapon;

public class MachineGun extends Weapon {
    @Override
    public void shot() {
        super.shot();
        System.out.println("автомата");
    }
}
