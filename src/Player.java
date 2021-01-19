import weapon.*;

public class Player {
    private Weapon[] weaponSlot;
    public Player(){
        weaponSlot = new Weapon[]{
                new MachineGun(),
                new Pistol(),
                new RPG(),
                new Slingshot(),
                new WaterPistol()
        };
    }
    public int getSlotCount(){
        return weaponSlot.length;
    }
    public void shotWithWeapon(int slot){
        try {
            Weapon weapon = weaponSlot[slot];
            weapon.shot();
        } catch (Exception e) {
            System.out.println("Выбранный слот пустой");
        }

    }
}
