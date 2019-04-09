package com.gilbert.randommod.init;

import java.util.ArrayList;
import java.util.List;

import com.gilbert.randommod.blocks.BlockBase;
import com.gilbert.randommod.items.ItemBase;
import com.gilbert.randommod.items.armor.ArmorBase;
import com.gilbert.randommod.items.food.FoodBase;
import com.gilbert.randommod.items.food.FoodEffectBase;
import com.gilbert.randommod.items.tools.ToolAxe;
import com.gilbert.randommod.items.tools.ToolBucket;
import com.gilbert.randommod.items.tools.ToolHoe;
import com.gilbert.randommod.items.tools.ToolPickaxe;
import com.gilbert.randommod.items.tools.ToolSpade;
import com.gilbert.randommod.items.tools.ToolSword;
import com.gilbert.randommod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
public class ModItems
{
	//Material thing
	public static final ToolMaterial MATERIAL_BONE  = EnumHelper.addToolMaterial("material_bone", 2, 131, 4.0F, 2.0F, 5);
	public static final ToolMaterial MATERIAL_EMERALD  = EnumHelper.addToolMaterial("material_emerald", 4, 2351, 9.0F, 4.0F, 25);
	public static final ToolMaterial MATERIAL_AQUA  = EnumHelper.addToolMaterial("material_aqua", 4, 2735, 10.0F, 5.0F, 25);
	public static final ToolMaterial MATERIAL_RED  = EnumHelper.addToolMaterial("material_red", 4, 3532, 12.0F, 8.0F, 30);
	public static final ToolMaterial MATERIAL_ROTAN  = EnumHelper.addToolMaterial("material_rotan", 3, 59, 10.0F, 3.0F, 100);
	public static final ToolMaterial MATERIAL_AMBER = EnumHelper.addToolMaterial("material_amber", 2, 59, 6.0F, 2.0F, 14);

	//Armor Material
	
