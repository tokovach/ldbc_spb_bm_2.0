package eu.ldbc.semanticpublishing.templates.editorial;

import java.util.HashMap;

import eu.ldbc.semanticpublishing.endpoint.SparqlQueryConnection.QueryType;
import eu.ldbc.semanticpublishing.properties.Definitions;
import eu.ldbc.semanticpublishing.util.RandomUtil;

public class InsertTrigTemplate extends InsertTemplate {

  public InsertTrigTemplate(
      String contextURI,
      RandomUtil ru,
      HashMap<String, String> queryTemplates,
      Definitions definitions) {
    this(contextURI, ru, queryTemplates, definitions, true, null);
  }

  public InsertTrigTemplate(
      String contextURI,
      RandomUtil ru,
      HashMap<String, String> queryTemplates,
      Definitions definitions,
      boolean initializeCWEntity,
      String[] substitutionParameters) {
    super(contextURI, ru, queryTemplates, definitions, initializeCWEntity, substitutionParameters);
  }

  @Override
  public String getTemplateFileName() {
    return "insert-trig.txt";
  }

  @Override
  public QueryType getTemplateQueryType() {
    return QueryType.INSERT_TRIG;
  }
}
