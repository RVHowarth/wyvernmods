package mod.sin.items.caches;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.ItemTemplate;
import com.wurmonline.server.items.ItemTypes;
import com.wurmonline.server.items.Materials;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class TitanCache implements ItemTypes, MiscConstants {
	public static Logger logger = Logger.getLogger(TitanCache.class.getName());
	public static int templateId;
	
	public void createTemplate() throws IOException{
		String name = "titan cache";
		ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.cache.titan");
		itemBuilder.name(name, "titan caches", "A cache of treasures from a titan.");
		itemBuilder.itemTypes(new short[]{
				ItemTypes.ITEM_TYPE_MAGIC,
				ItemTypes.ITEM_TYPE_FULLPRICE,
				ItemTypes.ITEM_TYPE_NOSELLBACK,
				ItemTypes.ITEM_TYPE_ALWAYS_BANKABLE
		});
		itemBuilder.imageNumber((short) 243);
		itemBuilder.behaviourType((short) 1);
		itemBuilder.combatDamage(0);
		itemBuilder.decayTime(Long.MAX_VALUE);
		itemBuilder.dimensions(1, 1, 1);
		itemBuilder.primarySkill((int) NOID);
		itemBuilder.bodySpaces(EMPTY_BYTE_PRIMITIVE_ARRAY);
		itemBuilder.modelName("model.container.giftbox.");
		itemBuilder.difficulty(5.0f);
		itemBuilder.weightGrams(500);
		itemBuilder.material(Materials.MATERIAL_GOLD);
		itemBuilder.value(1000);
		itemBuilder.isTraded(true);
		
		ItemTemplate template = itemBuilder.build();
		templateId = template.getTemplateId();
		logger.info(name+" TemplateID: "+templateId);
	}
}