	public static final ArmorMaterial ARMOR_MATERIAL_BONE = EnumHelper.addArmorMaterial("armor_material_bone",
			Reference.MOD_ID + ":bone", 12, new int[] {0, 3 ,5 , 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_RED = EnumHelper.addArmorMaterial("armor_material_red",
			Reference.MOD_ID + ":red", 25, new int[] {5, 8 ,10 , 6}, 10, SoundEvents.BLOCK_ANVIL_PLACE, 0.0F);
	
//Item things

	 public static final List<Item> ITEMS = new ArrayList<Item>();
	
	 public static final Item RUBY = new ItemBase("ruby");
	 public static final Item MAGNET = new ItemBase("magnet");
	public static final Item DEFORMED_DIAMOND = new ItemBase("deformed_diamond");
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item AMBER = new ItemBase("amber");
	public static final Item ICICLE_ROD = new ItemBase("icicle_rod");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	public static final Item AQUAMARINE = new ItemBase("aquamarine");
	public static final Item STRAY_BONE = new ItemBase("stray_bone");
	public static final Item WITHER_BONE = new ItemBase("wither_bone");
	public static final Item RED_BERYL = new ItemBase("red_beryl");
	
	public static final ItemBucket WOOD_BUCKET = new ToolBucket("wood_bucket", Blocks.AIR);
	public static final ItemBucket WATER_WOOD_BUCKET = new ToolBucket("water_wood_bucket", Blocks.WATER);
	public static final ItemBucket HOLY_WATER_WOOD_BUCKET = new ToolBucket("wood_bucket", ModBlocks.HOLY_WATER_BLOCK);
	
	//Tool thingies
	public static final ItemPickaxe BONE_PICKAXE = new ToolPickaxe("bone_pickaxe", MATERIAL_BONE);
	public static final ItemSword BONE_SWORD = new ToolSword("bone_sword", MATERIAL_BONE);
	public static final ItemAxe BONE_AXE = new ToolAxe("bone_axe", MATERIAL_BONE);
	public static final ItemHoe BONE_HOE = new ToolHoe("bone_hoe", MATERIAL_BONE);
	public static final ItemSpade BONE_SHOVEL = new ToolSpade("bone_shovel", MATERIAL_BONE);
	
	public static final ItemPickaxe EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", MATERIAL_EMERALD);
	public static final ItemSword EMERALD_SWORD = new ToolSword("emerald_sword", MATERIAL_EMERALD);
	public static final ItemAxe EMERALD_AXE = new ToolAxe("emerald_axe", MATERIAL_EMERALD);
	public static final ItemHoe EMERALD_HOE = new ToolHoe("emerald_hoe", MATERIAL_EMERALD);
	public static final ItemSpade EMERALD_SHOVEL = new ToolSpade("emerald_shovel", MATERIAL_EMERALD);
	
	public static final ItemPickaxe AQUA_PICKAXE = new ToolPickaxe("aqua_pickaxe", MATERIAL_AQUA);
	public static final ItemSword AQUA_SWORD = new ToolSword("aqua_sword", MATERIAL_AQUA);
	public static final ItemAxe AQUA_AXE = new ToolAxe("aqua_axe", MATERIAL_AQUA);
	public static final ItemHoe AQUA_HOE = new ToolHoe("aqua_hoe", MATERIAL_AQUA);
	public static final ItemSpade AQUA_SHOVEL = new ToolSpade("aqua_shovel", MATERIAL_AQUA);
	
	public static final ItemPickaxe RED_PICKAXE = new ToolPickaxe("red_pickaxe", MATERIAL_RED);
	public static final ItemSword RED_SWORD = new ToolSword("red_sword", MATERIAL_RED);
	public static final ItemAxe RED_AXE = new ToolAxe("red_axe", MATERIAL_RED);
	public static final ItemHoe RED_HOE = new ToolHoe("red_hoe", MATERIAL_RED);
	public static final ItemSpade RED_SHOVEL = new ToolSpade("red_shovel", MATERIAL_RED);
	
	public static final ItemPickaxe AMBER_PICKAXE = new ToolPickaxe("amber_pickaxe", MATERIAL_AMBER);
	public static final ItemSword AMBER_SWORD = new ToolSword("amber_sword", MATERIAL_AMBER);
	public static final ItemAxe AMBER_AXE = new ToolAxe("amber_axe", MATERIAL_AMBER);
	public static final ItemHoe AMBER_HOE = new ToolHoe("amber_hoe", MATERIAL_AMBER);
	public static final ItemSpade AMBER_SHOVEL = new ToolSpade("amber_shovel", MATERIAL_AMBER);
	
	public static final ItemSword RULER = new ToolSword("ruler", MATERIAL_ROTAN);
	
	//Armor Derps
	public static final ItemArmor BONE_HELMET = new ArmorBase("bone_helmet", ARMOR_MATERIAL_BONE, 1, EntityEquipmentSlot.HEAD);
	public static final ItemArmor BONE_CHESTPLATE = new ArmorBase("bone_chestplate", ARMOR_MATERIAL_BONE, 1, EntityEquipmentSlot.CHEST);
	public static final ItemArmor BONE_LEGGINGS = new ArmorBase("bone_leggings", ARMOR_MATERIAL_BONE, 2, EntityEquipmentSlot.LEGS);
	public static final ItemArmor BONE_BOOTS = new ArmorBase("bone_boots", ARMOR_MATERIAL_BONE, 1, EntityEquipmentSlot.FEET);
	
	public static final ItemArmor RED_HELMET = new ArmorBase("red_helmet", ARMOR_MATERIAL_RED, 1, EntityEquipmentSlot.HEAD);
	public static final ItemArmor RED_CHESTPLATE = new ArmorBase("red_chestplate", ARMOR_MATERIAL_RED, 1, EntityEquipmentSlot.CHEST);
	public static final ItemArmor RED_LEGGINGS = new ArmorBase("red_leggings", ARMOR_MATERIAL_RED, 2, EntityEquipmentSlot.LEGS);
	public static final ItemArmor RED_BOOTS = new ArmorBase("red_boots", ARMOR_MATERIAL_RED, 1, EntityEquipmentSlot.FEET);
	
	//Food!!!
	public static final Item RADISH = new FoodBase("radish", 4, 3.6F, false);
	public static final Item APPLE_IRON = new FoodEffectBase("apple_iron", 8, 8.0F, false, new PotionEffect(MobEffects.RESISTANCE, 1200, 1, false, true));
}
