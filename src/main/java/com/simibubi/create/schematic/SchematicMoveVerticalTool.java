package com.simibubi.create.schematic;

public class SchematicMoveVerticalTool extends SchematicPlacementToolBase {

	@Override
	public boolean handleMouseWheel(double delta) {

		if (blueprint.deployed) {
			blueprint.moveTo(blueprint.anchor.add(0, delta, 0));
			return true;
		}

		return super.handleMouseWheel(delta);
	}
	
}