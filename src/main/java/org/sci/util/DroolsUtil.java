package org.sci.util;

import org.kie.api.io.ResourceType;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.KnowledgeBaseFactory;
import org.kie.internal.builder.DecisionTableConfiguration;
import org.kie.internal.builder.DecisionTableInputType;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatelessKnowledgeSession;

public class DroolsUtil {

	
	  
private static String xlsFieName;
	
	public static KnowledgeBase createKnowledgeBaseFromSpreadsheet(String xlsFileName)
	           throws Exception {
	       DecisionTableConfiguration dtconf = KnowledgeBuilderFactory
	               .newDecisionTableConfiguration();
	       dtconf.setInputType(DecisionTableInputType.XLS);

	       KnowledgeBuilder knowledgeBuilder = KnowledgeBuilderFactory
	               .newKnowledgeBuilder();
	       knowledgeBuilder.add(ResourceFactory
	               .newClassPathResource(xlsFileName),
	               ResourceType.DTABLE, dtconf);

	       if (knowledgeBuilder.hasErrors()) {
	           throw new RuntimeException(knowledgeBuilder.getErrors().toString());
	       }       

	       KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
	       knowledgeBase.addKnowledgePackages(knowledgeBuilder
	               .getKnowledgePackages());
	       return knowledgeBase;
	   }
}
