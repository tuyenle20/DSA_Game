package Main;

import Entity.NPC_OldMan;
import Object.OBJ_Heart;
import monster.BlueGhost;
import monster.OrangeGhost;
import monster.PinkGhost;
import monster.RedGhost;
import monster.WhiteGhost;

public class AssetSetter {
    GamePanel gp;
    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    } 
    public void setObject() {
        int i = 0;
        
        gp.obj[4] = new OBJ_Heart(gp);
        gp.obj[4].worldX = 29 * gp.tileSize;
        gp.obj[4].worldY = 40 * gp.tileSize;
    }

    public void setNPC()       
    {
        gp.npc[0] = new NPC_OldMan(gp);
        gp.npc[0].worldX = gp.tileSize*21;
        gp.npc[0].worldY = gp.tileSize*21;
    }
    public void setGhost(){

        

        gp.ghost[2] = new PinkGhost(gp);
        gp.ghost[2].worldX =gp.tileSize*23;
        gp.ghost[2].worldY =gp.tileSize*36;
        

        
        

        gp.ghost[4] = new RedGhost(gp);
        gp.ghost[4].worldX =gp.tileSize*16;
        gp.ghost[4].worldY =gp.tileSize*40;
        

        
        

        gp.ghost[7] = new BlueGhost(gp);        // canh giu chia khoa
        gp.ghost[7].worldX =gp.tileSize*21;
        gp.ghost[7].worldY =gp.tileSize*33;
        

        
        

        gp.ghost[10] = new OrangeGhost(gp);
        gp.ghost[10].worldX =gp.tileSize*24;
        gp.ghost[10].worldY =gp.tileSize*47;
        


        gp.ghost[13] = new WhiteGhost(gp);
        gp.ghost[13].worldX =gp.tileSize*9;
        gp.ghost[13].worldY =gp.tileSize*2;

        
     
    
}       
}
    


