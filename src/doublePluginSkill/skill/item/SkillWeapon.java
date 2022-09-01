package doublePluginSkill.skill.item;

import doublePlugin.entity.player.NewPlayer;
import doublePlugin.item.ItemEvent;
import doublePluginSkill.skill.Skill;

public abstract class SkillWeapon extends ItemEvent {

	@Override
	public boolean dropItem(NewPlayer player) {
		if(dropItemSkill(player) != null) {
			dropItemSkill(player).useSkill(player);
		}
		
		return true;
	}

	@Override
	public boolean leftClick(NewPlayer player) {
		if(leftClickSkill(player) != null) {
			leftClickSkill(player).useSkill(player);
		}
		
		return true;
	}

	@Override
	public boolean rightClick(NewPlayer player) {
		if(rightClickSkill(player) != null) {
			rightClickSkill(player).useSkill(player);
		}
		
		return true;
	}

	@Override
	public boolean shiftDropItem(NewPlayer player) {
		if(shiftDropItemSkill(player) != null) {
			shiftDropItemSkill(player).useSkill(player);
		}
		
		return true;
	}

	@Override
	public boolean shiftLeftClick(NewPlayer player) {
		if(shiftLeftClickSkill(player) != null) {
			shiftLeftClickSkill(player).useSkill(player);
		}
		
		return true;
	}

	@Override
	public boolean shiftRightClick(NewPlayer player) {
		if(shiftRightClickSkill(player) != null) {
			shiftRightClickSkill(player).useSkill(player);
		}
		
		return true;
	}

	@Override
	public boolean shiftSwapHand(NewPlayer player) {
		if(shiftSwapHandSkill(player) != null) {
			shiftSwapHandSkill(player).useSkill(player);
		}
		
		return true;
	}

	@Override
	public boolean swapHand(NewPlayer player) {
		if(swapHandSkill(player) != null) {
			swapHandSkill(player).useSkill(player);
		}
		
		return true;
	}
	
	public abstract Skill leftClickSkill(NewPlayer player);
	
    public abstract Skill rightClickSkill(NewPlayer player);

    public abstract Skill swapHandSkill(NewPlayer player);

    public abstract Skill dropItemSkill(NewPlayer player);


    public abstract Skill shiftLeftClickSkill(NewPlayer player);

    public abstract Skill shiftRightClickSkill(NewPlayer player);

    public abstract Skill shiftSwapHandSkill(NewPlayer player);

    public abstract Skill shiftDropItemSkill(NewPlayer player);
	
}
