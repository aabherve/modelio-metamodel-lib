package org.modelio.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Metamodel of Modleio 3.4.1 Tool
 * Class generated with  ModelioMetaGenerator 1.0.0 Tool
 *
 * @author Antonin Abherv?
 */
public class MMetamodel {
    private List<MPackage> mPackages;

    private Map<String, MDataType> mBaseTypes;

    private Map<String, MClass> mClass;

    public MMetamodel() {
        this.mBaseTypes = new HashMap<>();
        this.mPackages = new ArrayList<MPackage>();
        this.mClass = new HashMap<>();
        initBaseTypes();
        initEnum();
        initClass();
        initGeneralizations();
        initDependencys();
    }

    private void initBaseTypes() {
        this.mBaseTypes.put("string", new MDataType("00000004-0000-000d-0000-000000000000", "string", "String"));
        this.mBaseTypes.put("short",new MDataType("00000004-0000-0012-0000-000000000000", "short", "Short"));
        this.mBaseTypes.put("long",new MDataType("00000004-0000-0011-0000-000000000000", "long", "Long"));
        this.mBaseTypes.put("integer",new MDataType("00000004-0000-0009-0000-000000000000", "integer", "Integer"));
        this.mBaseTypes.put("float",new MDataType("00000004-0000-000b-0000-000000000000", "float", "Float"));
        this.mBaseTypes.put("double",new MDataType("00000004-0000-0010-0000-000000000000", "double", "Double"));
        this.mBaseTypes.put("date",new MDataType("00000004-0000-0014-0000-000000000000", "date", "Date"));
        this.mBaseTypes.put("char",new MDataType("00000004-0000-0007-0000-000000000000", "char", "Character"));
        this.mBaseTypes.put("byte",new MDataType("00000004-0000-0013-0000-000000000000", "byte", "Byte"));
        this.mBaseTypes.put("boolean",new MDataType("00000004-0000-0005-0000-000000000000", "boolean", "Boolean"));
    }

    private void initClass() {
        // ########### Package / Class / Attributs ###########

        //##### Package analyst#####
        MPackage id_00d00f24000001a90000000000000000 = new MPackage("00d00f24-0000-01a9-0000-000000000000","analyst","00d00f24-0000-01a9-0000-000000000000.exml");
        this.mPackages.add(id_00d00f24000001a90000000000000000);
        //## class AnalystItem ##

        MClass id_47b29e94ef894e19b7a979c93ef077b9 = new MClass("47b29e94-ef89-4e19-b7a9-79c93ef077b9","AnalystItem","47b29e94-ef89-4e19-b7a9-79c93ef077b9.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_47b29e94ef894e19b7a979c93ef077b9);
        this.mClass.put("AnalystItem",id_47b29e94ef894e19b7a979c93ef077b9);
        // attribute Definition

        MAttribute id_00080b0800001bd90000000000000000 = new MAttribute("00080b08-0000-1bd9-0000-000000000000","Definition","47b29e94-ef89-4e19-b7a9-79c93ef077b9.exml",this.mBaseTypes.get("string"),false,true,false);
        id_47b29e94ef894e19b7a979c93ef077b9.getMAttributes().add(id_00080b0800001bd90000000000000000);



        //## class AnalystElement ##

        MClass id_00080b08000018640000000000000000 = new MClass("00080b08-0000-1864-0000-000000000000","AnalystElement","00080b08-0000-1864-0000-000000000000.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_00080b08000018640000000000000000);
        this.mClass.put("AnalystElement",id_00080b08000018640000000000000000);
        // attribute Version

        MAttribute id_7ed667c3bea142fbbfd02893e190094f = new MAttribute("7ed667c3-bea1-42fb-bfd0-2893e190094f","Version","00080b08-0000-1864-0000-000000000000.exml",this.mBaseTypes.get("integer"),false,true,false);
        id_00080b08000018640000000000000000.getMAttributes().add(id_7ed667c3bea142fbbfd02893e190094f);



        //## class AnalystContainer ##

        MClass id_00080b08000018660000000000000000 = new MClass("00080b08-0000-1866-0000-000000000000","AnalystContainer","00080b08-0000-1866-0000-000000000000.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_00080b08000018660000000000000000);
        this.mClass.put("AnalystContainer",id_00080b08000018660000000000000000);

        //## class AnalystProject ##

        MClass id_00080b0800001a250000000000000000 = new MClass("00080b08-0000-1a25-0000-000000000000","AnalystProject","00080b08-0000-1a25-0000-000000000000.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_00080b0800001a250000000000000000);
        this.mClass.put("AnalystProject",id_00080b0800001a250000000000000000);

        //## class AnalystPropertyTable ##

        MClass id_00080b08000018710000000000000000 = new MClass("00080b08-0000-1871-0000-000000000000","AnalystPropertyTable","00080b08-0000-1871-0000-000000000000.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_00080b08000018710000000000000000);
        this.mClass.put("AnalystPropertyTable",id_00080b08000018710000000000000000);

        //## class BusinessRule ##

        MClass id_4fe22bcc34a64dc59531114b59468684 = new MClass("4fe22bcc-34a6-4dc5-9531-114b59468684","BusinessRule","4fe22bcc-34a6-4dc5-9531-114b59468684.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_4fe22bcc34a64dc59531114b59468684);
        this.mClass.put("BusinessRule",id_4fe22bcc34a64dc59531114b59468684);

        //## class BusinessRuleContainer ##

        MClass id_57c3170a72a74a959eaf8e68716f7961 = new MClass("57c3170a-72a7-4a95-9eaf-8e68716f7961","BusinessRuleContainer","57c3170a-72a7-4a95-9eaf-8e68716f7961.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_57c3170a72a74a959eaf8e68716f7961);
        this.mClass.put("BusinessRuleContainer",id_57c3170a72a74a959eaf8e68716f7961);

        //## class Dictionary ##

        MClass id_00080b0800001cb50000000000000000 = new MClass("00080b08-0000-1cb5-0000-000000000000","Dictionary","00080b08-0000-1cb5-0000-000000000000.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_00080b0800001cb50000000000000000);
        this.mClass.put("Dictionary",id_00080b0800001cb50000000000000000);

        //## class Goal ##

        MClass id_103091ba93194becbb7515a6498e406c = new MClass("103091ba-9319-4bec-bb75-15a6498e406c","Goal","103091ba-9319-4bec-bb75-15a6498e406c.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_103091ba93194becbb7515a6498e406c);
        this.mClass.put("Goal",id_103091ba93194becbb7515a6498e406c);

        //## class GoalContainer ##

        MClass id_78858b2bea474da9acefa155df06e288 = new MClass("78858b2b-ea47-4da9-acef-a155df06e288","GoalContainer","78858b2b-ea47-4da9-acef-a155df06e288.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_78858b2bea474da9acefa155df06e288);
        this.mClass.put("GoalContainer",id_78858b2bea474da9acefa155df06e288);

        //## class PropertyContainer ##

        MClass id_e5d49ec0a8ef11deade4001ec947ccaf = new MClass("e5d49ec0-a8ef-11de-ade4-001ec947ccaf","PropertyContainer","e5d49ec0-a8ef-11de-ade4-001ec947ccaf.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_e5d49ec0a8ef11deade4001ec947ccaf);
        this.mClass.put("PropertyContainer",id_e5d49ec0a8ef11deade4001ec947ccaf);

        //## class Requirement ##

        MClass id_8269206e2e22430bbebaf1d662083a42 = new MClass("8269206e-2e22-430b-beba-f1d662083a42","Requirement","8269206e-2e22-430b-beba-f1d662083a42.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_8269206e2e22430bbebaf1d662083a42);
        this.mClass.put("Requirement",id_8269206e2e22430bbebaf1d662083a42);

        //## class RequirementContainer ##

        MClass id_8a1c80036a27413f9904961ec118f445 = new MClass("8a1c8003-6a27-413f-9904-961ec118f445","RequirementContainer","8a1c8003-6a27-413f-9904-961ec118f445.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_8a1c80036a27413f9904961ec118f445);
        this.mClass.put("RequirementContainer",id_8a1c80036a27413f9904961ec118f445);

        //## class Term ##

        MClass id_00080b0800001cb60000000000000000 = new MClass("00080b08-0000-1cb6-0000-000000000000","Term","00080b08-0000-1cb6-0000-000000000000.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_00080b0800001cb60000000000000000);
        this.mClass.put("Term",id_00080b0800001cb60000000000000000);

        //## class GenericAnalystContainer ##

        MClass id_f2b578c37b79410a835d441abf35d4c4 = new MClass("f2b578c3-7b79-410a-835d-441abf35d4c4","GenericAnalystContainer","f2b578c3-7b79-410a-835d-441abf35d4c4.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_f2b578c37b79410a835d441abf35d4c4);
        this.mClass.put("GenericAnalystContainer",id_f2b578c37b79410a835d441abf35d4c4);

        //## class GenericAnalystElement ##

        MClass id_779a15936a1f448ea793bf669f699add = new MClass("779a1593-6a1f-448e-a793-bf669f699add","GenericAnalystElement","779a1593-6a1f-448e-a793-bf669f699add.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_779a15936a1f448ea793bf669f699add);
        this.mClass.put("GenericAnalystElement",id_779a15936a1f448ea793bf669f699add);

        //## class RiskContainer ##

        MClass id_d613667b471c4317beff9379c7e04920 = new MClass("d613667b-471c-4317-beff-9379c7e04920","RiskContainer","d613667b-471c-4317-beff-9379c7e04920.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_d613667b471c4317beff9379c7e04920);
        this.mClass.put("RiskContainer",id_d613667b471c4317beff9379c7e04920);

        //## class Risk ##

        MClass id_f26541d4f1f74e2caf0eb53375680953 = new MClass("f26541d4-f1f7-4e2c-af0e-b53375680953","Risk","f26541d4-f1f7-4e2c-af0e-b53375680953.exml");
        id_00d00f24000001a90000000000000000.getMClass().add(id_f26541d4f1f74e2caf0eb53375680953);
        this.mClass.put("Risk",id_f26541d4f1f74e2caf0eb53375680953);



        //##### Package bpmn#####
        MPackage id_9730153a082911e09123001ec947ccaf = new MPackage("9730153a-0829-11e0-9123-001ec947ccaf","bpmn","9730153a-0829-11e0-9123-001ec947ccaf.exml");
        this.mPackages.add(id_9730153a082911e09123001ec947ccaf);
        //##### Package processCollaboration#####
        MPackage id_7f73f20b18d611e09cf7001ec947ccaf = new MPackage("7f73f20b-18d6-11e0-9cf7-001ec947ccaf","processCollaboration","7f73f20b-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_9730153a082911e09123001ec947ccaf.getMPackages().add(id_7f73f20b18d611e09cf7001ec947ccaf);
        //## class BpmnCollaboration ##

        MClass id_7f76549418d611e09cf7001ec947ccaf = new MClass("7f765494-18d6-11e0-9cf7-001ec947ccaf","BpmnCollaboration","7f765494-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20b18d611e09cf7001ec947ccaf.getMClass().add(id_7f76549418d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnCollaboration",id_7f76549418d611e09cf7001ec947ccaf);
        // attribute IsClosed

        MAttribute id_7f7654d818d611e09cf7001ec947ccaf = new MAttribute("7f7654d8-18d6-11e0-9cf7-001ec947ccaf","IsClosed","7f765494-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f76549418d611e09cf7001ec947ccaf.getMAttributes().add(id_7f7654d818d611e09cf7001ec947ccaf);



        //## class BpmnLane ##

        MClass id_7f76547b18d611e09cf7001ec947ccaf = new MClass("7f76547b-18d6-11e0-9cf7-001ec947ccaf","BpmnLane","7f76547b-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20b18d611e09cf7001ec947ccaf.getMClass().add(id_7f76547b18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnLane",id_7f76547b18d611e09cf7001ec947ccaf);

        //## class BpmnLaneSet ##

        MClass id_7f76547c18d611e09cf7001ec947ccaf = new MClass("7f76547c-18d6-11e0-9cf7-001ec947ccaf","BpmnLaneSet","7f76547c-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20b18d611e09cf7001ec947ccaf.getMClass().add(id_7f76547c18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnLaneSet",id_7f76547c18d611e09cf7001ec947ccaf);

        //## class BpmnParticipant ##

        MClass id_7f76547d18d611e09cf7001ec947ccaf = new MClass("7f76547d-18d6-11e0-9cf7-001ec947ccaf","BpmnParticipant","7f76547d-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20b18d611e09cf7001ec947ccaf.getMClass().add(id_7f76547d18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnParticipant",id_7f76547d18d611e09cf7001ec947ccaf);
        // attribute MultiplicityMin

        MAttribute id_7f7654d518d611e09cf7001ec947ccaf = new MAttribute("7f7654d5-18d6-11e0-9cf7-001ec947ccaf","MultiplicityMin","7f76547d-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("integer"),false,true,false);
        id_7f76547d18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f7654d518d611e09cf7001ec947ccaf);


        // attribute MultiplicityMax

        MAttribute id_7f7654fc18d611e09cf7001ec947ccaf = new MAttribute("7f7654fc-18d6-11e0-9cf7-001ec947ccaf","MultiplicityMax","7f76547d-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("integer"),false,true,false);
        id_7f76547d18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f7654fc18d611e09cf7001ec947ccaf);



        //## class BpmnProcess ##

        MClass id_7f76547e18d611e09cf7001ec947ccaf = new MClass("7f76547e-18d6-11e0-9cf7-001ec947ccaf","BpmnProcess","7f76547e-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20b18d611e09cf7001ec947ccaf.getMClass().add(id_7f76547e18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnProcess",id_7f76547e18d611e09cf7001ec947ccaf);
        // attribute ProcessType

        MAttribute id_7f76553b18d611e09cf7001ec947ccaf = new MAttribute("7f76553b-18d6-11e0-9cf7-001ec947ccaf","ProcessType","7f76547e-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("BpmnProcessType"),false,true,false);
        id_7f76547e18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f76553b18d611e09cf7001ec947ccaf);


        // attribute IsClosed

        MAttribute id_7f76553c18d611e09cf7001ec947ccaf = new MAttribute("7f76553c-18d6-11e0-9cf7-001ec947ccaf","IsClosed","7f76547e-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f76547e18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f76553c18d611e09cf7001ec947ccaf);


        // attribute IsExecutable

        MAttribute id_16336e63198011e09cf7001ec947ccaf = new MAttribute("16336e63-1980-11e0-9cf7-001ec947ccaf","IsExecutable","7f76547e-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("OptionalBoolean"),false,true,false);
        id_7f76547e18d611e09cf7001ec947ccaf.getMAttributes().add(id_16336e63198011e09cf7001ec947ccaf);





        //##### Package rootElements#####
        MPackage id_7f73f20c18d611e09cf7001ec947ccaf = new MPackage("7f73f20c-18d6-11e0-9cf7-001ec947ccaf","rootElements","7f73f20c-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_9730153a082911e09123001ec947ccaf.getMPackages().add(id_7f73f20c18d611e09cf7001ec947ccaf);
        //## class BpmnAssociation ##

        MClass id_7f76547018d611e09cf7001ec947ccaf = new MClass("7f765470-18d6-11e0-9cf7-001ec947ccaf","BpmnAssociation","7f765470-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20c18d611e09cf7001ec947ccaf.getMClass().add(id_7f76547018d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnAssociation",id_7f76547018d611e09cf7001ec947ccaf);
        // attribute AssociationDirection

        MAttribute id_7f76552918d611e09cf7001ec947ccaf = new MAttribute("7f765529-18d6-11e0-9cf7-001ec947ccaf","AssociationDirection","7f765470-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("BpmnAssociationDirection"),false,true,false);
        id_7f76547018d611e09cf7001ec947ccaf.getMAttributes().add(id_7f76552918d611e09cf7001ec947ccaf);



        //## class BpmnBaseElement ##

        MClass id_7f76547118d611e09cf7001ec947ccaf = new MClass("7f765471-18d6-11e0-9cf7-001ec947ccaf","BpmnBaseElement","7f765471-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20c18d611e09cf7001ec947ccaf.getMClass().add(id_7f76547118d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnBaseElement",id_7f76547118d611e09cf7001ec947ccaf);

        //## class BpmnArtifact ##

        MClass id_7f76547218d611e09cf7001ec947ccaf = new MClass("7f765472-18d6-11e0-9cf7-001ec947ccaf","BpmnArtifact","7f765472-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20c18d611e09cf7001ec947ccaf.getMClass().add(id_7f76547218d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnArtifact",id_7f76547218d611e09cf7001ec947ccaf);

        //## class BpmnFlowElement ##

        MClass id_7f76549818d611e09cf7001ec947ccaf = new MClass("7f765498-18d6-11e0-9cf7-001ec947ccaf","BpmnFlowElement","7f765498-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20c18d611e09cf7001ec947ccaf.getMClass().add(id_7f76549818d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnFlowElement",id_7f76549818d611e09cf7001ec947ccaf);

        //## class BpmnFlowNode ##

        MClass id_7f76549918d611e09cf7001ec947ccaf = new MClass("7f765499-18d6-11e0-9cf7-001ec947ccaf","BpmnFlowNode","7f765499-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20c18d611e09cf7001ec947ccaf.getMClass().add(id_7f76549918d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnFlowNode",id_7f76549918d611e09cf7001ec947ccaf);

        //## class BpmnGroup ##

        MClass id_7f76549a18d611e09cf7001ec947ccaf = new MClass("7f76549a-18d6-11e0-9cf7-001ec947ccaf","BpmnGroup","7f76549a-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20c18d611e09cf7001ec947ccaf.getMClass().add(id_7f76549a18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnGroup",id_7f76549a18d611e09cf7001ec947ccaf);
        // attribute Category

        MAttribute id_7f78b73118d611e09cf7001ec947ccaf = new MAttribute("7f78b731-18d6-11e0-9cf7-001ec947ccaf","Category","7f76549a-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f76549a18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b73118d611e09cf7001ec947ccaf);



        //## class BpmnRootElement ##

        MClass id_7f76549b18d611e09cf7001ec947ccaf = new MClass("7f76549b-18d6-11e0-9cf7-001ec947ccaf","BpmnRootElement","7f76549b-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20c18d611e09cf7001ec947ccaf.getMClass().add(id_7f76549b18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnRootElement",id_7f76549b18d611e09cf7001ec947ccaf);

        //## class BpmnBehavior ##

        MClass id_7f76549c18d611e09cf7001ec947ccaf = new MClass("7f76549c-18d6-11e0-9cf7-001ec947ccaf","BpmnBehavior","7f76549c-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20c18d611e09cf7001ec947ccaf.getMClass().add(id_7f76549c18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnBehavior",id_7f76549c18d611e09cf7001ec947ccaf);



        //##### Package flows#####
        MPackage id_7f73f20d18d611e09cf7001ec947ccaf = new MPackage("7f73f20d-18d6-11e0-9cf7-001ec947ccaf","flows","7f73f20d-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_9730153a082911e09123001ec947ccaf.getMPackages().add(id_7f73f20d18d611e09cf7001ec947ccaf);
        //## class BpmnMessage ##

        MClass id_7f76548f18d611e09cf7001ec947ccaf = new MClass("7f76548f-18d6-11e0-9cf7-001ec947ccaf","BpmnMessage","7f76548f-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20d18d611e09cf7001ec947ccaf.getMClass().add(id_7f76548f18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnMessage",id_7f76548f18d611e09cf7001ec947ccaf);

        //## class BpmnMessageFlow ##

        MClass id_7f76549018d611e09cf7001ec947ccaf = new MClass("7f765490-18d6-11e0-9cf7-001ec947ccaf","BpmnMessageFlow","7f765490-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20d18d611e09cf7001ec947ccaf.getMClass().add(id_7f76549018d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnMessageFlow",id_7f76549018d611e09cf7001ec947ccaf);

        //## class BpmnSequenceFlow ##

        MClass id_7f76549118d611e09cf7001ec947ccaf = new MClass("7f765491-18d6-11e0-9cf7-001ec947ccaf","BpmnSequenceFlow","7f765491-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20d18d611e09cf7001ec947ccaf.getMClass().add(id_7f76549118d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnSequenceFlow",id_7f76549118d611e09cf7001ec947ccaf);
        // attribute IsImmediate

        MAttribute id_7f78b77c18d611e09cf7001ec947ccaf = new MAttribute("7f78b77c-18d6-11e0-9cf7-001ec947ccaf","IsImmediate","7f765491-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f76549118d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b77c18d611e09cf7001ec947ccaf);


        // attribute ConditionExpression

        MAttribute id_7f78b73518d611e09cf7001ec947ccaf = new MAttribute("7f78b735-18d6-11e0-9cf7-001ec947ccaf","ConditionExpression","7f765491-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f76549118d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b73518d611e09cf7001ec947ccaf);





        //##### Package activities#####
        MPackage id_7f73f20e18d611e09cf7001ec947ccaf = new MPackage("7f73f20e-18d6-11e0-9cf7-001ec947ccaf","activities","7f73f20e-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_9730153a082911e09123001ec947ccaf.getMPackages().add(id_7f73f20e18d611e09cf7001ec947ccaf);
        //## class BpmnActivity ##

        MClass id_7f76548818d611e09cf7001ec947ccaf = new MClass("7f765488-18d6-11e0-9cf7-001ec947ccaf","BpmnActivity","7f765488-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f76548818d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnActivity",id_7f76548818d611e09cf7001ec947ccaf);
        // attribute IsForCompensation

        MAttribute id_7f78b77b18d611e09cf7001ec947ccaf = new MAttribute("7f78b77b-18d6-11e0-9cf7-001ec947ccaf","IsForCompensation","7f765488-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f76548818d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b77b18d611e09cf7001ec947ccaf);


        // attribute StartQuantity

        MAttribute id_7f78b78218d611e09cf7001ec947ccaf = new MAttribute("7f78b782-18d6-11e0-9cf7-001ec947ccaf","StartQuantity","7f765488-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("integer"),false,true,false);
        id_7f76548818d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b78218d611e09cf7001ec947ccaf);


        // attribute CompletionQuantity

        MAttribute id_7f78b78318d611e09cf7001ec947ccaf = new MAttribute("7f78b783-18d6-11e0-9cf7-001ec947ccaf","CompletionQuantity","7f765488-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("integer"),false,true,false);
        id_7f76548818d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b78318d611e09cf7001ec947ccaf);



        //## class BpmnAdHocSubProcess ##

        MClass id_7f76548a18d611e09cf7001ec947ccaf = new MClass("7f76548a-18d6-11e0-9cf7-001ec947ccaf","BpmnAdHocSubProcess","7f76548a-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f76548a18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnAdHocSubProcess",id_7f76548a18d611e09cf7001ec947ccaf);
        // attribute Ordering

        MAttribute id_7f78b76518d611e09cf7001ec947ccaf = new MAttribute("7f78b765-18d6-11e0-9cf7-001ec947ccaf","Ordering","7f76548a-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("AdHocOrdering"),false,true,false);
        id_7f76548a18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b76518d611e09cf7001ec947ccaf);


        // attribute CancelRemainingInstances

        MAttribute id_7f78b76618d611e09cf7001ec947ccaf = new MAttribute("7f78b766-18d6-11e0-9cf7-001ec947ccaf","CancelRemainingInstances","7f76548a-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f76548a18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b76618d611e09cf7001ec947ccaf);


        // attribute CompletionCondition

        MAttribute id_7f78b76718d611e09cf7001ec947ccaf = new MAttribute("7f78b767-18d6-11e0-9cf7-001ec947ccaf","CompletionCondition","7f76548a-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f76548a18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b76718d611e09cf7001ec947ccaf);



        //## class BpmnBusinessRuleTask ##

        MClass id_7f76548b18d611e09cf7001ec947ccaf = new MClass("7f76548b-18d6-11e0-9cf7-001ec947ccaf","BpmnBusinessRuleTask","7f76548b-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f76548b18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnBusinessRuleTask",id_7f76548b18d611e09cf7001ec947ccaf);

        //## class BpmnCallActivity ##

        MClass id_7f76548c18d611e09cf7001ec947ccaf = new MClass("7f76548c-18d6-11e0-9cf7-001ec947ccaf","BpmnCallActivity","7f76548c-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f76548c18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnCallActivity",id_7f76548c18d611e09cf7001ec947ccaf);

        //## class BpmnComplexBehaviorDefinition ##

        MClass id_7f76548d18d611e09cf7001ec947ccaf = new MClass("7f76548d-18d6-11e0-9cf7-001ec947ccaf","BpmnComplexBehaviorDefinition","7f76548d-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f76548d18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnComplexBehaviorDefinition",id_7f76548d18d611e09cf7001ec947ccaf);
        // attribute Condition

        MAttribute id_7f78b7a418d611e09cf7001ec947ccaf = new MAttribute("7f78b7a4-18d6-11e0-9cf7-001ec947ccaf","Condition","7f76548d-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f76548d18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7a418d611e09cf7001ec947ccaf);



        //## class BpmnLoopCharacteristics ##

        MClass id_7f76548e18d611e09cf7001ec947ccaf = new MClass("7f76548e-18d6-11e0-9cf7-001ec947ccaf","BpmnLoopCharacteristics","7f76548e-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f76548e18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnLoopCharacteristics",id_7f76548e18d611e09cf7001ec947ccaf);

        //## class BpmnManualTask ##

        MClass id_7f76547418d611e09cf7001ec947ccaf = new MClass("7f765474-18d6-11e0-9cf7-001ec947ccaf","BpmnManualTask","7f765474-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f76547418d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnManualTask",id_7f76547418d611e09cf7001ec947ccaf);

        //## class BpmnMultiInstanceLoopCharacteristics ##

        MClass id_7f76547618d611e09cf7001ec947ccaf = new MClass("7f765476-18d6-11e0-9cf7-001ec947ccaf","BpmnMultiInstanceLoopCharacteristics","7f765476-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f76547618d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnMultiInstanceLoopCharacteristics",id_7f76547618d611e09cf7001ec947ccaf);
        // attribute IsSequencial

        MAttribute id_7f78b76018d611e09cf7001ec947ccaf = new MAttribute("7f78b760-18d6-11e0-9cf7-001ec947ccaf","IsSequencial","7f765476-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f76547618d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b76018d611e09cf7001ec947ccaf);


        // attribute Behavior

        MAttribute id_7f78b76118d611e09cf7001ec947ccaf = new MAttribute("7f78b761-18d6-11e0-9cf7-001ec947ccaf","Behavior","7f765476-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("MultiInstanceBehavior"),false,true,false);
        id_7f76547618d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b76118d611e09cf7001ec947ccaf);


        // attribute LoopCardinality

        MAttribute id_7f78b7b318d611e09cf7001ec947ccaf = new MAttribute("7f78b7b3-18d6-11e0-9cf7-001ec947ccaf","LoopCardinality","7f765476-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f76547618d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7b318d611e09cf7001ec947ccaf);


        // attribute CompletionCondition

        MAttribute id_7f78b7b418d611e09cf7001ec947ccaf = new MAttribute("7f78b7b4-18d6-11e0-9cf7-001ec947ccaf","CompletionCondition","7f765476-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f76547618d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7b418d611e09cf7001ec947ccaf);



        //## class BpmnReceiveTask ##

        MClass id_7f76547718d611e09cf7001ec947ccaf = new MClass("7f765477-18d6-11e0-9cf7-001ec947ccaf","BpmnReceiveTask","7f765477-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f76547718d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnReceiveTask",id_7f76547718d611e09cf7001ec947ccaf);
        // attribute Implementation

        MAttribute id_7f78b79918d611e09cf7001ec947ccaf = new MAttribute("7f78b799-18d6-11e0-9cf7-001ec947ccaf","Implementation","7f765477-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f76547718d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b79918d611e09cf7001ec947ccaf);


        // attribute Instanciate

        MAttribute id_7f78b7c018d611e09cf7001ec947ccaf = new MAttribute("7f78b7c0-18d6-11e0-9cf7-001ec947ccaf","Instanciate","7f765477-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f76547718d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7c018d611e09cf7001ec947ccaf);



        //## class BpmnScriptTask ##

        MClass id_7f76547818d611e09cf7001ec947ccaf = new MClass("7f765478-18d6-11e0-9cf7-001ec947ccaf","BpmnScriptTask","7f765478-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f76547818d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnScriptTask",id_7f76547818d611e09cf7001ec947ccaf);
        // attribute ScriptLanguage

        MAttribute id_7f76551618d611e09cf7001ec947ccaf = new MAttribute("7f765516-18d6-11e0-9cf7-001ec947ccaf","ScriptLanguage","7f765478-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f76547818d611e09cf7001ec947ccaf.getMAttributes().add(id_7f76551618d611e09cf7001ec947ccaf);


        // attribute Script

        MAttribute id_7f78b74518d611e09cf7001ec947ccaf = new MAttribute("7f78b745-18d6-11e0-9cf7-001ec947ccaf","Script","7f765478-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f76547818d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b74518d611e09cf7001ec947ccaf);



        //## class BpmnSendTask ##

        MClass id_7f76547918d611e09cf7001ec947ccaf = new MClass("7f765479-18d6-11e0-9cf7-001ec947ccaf","BpmnSendTask","7f765479-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f76547918d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnSendTask",id_7f76547918d611e09cf7001ec947ccaf);
        // attribute Implementation

        MAttribute id_7f78b78118d611e09cf7001ec947ccaf = new MAttribute("7f78b781-18d6-11e0-9cf7-001ec947ccaf","Implementation","7f765479-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f76547918d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b78118d611e09cf7001ec947ccaf);



        //## class BpmnServiceTask ##

        MClass id_7f76547a18d611e09cf7001ec947ccaf = new MClass("7f76547a-18d6-11e0-9cf7-001ec947ccaf","BpmnServiceTask","7f76547a-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f76547a18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnServiceTask",id_7f76547a18d611e09cf7001ec947ccaf);
        // attribute Implementation

        MAttribute id_7f78b7b918d611e09cf7001ec947ccaf = new MAttribute("7f78b7b9-18d6-11e0-9cf7-001ec947ccaf","Implementation","7f76547a-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f76547a18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7b918d611e09cf7001ec947ccaf);



        //## class BpmnStandardLoopCharacteristics ##

        MClass id_7f73f21f18d611e09cf7001ec947ccaf = new MClass("7f73f21f-18d6-11e0-9cf7-001ec947ccaf","BpmnStandardLoopCharacteristics","7f73f21f-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f73f21f18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnStandardLoopCharacteristics",id_7f73f21f18d611e09cf7001ec947ccaf);
        // attribute TestBefore

        MAttribute id_7f78b7bb18d611e09cf7001ec947ccaf = new MAttribute("7f78b7bb-18d6-11e0-9cf7-001ec947ccaf","TestBefore","7f73f21f-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f73f21f18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7bb18d611e09cf7001ec947ccaf);


        // attribute LoopCondition

        MAttribute id_7f78b7be18d611e09cf7001ec947ccaf = new MAttribute("7f78b7be-18d6-11e0-9cf7-001ec947ccaf","LoopCondition","7f73f21f-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f73f21f18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7be18d611e09cf7001ec947ccaf);


        // attribute LoopMaximum

        MAttribute id_7f78b7bf18d611e09cf7001ec947ccaf = new MAttribute("7f78b7bf-18d6-11e0-9cf7-001ec947ccaf","LoopMaximum","7f73f21f-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f73f21f18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7bf18d611e09cf7001ec947ccaf);



        //## class BpmnSubProcess ##

        MClass id_7f73f22018d611e09cf7001ec947ccaf = new MClass("7f73f220-18d6-11e0-9cf7-001ec947ccaf","BpmnSubProcess","7f73f220-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f73f22018d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnSubProcess",id_7f73f22018d611e09cf7001ec947ccaf);
        // attribute TriggeredByEvent

        MAttribute id_7f78b7d918d611e09cf7001ec947ccaf = new MAttribute("7f78b7d9-18d6-11e0-9cf7-001ec947ccaf","TriggeredByEvent","7f73f220-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f73f22018d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7d918d611e09cf7001ec947ccaf);



        //## class BpmnTask ##

        MClass id_7f73f22118d611e09cf7001ec947ccaf = new MClass("7f73f221-18d6-11e0-9cf7-001ec947ccaf","BpmnTask","7f73f221-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f73f22118d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnTask",id_7f73f22118d611e09cf7001ec947ccaf);
        // attribute IsGlobal

        MAttribute id_7f78b7f818d611e09cf7001ec947ccaf = new MAttribute("7f78b7f8-18d6-11e0-9cf7-001ec947ccaf","IsGlobal","7f73f221-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f73f22118d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7f818d611e09cf7001ec947ccaf);



        //## class BpmnTransaction ##

        MClass id_7f73f22218d611e09cf7001ec947ccaf = new MClass("7f73f222-18d6-11e0-9cf7-001ec947ccaf","BpmnTransaction","7f73f222-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f73f22218d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnTransaction",id_7f73f22218d611e09cf7001ec947ccaf);
        // attribute Protocol

        MAttribute id_7f78b7b718d611e09cf7001ec947ccaf = new MAttribute("7f78b7b7-18d6-11e0-9cf7-001ec947ccaf","Protocol","7f73f222-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f73f22218d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7b718d611e09cf7001ec947ccaf);


        // attribute Method

        MAttribute id_7f78b7b818d611e09cf7001ec947ccaf = new MAttribute("7f78b7b8-18d6-11e0-9cf7-001ec947ccaf","Method","7f73f222-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("TransactionMethod"),false,true,false);
        id_7f73f22218d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7b818d611e09cf7001ec947ccaf);



        //## class BpmnUserTask ##

        MClass id_7f73f22418d611e09cf7001ec947ccaf = new MClass("7f73f224-18d6-11e0-9cf7-001ec947ccaf","BpmnUserTask","7f73f224-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f20e18d611e09cf7001ec947ccaf.getMClass().add(id_7f73f22418d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnUserTask",id_7f73f22418d611e09cf7001ec947ccaf);
        // attribute Implementation

        MAttribute id_7f78b7c618d611e09cf7001ec947ccaf = new MAttribute("7f78b7c6-18d6-11e0-9cf7-001ec947ccaf","Implementation","7f73f224-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f73f22418d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7c618d611e09cf7001ec947ccaf);





        //##### Package events#####
        MPackage id_7f73f1c318d611e09cf7001ec947ccaf = new MPackage("7f73f1c3-18d6-11e0-9cf7-001ec947ccaf","events","7f73f1c3-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_9730153a082911e09123001ec947ccaf.getMPackages().add(id_7f73f1c318d611e09cf7001ec947ccaf);
        //## class BpmnBoundaryEvent ##

        MClass id_7f76546b18d611e09cf7001ec947ccaf = new MClass("7f76546b-18d6-11e0-9cf7-001ec947ccaf","BpmnBoundaryEvent","7f76546b-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f76546b18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnBoundaryEvent",id_7f76546b18d611e09cf7001ec947ccaf);
        // attribute CancelActivity

        MAttribute id_7f78b7e018d611e09cf7001ec947ccaf = new MAttribute("7f78b7e0-18d6-11e0-9cf7-001ec947ccaf","CancelActivity","7f76546b-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f76546b18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7e018d611e09cf7001ec947ccaf);



        //## class BpmnCancelEventDefinition ##

        MClass id_7f76546c18d611e09cf7001ec947ccaf = new MClass("7f76546c-18d6-11e0-9cf7-001ec947ccaf","BpmnCancelEventDefinition","7f76546c-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f76546c18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnCancelEventDefinition",id_7f76546c18d611e09cf7001ec947ccaf);

        //## class BpmnCatchEvent ##

        MClass id_7f76546d18d611e09cf7001ec947ccaf = new MClass("7f76546d-18d6-11e0-9cf7-001ec947ccaf","BpmnCatchEvent","7f76546d-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f76546d18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnCatchEvent",id_7f76546d18d611e09cf7001ec947ccaf);
        // attribute ParallelMultiple

        MAttribute id_7f78b7ce18d611e09cf7001ec947ccaf = new MAttribute("7f78b7ce-18d6-11e0-9cf7-001ec947ccaf","ParallelMultiple","7f76546d-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f76546d18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7ce18d611e09cf7001ec947ccaf);



        //## class BpmnCompensateEventDefinition ##

        MClass id_7f76549f18d611e09cf7001ec947ccaf = new MClass("7f76549f-18d6-11e0-9cf7-001ec947ccaf","BpmnCompensateEventDefinition","7f76549f-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f76549f18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnCompensateEventDefinition",id_7f76549f18d611e09cf7001ec947ccaf);

        //## class BpmnConditionalEventDefinition ##

        MClass id_7f7654a018d611e09cf7001ec947ccaf = new MClass("7f7654a0-18d6-11e0-9cf7-001ec947ccaf","BpmnConditionalEventDefinition","7f7654a0-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654a018d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnConditionalEventDefinition",id_7f7654a018d611e09cf7001ec947ccaf);
        // attribute Condition

        MAttribute id_7f78b7a218d611e09cf7001ec947ccaf = new MAttribute("7f78b7a2-18d6-11e0-9cf7-001ec947ccaf","Condition","7f7654a0-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f7654a018d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7a218d611e09cf7001ec947ccaf);



        //## class BpmnEndEvent ##

        MClass id_7f7654a118d611e09cf7001ec947ccaf = new MClass("7f7654a1-18d6-11e0-9cf7-001ec947ccaf","BpmnEndEvent","7f7654a1-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654a118d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnEndEvent",id_7f7654a118d611e09cf7001ec947ccaf);

        //## class BpmnErrorEventDefinition ##

        MClass id_7f7654a218d611e09cf7001ec947ccaf = new MClass("7f7654a2-18d6-11e0-9cf7-001ec947ccaf","BpmnErrorEventDefinition","7f7654a2-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654a218d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnErrorEventDefinition",id_7f7654a218d611e09cf7001ec947ccaf);
        // attribute ErrorCode

        MAttribute id_7f78b7e618d611e09cf7001ec947ccaf = new MAttribute("7f78b7e6-18d6-11e0-9cf7-001ec947ccaf","ErrorCode","7f7654a2-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f7654a218d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b7e618d611e09cf7001ec947ccaf);



        //## class BpmnEscalationEventDefinition ##

        MClass id_7f7654a318d611e09cf7001ec947ccaf = new MClass("7f7654a3-18d6-11e0-9cf7-001ec947ccaf","BpmnEscalationEventDefinition","7f7654a3-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654a318d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnEscalationEventDefinition",id_7f7654a318d611e09cf7001ec947ccaf);
        // attribute EscalationCode

        MAttribute id_7f78b79f18d611e09cf7001ec947ccaf = new MAttribute("7f78b79f-18d6-11e0-9cf7-001ec947ccaf","EscalationCode","7f7654a3-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f7654a318d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b79f18d611e09cf7001ec947ccaf);



        //## class BpmnEvent ##

        MClass id_7f7654a418d611e09cf7001ec947ccaf = new MClass("7f7654a4-18d6-11e0-9cf7-001ec947ccaf","BpmnEvent","7f7654a4-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654a418d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnEvent",id_7f7654a418d611e09cf7001ec947ccaf);

        //## class BpmnEventDefinition ##

        MClass id_7f7654a518d611e09cf7001ec947ccaf = new MClass("7f7654a5-18d6-11e0-9cf7-001ec947ccaf","BpmnEventDefinition","7f7654a5-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654a518d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnEventDefinition",id_7f7654a518d611e09cf7001ec947ccaf);

        //## class BpmnImplicitThrowEvent ##

        MClass id_7f7654a618d611e09cf7001ec947ccaf = new MClass("7f7654a6-18d6-11e0-9cf7-001ec947ccaf","BpmnImplicitThrowEvent","7f7654a6-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654a618d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnImplicitThrowEvent",id_7f7654a618d611e09cf7001ec947ccaf);

        //## class BpmnIntermediateCatchEvent ##

        MClass id_7f7654a718d611e09cf7001ec947ccaf = new MClass("7f7654a7-18d6-11e0-9cf7-001ec947ccaf","BpmnIntermediateCatchEvent","7f7654a7-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654a718d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnIntermediateCatchEvent",id_7f7654a718d611e09cf7001ec947ccaf);

        //## class BpmnIntermediateThrowEvent ##

        MClass id_7f7654a818d611e09cf7001ec947ccaf = new MClass("7f7654a8-18d6-11e0-9cf7-001ec947ccaf","BpmnIntermediateThrowEvent","7f7654a8-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654a818d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnIntermediateThrowEvent",id_7f7654a818d611e09cf7001ec947ccaf);

        //## class BpmnLinkEventDefinition ##

        MClass id_7f7654a918d611e09cf7001ec947ccaf = new MClass("7f7654a9-18d6-11e0-9cf7-001ec947ccaf","BpmnLinkEventDefinition","7f7654a9-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654a918d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnLinkEventDefinition",id_7f7654a918d611e09cf7001ec947ccaf);

        //## class BpmnMessageEventDefinition ##

        MClass id_7f7654aa18d611e09cf7001ec947ccaf = new MClass("7f7654aa-18d6-11e0-9cf7-001ec947ccaf","BpmnMessageEventDefinition","7f7654aa-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654aa18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnMessageEventDefinition",id_7f7654aa18d611e09cf7001ec947ccaf);

        //## class BpmnSignalEventDefinition ##

        MClass id_7f7654ab18d611e09cf7001ec947ccaf = new MClass("7f7654ab-18d6-11e0-9cf7-001ec947ccaf","BpmnSignalEventDefinition","7f7654ab-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654ab18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnSignalEventDefinition",id_7f7654ab18d611e09cf7001ec947ccaf);

        //## class BpmnStartEvent ##

        MClass id_7f7654ac18d611e09cf7001ec947ccaf = new MClass("7f7654ac-18d6-11e0-9cf7-001ec947ccaf","BpmnStartEvent","7f7654ac-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654ac18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnStartEvent",id_7f7654ac18d611e09cf7001ec947ccaf);
        // attribute IsInterrupting

        MAttribute id_7f78b80e18d611e09cf7001ec947ccaf = new MAttribute("7f78b80e-18d6-11e0-9cf7-001ec947ccaf","IsInterrupting","7f7654ac-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f7654ac18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b80e18d611e09cf7001ec947ccaf);



        //## class BpmnTerminateEventDefinition ##

        MClass id_7f7654ad18d611e09cf7001ec947ccaf = new MClass("7f7654ad-18d6-11e0-9cf7-001ec947ccaf","BpmnTerminateEventDefinition","7f7654ad-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654ad18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnTerminateEventDefinition",id_7f7654ad18d611e09cf7001ec947ccaf);

        //## class BpmnThrowEvent ##

        MClass id_7f7654ae18d611e09cf7001ec947ccaf = new MClass("7f7654ae-18d6-11e0-9cf7-001ec947ccaf","BpmnThrowEvent","7f7654ae-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654ae18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnThrowEvent",id_7f7654ae18d611e09cf7001ec947ccaf);

        //## class BpmnTimerEventDefinition ##

        MClass id_7f7654af18d611e09cf7001ec947ccaf = new MClass("7f7654af-18d6-11e0-9cf7-001ec947ccaf","BpmnTimerEventDefinition","7f7654af-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c318d611e09cf7001ec947ccaf.getMClass().add(id_7f7654af18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnTimerEventDefinition",id_7f7654af18d611e09cf7001ec947ccaf);
        // attribute TimeCycle

        MAttribute id_7f78b81f18d611e09cf7001ec947ccaf = new MAttribute("7f78b81f-18d6-11e0-9cf7-001ec947ccaf","TimeCycle","7f7654af-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f7654af18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b81f18d611e09cf7001ec947ccaf);


        // attribute TimeD

        MAttribute id_7f78b80a18d611e09cf7001ec947ccaf = new MAttribute("7f78b80a-18d6-11e0-9cf7-001ec947ccaf","TimeD","7f7654af-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f7654af18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b80a18d611e09cf7001ec947ccaf);





        //##### Package gateways#####
        MPackage id_7f73f1c418d611e09cf7001ec947ccaf = new MPackage("7f73f1c4-18d6-11e0-9cf7-001ec947ccaf","gateways","7f73f1c4-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_9730153a082911e09123001ec947ccaf.getMPackages().add(id_7f73f1c418d611e09cf7001ec947ccaf);
        //## class BpmnComplexGateway ##

        MClass id_7f7654e318d611e09cf7001ec947ccaf = new MClass("7f7654e3-18d6-11e0-9cf7-001ec947ccaf","BpmnComplexGateway","7f7654e3-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c418d611e09cf7001ec947ccaf.getMClass().add(id_7f7654e318d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnComplexGateway",id_7f7654e318d611e09cf7001ec947ccaf);
        // attribute ActivationExpression

        MAttribute id_7f78b81718d611e09cf7001ec947ccaf = new MAttribute("7f78b817-18d6-11e0-9cf7-001ec947ccaf","ActivationExpression","7f7654e3-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f7654e318d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b81718d611e09cf7001ec947ccaf);



        //## class BpmnEventBasedGateway ##

        MClass id_7f7654e418d611e09cf7001ec947ccaf = new MClass("7f7654e4-18d6-11e0-9cf7-001ec947ccaf","BpmnEventBasedGateway","7f7654e4-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c418d611e09cf7001ec947ccaf.getMClass().add(id_7f7654e418d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnEventBasedGateway",id_7f7654e418d611e09cf7001ec947ccaf);
        // attribute Instanciate

        MAttribute id_7f78b82018d611e09cf7001ec947ccaf = new MAttribute("7f78b820-18d6-11e0-9cf7-001ec947ccaf","Instanciate","7f7654e4-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f7654e418d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b82018d611e09cf7001ec947ccaf);


        // attribute EventGatewayType

        MAttribute id_7f78b82118d611e09cf7001ec947ccaf = new MAttribute("7f78b821-18d6-11e0-9cf7-001ec947ccaf","EventGatewayType","7f7654e4-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("BpmnEventBasedGatewayType"),false,true,false);
        id_7f7654e418d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b82118d611e09cf7001ec947ccaf);



        //## class BpmnExclusiveGateway ##

        MClass id_7f7654b218d611e09cf7001ec947ccaf = new MClass("7f7654b2-18d6-11e0-9cf7-001ec947ccaf","BpmnExclusiveGateway","7f7654b2-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c418d611e09cf7001ec947ccaf.getMClass().add(id_7f7654b218d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnExclusiveGateway",id_7f7654b218d611e09cf7001ec947ccaf);

        //## class BpmnGateway ##

        MClass id_7f7654ce18d611e09cf7001ec947ccaf = new MClass("7f7654ce-18d6-11e0-9cf7-001ec947ccaf","BpmnGateway","7f7654ce-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c418d611e09cf7001ec947ccaf.getMClass().add(id_7f7654ce18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnGateway",id_7f7654ce18d611e09cf7001ec947ccaf);
        // attribute GatewayDirection

        MAttribute id_7f78b82a18d611e09cf7001ec947ccaf = new MAttribute("7f78b82a-18d6-11e0-9cf7-001ec947ccaf","GatewayDirection","7f7654ce-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("BpmnGatewayDirection"),false,true,false);
        id_7f7654ce18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b82a18d611e09cf7001ec947ccaf);



        //## class BpmnInclusiveGateway ##

        MClass id_7f7654d018d611e09cf7001ec947ccaf = new MClass("7f7654d0-18d6-11e0-9cf7-001ec947ccaf","BpmnInclusiveGateway","7f7654d0-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c418d611e09cf7001ec947ccaf.getMClass().add(id_7f7654d018d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnInclusiveGateway",id_7f7654d018d611e09cf7001ec947ccaf);

        //## class BpmnParallelGateway ##

        MClass id_7f7654d118d611e09cf7001ec947ccaf = new MClass("7f7654d1-18d6-11e0-9cf7-001ec947ccaf","BpmnParallelGateway","7f7654d1-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c418d611e09cf7001ec947ccaf.getMClass().add(id_7f7654d118d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnParallelGateway",id_7f7654d118d611e09cf7001ec947ccaf);



        //##### Package objects#####
        MPackage id_7f73f1c518d611e09cf7001ec947ccaf = new MPackage("7f73f1c5-18d6-11e0-9cf7-001ec947ccaf","objects","7f73f1c5-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_9730153a082911e09123001ec947ccaf.getMPackages().add(id_7f73f1c518d611e09cf7001ec947ccaf);
        //## class BpmnDataObject ##

        MClass id_7f7654ec18d611e09cf7001ec947ccaf = new MClass("7f7654ec-18d6-11e0-9cf7-001ec947ccaf","BpmnDataObject","7f7654ec-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c518d611e09cf7001ec947ccaf.getMClass().add(id_7f7654ec18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnDataObject",id_7f7654ec18d611e09cf7001ec947ccaf);

        //## class BpmnDataStore ##

        MClass id_7f7654e018d611e09cf7001ec947ccaf = new MClass("7f7654e0-18d6-11e0-9cf7-001ec947ccaf","BpmnDataStore","7f7654e0-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c518d611e09cf7001ec947ccaf.getMClass().add(id_7f7654e018d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnDataStore",id_7f7654e018d611e09cf7001ec947ccaf);
        // attribute Capacity

        MAttribute id_7f78b86118d611e09cf7001ec947ccaf = new MAttribute("7f78b861-18d6-11e0-9cf7-001ec947ccaf","Capacity","7f7654e0-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("integer"),false,true,false);
        id_7f7654e018d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b86118d611e09cf7001ec947ccaf);


        // attribute IsUnlimited

        MAttribute id_7f78b86218d611e09cf7001ec947ccaf = new MAttribute("7f78b862-18d6-11e0-9cf7-001ec947ccaf","IsUnlimited","7f7654e0-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f7654e018d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b86218d611e09cf7001ec947ccaf);



        //## class BpmnDataAssociation ##

        MClass id_7f7654e118d611e09cf7001ec947ccaf = new MClass("7f7654e1-18d6-11e0-9cf7-001ec947ccaf","BpmnDataAssociation","7f7654e1-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c518d611e09cf7001ec947ccaf.getMClass().add(id_7f7654e118d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnDataAssociation",id_7f7654e118d611e09cf7001ec947ccaf);
        // attribute Assignment

        MAttribute id_7f78b84918d611e09cf7001ec947ccaf = new MAttribute("7f78b849-18d6-11e0-9cf7-001ec947ccaf","Assignment","7f7654e1-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f7654e118d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b84918d611e09cf7001ec947ccaf);


        // attribute Transfomation

        MAttribute id_7f78b84a18d611e09cf7001ec947ccaf = new MAttribute("7f78b84a-18d6-11e0-9cf7-001ec947ccaf","Transfomation","7f7654e1-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f7654e118d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b84a18d611e09cf7001ec947ccaf);


        // attribute Language

        MAttribute id_7f78b83918d611e09cf7001ec947ccaf = new MAttribute("7f78b839-18d6-11e0-9cf7-001ec947ccaf","Language","7f7654e1-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f7654e118d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b83918d611e09cf7001ec947ccaf);



        //## class BpmnSequenceFlowDataAssociation ##

        MClass id_7f7654e218d611e09cf7001ec947ccaf = new MClass("7f7654e2-18d6-11e0-9cf7-001ec947ccaf","BpmnSequenceFlowDataAssociation","7f7654e2-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c518d611e09cf7001ec947ccaf.getMClass().add(id_7f7654e218d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnSequenceFlowDataAssociation",id_7f7654e218d611e09cf7001ec947ccaf);

        //## class BpmnDataOutput ##

        MClass id_7f7654c218d611e09cf7001ec947ccaf = new MClass("7f7654c2-18d6-11e0-9cf7-001ec947ccaf","BpmnDataOutput","7f7654c2-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c518d611e09cf7001ec947ccaf.getMClass().add(id_7f7654c218d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnDataOutput",id_7f7654c218d611e09cf7001ec947ccaf);

        //## class BpmnDataInput ##

        MClass id_7f7654c318d611e09cf7001ec947ccaf = new MClass("7f7654c3-18d6-11e0-9cf7-001ec947ccaf","BpmnDataInput","7f7654c3-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c518d611e09cf7001ec947ccaf.getMClass().add(id_7f7654c318d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnDataInput",id_7f7654c318d611e09cf7001ec947ccaf);

        //## class BpmnItemAwareElement ##

        MClass id_7f7654c418d611e09cf7001ec947ccaf = new MClass("7f7654c4-18d6-11e0-9cf7-001ec947ccaf","BpmnItemAwareElement","7f7654c4-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c518d611e09cf7001ec947ccaf.getMClass().add(id_7f7654c418d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnItemAwareElement",id_7f7654c418d611e09cf7001ec947ccaf);

        //## class BpmnItemDefinition ##

        MClass id_7f7654c518d611e09cf7001ec947ccaf = new MClass("7f7654c5-18d6-11e0-9cf7-001ec947ccaf","BpmnItemDefinition","7f7654c5-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c518d611e09cf7001ec947ccaf.getMClass().add(id_7f7654c518d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnItemDefinition",id_7f7654c518d611e09cf7001ec947ccaf);
        // attribute ItemKind

        MAttribute id_7f7b19bc18d611e09cf7001ec947ccaf = new MAttribute("7f7b19bc-18d6-11e0-9cf7-001ec947ccaf","ItemKind","7f7654c5-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("BpmnItemKind"),false,true,false);
        id_7f7654c518d611e09cf7001ec947ccaf.getMAttributes().add(id_7f7b19bc18d611e09cf7001ec947ccaf);


        // attribute IsCollection

        MAttribute id_7f78b88018d611e09cf7001ec947ccaf = new MAttribute("7f78b880-18d6-11e0-9cf7-001ec947ccaf","IsCollection","7f7654c5-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f7654c518d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b88018d611e09cf7001ec947ccaf);



        //## class BpmnDataState ##

        MClass id_7f7654c718d611e09cf7001ec947ccaf = new MClass("7f7654c7-18d6-11e0-9cf7-001ec947ccaf","BpmnDataState","7f7654c7-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c518d611e09cf7001ec947ccaf.getMClass().add(id_7f7654c718d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnDataState",id_7f7654c718d611e09cf7001ec947ccaf);



        //##### Package resources#####
        MPackage id_7f73f1c618d611e09cf7001ec947ccaf = new MPackage("7f73f1c6-18d6-11e0-9cf7-001ec947ccaf","resources","7f73f1c6-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_9730153a082911e09123001ec947ccaf.getMPackages().add(id_7f73f1c618d611e09cf7001ec947ccaf);
        //## class BpmnResource ##

        MClass id_7f7654e918d611e09cf7001ec947ccaf = new MClass("7f7654e9-18d6-11e0-9cf7-001ec947ccaf","BpmnResource","7f7654e9-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c618d611e09cf7001ec947ccaf.getMClass().add(id_7f7654e918d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnResource",id_7f7654e918d611e09cf7001ec947ccaf);

        //## class BpmnResourceParameter ##

        MClass id_7f7654ea18d611e09cf7001ec947ccaf = new MClass("7f7654ea-18d6-11e0-9cf7-001ec947ccaf","BpmnResourceParameter","7f7654ea-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c618d611e09cf7001ec947ccaf.getMClass().add(id_7f7654ea18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnResourceParameter",id_7f7654ea18d611e09cf7001ec947ccaf);
        // attribute IsRequired

        MAttribute id_7f7b19c418d611e09cf7001ec947ccaf = new MAttribute("7f7b19c4-18d6-11e0-9cf7-001ec947ccaf","IsRequired","7f7654ea-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_7f7654ea18d611e09cf7001ec947ccaf.getMAttributes().add(id_7f7b19c418d611e09cf7001ec947ccaf);



        //## class BpmnResourceRole ##

        MClass id_7f7654eb18d611e09cf7001ec947ccaf = new MClass("7f7654eb-18d6-11e0-9cf7-001ec947ccaf","BpmnResourceRole","7f7654eb-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c618d611e09cf7001ec947ccaf.getMClass().add(id_7f7654eb18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnResourceRole",id_7f7654eb18d611e09cf7001ec947ccaf);

        //## class BpmnResourceParameterBinding ##

        MClass id_7f7654c918d611e09cf7001ec947ccaf = new MClass("7f7654c9-18d6-11e0-9cf7-001ec947ccaf","BpmnResourceParameterBinding","7f7654c9-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c618d611e09cf7001ec947ccaf.getMClass().add(id_7f7654c918d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnResourceParameterBinding",id_7f7654c918d611e09cf7001ec947ccaf);
        // attribute Expression

        MAttribute id_7f78b88c18d611e09cf7001ec947ccaf = new MAttribute("7f78b88c-18d6-11e0-9cf7-001ec947ccaf","Expression","7f7654c9-18d6-11e0-9cf7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_7f7654c918d611e09cf7001ec947ccaf.getMAttributes().add(id_7f78b88c18d611e09cf7001ec947ccaf);





        //##### Package bpmnDiagrams#####
        MPackage id_7f73f1c718d611e09cf7001ec947ccaf = new MPackage("7f73f1c7-18d6-11e0-9cf7-001ec947ccaf","bpmnDiagrams","7f73f1c7-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_9730153a082911e09123001ec947ccaf.getMPackages().add(id_7f73f1c718d611e09cf7001ec947ccaf);
        //## class BpmnProcessCollaborationDiagram ##

        MClass id_7f7654e818d611e09cf7001ec947ccaf = new MClass("7f7654e8-18d6-11e0-9cf7-001ec947ccaf","BpmnProcessCollaborationDiagram","7f7654e8-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c718d611e09cf7001ec947ccaf.getMClass().add(id_7f7654e818d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnProcessCollaborationDiagram",id_7f7654e818d611e09cf7001ec947ccaf);

        //## class BpmnSubProcessDiagram ##

        MClass id_7f7654cb18d611e09cf7001ec947ccaf = new MClass("7f7654cb-18d6-11e0-9cf7-001ec947ccaf","BpmnSubProcessDiagram","7f7654cb-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c718d611e09cf7001ec947ccaf.getMClass().add(id_7f7654cb18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnSubProcessDiagram",id_7f7654cb18d611e09cf7001ec947ccaf);



        //##### Package bpmnService#####
        MPackage id_7f73f1c818d611e09cf7001ec947ccaf = new MPackage("7f73f1c8-18d6-11e0-9cf7-001ec947ccaf","bpmnService","7f73f1c8-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_9730153a082911e09123001ec947ccaf.getMPackages().add(id_7f73f1c818d611e09cf7001ec947ccaf);
        //## class BpmnOperation ##

        MClass id_7f7654cd18d611e09cf7001ec947ccaf = new MClass("7f7654cd-18d6-11e0-9cf7-001ec947ccaf","BpmnOperation","7f7654cd-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c818d611e09cf7001ec947ccaf.getMClass().add(id_7f7654cd18d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnOperation",id_7f7654cd18d611e09cf7001ec947ccaf);

        //## class BpmnInterface ##

        MClass id_7f7654e518d611e09cf7001ec947ccaf = new MClass("7f7654e5-18d6-11e0-9cf7-001ec947ccaf","BpmnInterface","7f7654e5-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c818d611e09cf7001ec947ccaf.getMClass().add(id_7f7654e518d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnInterface",id_7f7654e518d611e09cf7001ec947ccaf);

        //## class BpmnEndPoint ##

        MClass id_7f7654e618d611e09cf7001ec947ccaf = new MClass("7f7654e6-18d6-11e0-9cf7-001ec947ccaf","BpmnEndPoint","7f7654e6-18d6-11e0-9cf7-001ec947ccaf.exml");
        id_7f73f1c818d611e09cf7001ec947ccaf.getMClass().add(id_7f7654e618d611e09cf7001ec947ccaf);
        this.mClass.put("BpmnEndPoint",id_7f7654e618d611e09cf7001ec947ccaf);





        //##### Package diagrams#####
        MPackage id_000c0248000059140000000000000000 = new MPackage("000c0248-0000-5914-0000-000000000000","diagrams","000c0248-0000-5914-0000-000000000000.exml");
        this.mPackages.add(id_000c0248000059140000000000000000);
        //## class AbstractDiagram ##

        MClass id_000c0248000059170000000000000000 = new MClass("000c0248-0000-5917-0000-000000000000","AbstractDiagram","000c0248-0000-5917-0000-000000000000.exml");
        id_000c0248000059140000000000000000.getMClass().add(id_000c0248000059170000000000000000);
        this.mClass.put("AbstractDiagram",id_000c0248000059170000000000000000);
        // attribute UiDataVersion

        MAttribute id_000c0248000059920000000000000000 = new MAttribute("000c0248-0000-5992-0000-000000000000","UiDataVersion","000c0248-0000-5917-0000-000000000000.exml",this.mBaseTypes.get("integer"),false,true,false);
        id_000c0248000059170000000000000000.getMAttributes().add(id_000c0248000059920000000000000000);


        // attribute UiData

        MAttribute id_7e65959821874bf8abff83449137cec3 = new MAttribute("7e659598-2187-4bf8-abff-83449137cec3","UiData","000c0248-0000-5917-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_000c0248000059170000000000000000.getMAttributes().add(id_7e65959821874bf8abff83449137cec3);


        // attribute PdeProperties

        MAttribute id_002817b8000000010000000000000000 = new MAttribute("002817b8-0000-0001-0000-000000000000","PdeProperties","000c0248-0000-5917-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_000c0248000059170000000000000000.getMAttributes().add(id_002817b8000000010000000000000000);



        //## class ActivityDiagram ##

        MClass id_00d012a8000000720000000000000000 = new MClass("00d012a8-0000-0072-0000-000000000000","ActivityDiagram","00d012a8-0000-0072-0000-000000000000.exml");
        id_000c0248000059140000000000000000.getMClass().add(id_00d012a8000000720000000000000000);
        this.mClass.put("ActivityDiagram",id_00d012a8000000720000000000000000);
        // attribute IsVertical

        MAttribute id_01e4048c0000002b0000000000000000 = new MAttribute("01e4048c-0000-002b-0000-000000000000","IsVertical","00d012a8-0000-0072-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d012a8000000720000000000000000.getMAttributes().add(id_01e4048c0000002b0000000000000000);



        //## class BehaviorDiagram ##

        MClass id_00d012a8000000520000000000000000 = new MClass("00d012a8-0000-0052-0000-000000000000","BehaviorDiagram","00d012a8-0000-0052-0000-000000000000.exml");
        id_000c0248000059140000000000000000.getMClass().add(id_00d012a8000000520000000000000000);
        this.mClass.put("BehaviorDiagram",id_00d012a8000000520000000000000000);

        //## class ClassDiagram ##

        MClass id_591884c8717311e0b225001ec947ccaf = new MClass("591884c8-7173-11e0-b225-001ec947ccaf","ClassDiagram","591884c8-7173-11e0-b225-001ec947ccaf.exml");
        id_000c0248000059140000000000000000.getMClass().add(id_591884c8717311e0b225001ec947ccaf);
        this.mClass.put("ClassDiagram",id_591884c8717311e0b225001ec947ccaf);

        //## class CommunicationDiagram ##

        MClass id_662bdf68717311e0b225001ec947ccaf = new MClass("662bdf68-7173-11e0-b225-001ec947ccaf","CommunicationDiagram","662bdf68-7173-11e0-b225-001ec947ccaf.exml");
        id_000c0248000059140000000000000000.getMClass().add(id_662bdf68717311e0b225001ec947ccaf);
        this.mClass.put("CommunicationDiagram",id_662bdf68717311e0b225001ec947ccaf);

        //## class DeploymentDiagram ##

        MClass id_674ebd58717311e0b225001ec947ccaf = new MClass("674ebd58-7173-11e0-b225-001ec947ccaf","DeploymentDiagram","674ebd58-7173-11e0-b225-001ec947ccaf.exml");
        id_000c0248000059140000000000000000.getMClass().add(id_674ebd58717311e0b225001ec947ccaf);
        this.mClass.put("DeploymentDiagram",id_674ebd58717311e0b225001ec947ccaf);

        //## class DiagramSet ##

        MClass id_41bd9c242ae611e080c5001ec947ccaf = new MClass("41bd9c24-2ae6-11e0-80c5-001ec947ccaf","DiagramSet","41bd9c24-2ae6-11e0-80c5-001ec947ccaf.exml");
        id_000c0248000059140000000000000000.getMClass().add(id_41bd9c242ae611e080c5001ec947ccaf);
        this.mClass.put("DiagramSet",id_41bd9c242ae611e080c5001ec947ccaf);

        //## class SequenceDiagram ##

        MClass id_01e4048c000033420000000000000000 = new MClass("01e4048c-0000-3342-0000-000000000000","SequenceDiagram","01e4048c-0000-3342-0000-000000000000.exml");
        id_000c0248000059140000000000000000.getMClass().add(id_01e4048c000033420000000000000000);
        this.mClass.put("SequenceDiagram",id_01e4048c000033420000000000000000);

        //## class StateMachineDiagram ##

        MClass id_703f8758717311e0b225001ec947ccaf = new MClass("703f8758-7173-11e0-b225-001ec947ccaf","StateMachineDiagram","703f8758-7173-11e0-b225-001ec947ccaf.exml");
        id_000c0248000059140000000000000000.getMClass().add(id_703f8758717311e0b225001ec947ccaf);
        this.mClass.put("StateMachineDiagram",id_703f8758717311e0b225001ec947ccaf);

        //## class StaticDiagram ##

        MClass id_00d012a8000000030000000000000000 = new MClass("00d012a8-0000-0003-0000-000000000000","StaticDiagram","00d012a8-0000-0003-0000-000000000000.exml");
        id_000c0248000059140000000000000000.getMClass().add(id_00d012a8000000030000000000000000);
        this.mClass.put("StaticDiagram",id_00d012a8000000030000000000000000);

        //## class UseCaseDiagram ##

        MClass id_6d174cd0717311e0b225001ec947ccaf = new MClass("6d174cd0-7173-11e0-b225-001ec947ccaf","UseCaseDiagram","6d174cd0-7173-11e0-b225-001ec947ccaf.exml");
        id_000c0248000059140000000000000000.getMClass().add(id_6d174cd0717311e0b225001ec947ccaf);
        this.mClass.put("UseCaseDiagram",id_6d174cd0717311e0b225001ec947ccaf);

        //## class ObjectDiagram ##

        MClass id_b2b017a8717311e0b225001ec947ccaf = new MClass("b2b017a8-7173-11e0-b225-001ec947ccaf","ObjectDiagram","b2b017a8-7173-11e0-b225-001ec947ccaf.exml");
        id_000c0248000059140000000000000000.getMClass().add(id_b2b017a8717311e0b225001ec947ccaf);
        this.mClass.put("ObjectDiagram",id_b2b017a8717311e0b225001ec947ccaf);

        //## class CompositeStructureDiagram ##

        MClass id_8c9d72f1fb1c11e08de7001ec947ccaf = new MClass("8c9d72f1-fb1c-11e0-8de7-001ec947ccaf","CompositeStructureDiagram","8c9d72f1-fb1c-11e0-8de7-001ec947ccaf.exml");
        id_000c0248000059140000000000000000.getMClass().add(id_8c9d72f1fb1c11e08de7001ec947ccaf);
        this.mClass.put("CompositeStructureDiagram",id_8c9d72f1fb1c11e08de7001ec947ccaf);



        //##### Package mda#####
        MPackage id_0148033c000000aa0000000000000000 = new MPackage("0148033c-0000-00aa-0000-000000000000","mda","0148033c-0000-00aa-0000-000000000000.exml");
        this.mPackages.add(id_0148033c000000aa0000000000000000);
        //## class ModuleParameter ##

        MClass id_0148033c00000d3e0000000000000000 = new MClass("0148033c-0000-0d3e-0000-000000000000","ModuleParameter","0148033c-0000-0d3e-0000-000000000000.exml");
        id_0148033c000000aa0000000000000000.getMClass().add(id_0148033c00000d3e0000000000000000);
        this.mClass.put("ModuleParameter",id_0148033c00000d3e0000000000000000);
        // attribute GroupName

        MAttribute id_0148033c0001d4030000000000000000 = new MAttribute("0148033c-0001-d403-0000-000000000000","GroupName","0148033c-0000-0d3e-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000d3e0000000000000000.getMAttributes().add(id_0148033c0001d4030000000000000000);


        // attribute Type

        MAttribute id_0148033c0001d3fb0000000000000000 = new MAttribute("0148033c-0001-d3fb-0000-000000000000","Type","0148033c-0000-0d3e-0000-000000000000.exml",this.mBaseTypes.get("ModuleParameterType"),false,true,false);
        id_0148033c00000d3e0000000000000000.getMAttributes().add(id_0148033c0001d3fb0000000000000000);


        // attribute IsUserRead

        MAttribute id_a2ae1f03f0ea11e19c38001ec947ccaf = new MAttribute("a2ae1f03-f0ea-11e1-9c38-001ec947ccaf","IsUserRead","0148033c-0000-0d3e-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000d3e0000000000000000.getMAttributes().add(id_a2ae1f03f0ea11e19c38001ec947ccaf);


        // attribute IsUserWrite

        MAttribute id_8e5fa4a4f0ed11e19c38001ec947ccaf = new MAttribute("8e5fa4a4-f0ed-11e1-9c38-001ec947ccaf","IsUserWrite","0148033c-0000-0d3e-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000d3e0000000000000000.getMAttributes().add(id_8e5fa4a4f0ed11e19c38001ec947ccaf);


        // attribute IsApiRead

        MAttribute id_a2f807abf0ea11e19c38001ec947ccaf = new MAttribute("a2f807ab-f0ea-11e1-9c38-001ec947ccaf","IsApiRead","0148033c-0000-0d3e-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000d3e0000000000000000.getMAttributes().add(id_a2f807abf0ea11e19c38001ec947ccaf);


        // attribute IsApiWrite

        MAttribute id_a99beec3f0ea11e19c38001ec947ccaf = new MAttribute("a99beec3-f0ea-11e1-9c38-001ec947ccaf","IsApiWrite","0148033c-0000-0d3e-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000d3e0000000000000000.getMAttributes().add(id_a99beec3f0ea11e19c38001ec947ccaf);


        // attribute DefaultValue

        MAttribute id_2c04fe66611d4847902d4f3f308f67c4 = new MAttribute("2c04fe66-611d-4847-902d-4f3f308f67c4","DefaultValue","0148033c-0000-0d3e-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000d3e0000000000000000.getMAttributes().add(id_2c04fe66611d4847902d4f3f308f67c4);



        //## class ModuleComponent ##

        MClass id_0148033c00000d350000000000000000 = new MClass("0148033c-0000-0d35-0000-000000000000","ModuleComponent","0148033c-0000-0d35-0000-000000000000.exml");
        id_0148033c000000aa0000000000000000.getMClass().add(id_0148033c00000d350000000000000000);
        this.mClass.put("ModuleComponent",id_0148033c00000d350000000000000000);
        // attribute LicenseKey

        MAttribute id_0148033c0001e37c0000000000000000 = new MAttribute("0148033c-0001-e37c-0000-000000000000","LicenseKey","0148033c-0000-0d35-0000-000000000000.exml",this.mBaseTypes.get("integer"),false,true,false);
        id_0148033c00000d350000000000000000.getMAttributes().add(id_0148033c0001e37c0000000000000000);


        // attribute MajVersion

        MAttribute id_0148033c0001e3860000000000000000 = new MAttribute("0148033c-0001-e386-0000-000000000000","MajVersion","0148033c-0000-0d35-0000-000000000000.exml",this.mBaseTypes.get("integer"),false,true,false);
        id_0148033c00000d350000000000000000.getMAttributes().add(id_0148033c0001e3860000000000000000);


        // attribute MinVersion

        MAttribute id_0148033c0001e3890000000000000000 = new MAttribute("0148033c-0001-e389-0000-000000000000","MinVersion","0148033c-0000-0d35-0000-000000000000.exml",this.mBaseTypes.get("integer"),false,true,false);
        id_0148033c00000d350000000000000000.getMAttributes().add(id_0148033c0001e3890000000000000000);


        // attribute MinMinVersion

        MAttribute id_0148033c0001e38c0000000000000000 = new MAttribute("0148033c-0001-e38c-0000-000000000000","MinMinVersion","0148033c-0000-0d35-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000d350000000000000000.getMAttributes().add(id_0148033c0001e38c0000000000000000);


        // attribute MinBinVersionCompatibility

        MAttribute id_0148033c0001e38f0000000000000000 = new MAttribute("0148033c-0001-e38f-0000-000000000000","MinBinVersionCompatibility","0148033c-0000-0d35-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000d350000000000000000.getMAttributes().add(id_0148033c0001e38f0000000000000000);


        // attribute JavaClassName

        MAttribute id_00d0005c000008980000000000000000 = new MAttribute("00d0005c-0000-0898-0000-000000000000","JavaClassName","0148033c-0000-0d35-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000d350000000000000000.getMAttributes().add(id_00d0005c000008980000000000000000);


        // attribute State

        MAttribute id_14d081ccb57211ddbc2c001ec947ccaf = new MAttribute("14d081cc-b572-11dd-bc2c-001ec947ccaf","State","0148033c-0000-0d35-0000-000000000000.exml",this.mBaseTypes.get("ModuleState"),false,true,false);
        id_0148033c00000d350000000000000000.getMAttributes().add(id_14d081ccb57211ddbc2c001ec947ccaf);



        //## class Project ##

        MClass id_0148033c00000ce00000000000000000 = new MClass("0148033c-0000-0ce0-0000-000000000000","Project","0148033c-0000-0ce0-0000-000000000000.exml");
        id_0148033c000000aa0000000000000000.getMClass().add(id_0148033c00000ce00000000000000000);
        this.mClass.put("Project",id_0148033c00000ce00000000000000000);
        // attribute ProjectContext

        MAttribute id_0148033c0001c7ec0000000000000000 = new MAttribute("0148033c-0001-c7ec-0000-000000000000","ProjectContext","0148033c-0000-0ce0-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000ce00000000000000000.getMAttributes().add(id_0148033c0001c7ec0000000000000000);


        // attribute ProjectDescr

        MAttribute id_0148033c0001c7ea0000000000000000 = new MAttribute("0148033c-0001-c7ea-0000-000000000000","ProjectDescr","0148033c-0000-0ce0-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000ce00000000000000000.getMAttributes().add(id_0148033c0001c7ea0000000000000000);





        //##### Package uml#####
        MPackage id_01f4038c000042d60000000000000000 = new MPackage("01f4038c-0000-42d6-0000-000000000000","uml","01f4038c-0000-42d6-0000-000000000000.exml");
        this.mPackages.add(id_01f4038c000042d60000000000000000);
        //##### Package infrastructure#####
        MPackage id_00d00f24000000010000000000000000 = new MPackage("00d00f24-0000-0001-0000-000000000000","infrastructure","00d00f24-0000-0001-0000-000000000000.exml");
        id_01f4038c000042d60000000000000000.getMPackages().add(id_00d00f24000000010000000000000000);
        //##### Package properties#####
        MPackage id_61fcf793275311e2b500001ec947ccaf = new MPackage("61fcf793-2753-11e2-b500-001ec947ccaf","properties","61fcf793-2753-11e2-b500-001ec947ccaf.exml");
        id_00d00f24000000010000000000000000.getMPackages().add(id_61fcf793275311e2b500001ec947ccaf);
        //## class EnumeratedPropertyType ##

        MClass id_00080b0800001a680000000000000000 = new MClass("00080b08-0000-1a68-0000-000000000000","EnumeratedPropertyType","00080b08-0000-1a68-0000-000000000000.exml");
        id_61fcf793275311e2b500001ec947ccaf.getMClass().add(id_00080b0800001a680000000000000000);
        this.mClass.put("EnumeratedPropertyType",id_00080b0800001a680000000000000000);

        //## class LocalPropertyTable ##

        MClass id_c5ab835f275811e2b500001ec947ccaf = new MClass("c5ab835f-2758-11e2-b500-001ec947ccaf","LocalPropertyTable","c5ab835f-2758-11e2-b500-001ec947ccaf.exml");
        id_61fcf793275311e2b500001ec947ccaf.getMClass().add(id_c5ab835f275811e2b500001ec947ccaf);
        this.mClass.put("LocalPropertyTable",id_c5ab835f275811e2b500001ec947ccaf);

        //## class PropertyDefinition ##

        MClass id_00080b08000018890000000000000000 = new MClass("00080b08-0000-1889-0000-000000000000","PropertyDefinition","00080b08-0000-1889-0000-000000000000.exml");
        id_61fcf793275311e2b500001ec947ccaf.getMClass().add(id_00080b08000018890000000000000000);
        this.mClass.put("PropertyDefinition",id_00080b08000018890000000000000000);
        // attribute IsEditable

        MAttribute id_00080b08000018be0000000000000000 = new MAttribute("00080b08-0000-18be-0000-000000000000","IsEditable","00080b08-0000-1889-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00080b08000018890000000000000000.getMAttributes().add(id_00080b08000018be0000000000000000);


        // attribute DefaultValue

        MAttribute id_00080b08000019250000000000000000 = new MAttribute("00080b08-0000-1925-0000-000000000000","DefaultValue","00080b08-0000-1889-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00080b08000018890000000000000000.getMAttributes().add(id_00080b08000019250000000000000000);



        //## class PropertyEnumerationLitteral ##

        MClass id_00080b0800001a6a0000000000000000 = new MClass("00080b08-0000-1a6a-0000-000000000000","PropertyEnumerationLitteral","00080b08-0000-1a6a-0000-000000000000.exml");
        id_61fcf793275311e2b500001ec947ccaf.getMClass().add(id_00080b0800001a6a0000000000000000);
        this.mClass.put("PropertyEnumerationLitteral",id_00080b0800001a6a0000000000000000);

        //## class PropertyTable ##

        MClass id_65895868275511e2b500001ec947ccaf = new MClass("65895868-2755-11e2-b500-001ec947ccaf","PropertyTable","65895868-2755-11e2-b500-001ec947ccaf.exml");
        id_61fcf793275311e2b500001ec947ccaf.getMClass().add(id_65895868275511e2b500001ec947ccaf);
        this.mClass.put("PropertyTable",id_65895868275511e2b500001ec947ccaf);
        // attribute name

        MAttribute id_b3df7365275811e2b500001ec947ccaf = new MAttribute("b3df7365-2758-11e2-b500-001ec947ccaf","name","65895868-2755-11e2-b500-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_65895868275511e2b500001ec947ccaf.getMAttributes().add(id_b3df7365275811e2b500001ec947ccaf);


        // attribute content

        MAttribute id_e63220fb282511e2bf07001ec947ccaf = new MAttribute("e63220fb-2825-11e2-bf07-001ec947ccaf","content","65895868-2755-11e2-b500-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_65895868275511e2b500001ec947ccaf.getMAttributes().add(id_e63220fb282511e2bf07001ec947ccaf);



        //## class PropertyTableDefinition ##

        MClass id_00080b080000187e0000000000000000 = new MClass("00080b08-0000-187e-0000-000000000000","PropertyTableDefinition","00080b08-0000-187e-0000-000000000000.exml");
        id_61fcf793275311e2b500001ec947ccaf.getMClass().add(id_00080b080000187e0000000000000000);
        this.mClass.put("PropertyTableDefinition",id_00080b080000187e0000000000000000);

        //## class PropertyType ##

        MClass id_00080b0800001aae0000000000000000 = new MClass("00080b08-0000-1aae-0000-000000000000","PropertyType","00080b08-0000-1aae-0000-000000000000.exml");
        id_61fcf793275311e2b500001ec947ccaf.getMClass().add(id_00080b0800001aae0000000000000000);
        this.mClass.put("PropertyType",id_00080b0800001aae0000000000000000);
        // attribute BaseType

        MAttribute id_f9fa7e8727f011e2b500001ec947ccaf = new MAttribute("f9fa7e87-27f0-11e2-b500-001ec947ccaf","BaseType","00080b08-0000-1aae-0000-000000000000.exml",this.mBaseTypes.get("PropertyBaseType"),false,true,false);
        id_00080b0800001aae0000000000000000.getMAttributes().add(id_f9fa7e8727f011e2b500001ec947ccaf);



        //## class TypedPropertyTable ##

        MClass id_33915d38275811e2b500001ec947ccaf = new MClass("33915d38-2758-11e2-b500-001ec947ccaf","TypedPropertyTable","33915d38-2758-11e2-b500-001ec947ccaf.exml");
        id_61fcf793275311e2b500001ec947ccaf.getMClass().add(id_33915d38275811e2b500001ec947ccaf);
        this.mClass.put("TypedPropertyTable",id_33915d38275811e2b500001ec947ccaf);



        //##### Package matrix#####
        MPackage id_4b9cc988a81d480a94a89f9b0c482d01 = new MPackage("4b9cc988-a81d-480a-94a8-9f9b0c482d01","matrix","4b9cc988-a81d-480a-94a8-9f9b0c482d01.exml");
        id_00d00f24000000010000000000000000.getMPackages().add(id_4b9cc988a81d480a94a89f9b0c482d01);
        //## class MatrixDefinition ##

        MClass id_ab9e51db380945658a6e358a513131b3 = new MClass("ab9e51db-3809-4565-8a6e-358a513131b3","MatrixDefinition","ab9e51db-3809-4565-8a6e-358a513131b3.exml");
        id_4b9cc988a81d480a94a89f9b0c482d01.getMClass().add(id_ab9e51db380945658a6e358a513131b3);
        this.mClass.put("MatrixDefinition",id_ab9e51db380945658a6e358a513131b3);

        //## class QueryDefinition ##

        MClass id_b4912da933154ac6bd4a4605abd30f4e = new MClass("b4912da9-3315-4ac6-bd4a-4605abd30f4e","QueryDefinition","b4912da9-3315-4ac6-bd4a-4605abd30f4e.exml");
        id_4b9cc988a81d480a94a89f9b0c482d01.getMClass().add(id_b4912da933154ac6bd4a4605abd30f4e);
        this.mClass.put("QueryDefinition",id_b4912da933154ac6bd4a4605abd30f4e);
        // attribute UsingAdditions

        MAttribute id_d2a3fb572bc442cf83e2b562a7f35b2c = new MAttribute("d2a3fb57-2bc4-42cf-83e2-b562a7f35b2c","UsingAdditions","b4912da9-3315-4ac6-bd4a-4605abd30f4e.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_b4912da933154ac6bd4a4605abd30f4e.getMAttributes().add(id_d2a3fb572bc442cf83e2b562a7f35b2c);



        //## class MatrixValueDefinition ##

        MClass id_f6234e2dafe84b428f2687e416230908 = new MClass("f6234e2d-afe8-4b42-8f26-87e416230908","MatrixValueDefinition","f6234e2d-afe8-4b42-8f26-87e416230908.exml");
        id_4b9cc988a81d480a94a89f9b0c482d01.getMClass().add(id_f6234e2dafe84b428f2687e416230908);
        this.mClass.put("MatrixValueDefinition",id_f6234e2dafe84b428f2687e416230908);



        //## class Abstraction ##

        MClass id_0008152c00001ba90000000000000000 = new MClass("0008152c-0000-1ba9-0000-000000000000","Abstraction","0008152c-0000-1ba9-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0008152c00001ba90000000000000000);
        this.mClass.put("Abstraction",id_0008152c00001ba90000000000000000);
        // attribute Mapping

        MAttribute id_0008152c00001bab0000000000000000 = new MAttribute("0008152c-0000-1bab-0000-000000000000","Mapping","0008152c-0000-1ba9-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0008152c00001ba90000000000000000.getMAttributes().add(id_0008152c00001bab0000000000000000);



        //## class Constraint ##

        MClass id_0148033c00000cdd0000000000000000 = new MClass("0148033c-0000-0cdd-0000-000000000000","Constraint","0148033c-0000-0cdd-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0148033c00000cdd0000000000000000);
        this.mClass.put("Constraint",id_0148033c00000cdd0000000000000000);
        // attribute BaseClass

        MAttribute id_0148033c0001990d0000000000000000 = new MAttribute("0148033c-0001-990d-0000-000000000000","BaseClass","0148033c-0000-0cdd-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cdd0000000000000000.getMAttributes().add(id_0148033c0001990d0000000000000000);


        // attribute Body

        MAttribute id_0148033c0001990f0000000000000000 = new MAttribute("0148033c-0001-990f-0000-000000000000","Body","0148033c-0000-0cdd-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cdd0000000000000000.getMAttributes().add(id_0148033c0001990f0000000000000000);


        // attribute Language

        MAttribute id_69c516a0fede11e0afe9001ec947ccaf = new MAttribute("69c516a0-fede-11e0-afe9-001ec947ccaf","Language","0148033c-0000-0cdd-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cdd0000000000000000.getMAttributes().add(id_69c516a0fede11e0afe9001ec947ccaf);



        //## class Dependency ##

        MClass id_0148033c00000cf30000000000000000 = new MClass("0148033c-0000-0cf3-0000-000000000000","Dependency","0148033c-0000-0cf3-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0148033c00000cf30000000000000000);
        this.mClass.put("Dependency",id_0148033c00000cf30000000000000000);
        // attribute DependsOnId

        MAttribute id_0148033c00019b580000000000000000 = new MAttribute("0148033c-0001-9b58-0000-000000000000","DependsOnId","0148033c-0000-0cf3-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cf30000000000000000.getMAttributes().add(id_0148033c00019b580000000000000000);


        // attribute DependsOnName

        MAttribute id_0148033c00019b590000000000000000 = new MAttribute("0148033c-0001-9b59-0000-000000000000","DependsOnName","0148033c-0000-0cf3-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cf30000000000000000.getMAttributes().add(id_0148033c00019b590000000000000000);



        //## class Element ##

        MClass id_0148033c00000ca70000000000000000 = new MClass("0148033c-0000-0ca7-0000-000000000000","Element","0148033c-0000-0ca7-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0148033c00000ca70000000000000000);
        this.mClass.put("Element",id_0148033c00000ca70000000000000000);
        // attribute ModifDate

        MAttribute id_0148033c00019c050000000000000000 = new MAttribute("0148033c-0001-9c05-0000-000000000000","ModifDate","0148033c-0000-0ca7-0000-000000000000.exml",this.mBaseTypes.get("long"),false,true,false);
        id_0148033c00000ca70000000000000000.getMAttributes().add(id_0148033c00019c050000000000000000);



        //## class ModelElement ##

        MClass id_0148033c00000ca80000000000000000 = new MClass("0148033c-0000-0ca8-0000-000000000000","ModelElement","0148033c-0000-0ca8-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0148033c00000ca80000000000000000);
        this.mClass.put("ModelElement",id_0148033c00000ca80000000000000000);
        // attribute Name

        MAttribute id_0148033c0001a7230000000000000000 = new MAttribute("0148033c-0001-a723-0000-000000000000","Name","0148033c-0000-0ca8-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000ca80000000000000000.getMAttributes().add(id_0148033c0001a7230000000000000000);



        //## class ModelTree ##

        MClass id_0148033c00000ca90000000000000000 = new MClass("0148033c-0000-0ca9-0000-000000000000","ModelTree","0148033c-0000-0ca9-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0148033c00000ca90000000000000000);
        this.mClass.put("ModelTree",id_0148033c00000ca90000000000000000);

        //## class Note ##

        MClass id_0148033c00000cda0000000000000000 = new MClass("0148033c-0000-0cda-0000-000000000000","Note","0148033c-0000-0cda-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0148033c00000cda0000000000000000);
        this.mClass.put("Note",id_0148033c00000cda0000000000000000);
        // attribute Content

        MAttribute id_0148033c0001ad340000000000000000 = new MAttribute("0148033c-0001-ad34-0000-000000000000","Content","0148033c-0000-0cda-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cda0000000000000000.getMAttributes().add(id_0148033c0001ad340000000000000000);


        // attribute MimeType

        MAttribute id_95bfa3d6586f4b83acdd49a640fae2f2 = new MAttribute("95bfa3d6-586f-4b83-acdd-49a640fae2f2","MimeType","0148033c-0000-0cda-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cda0000000000000000.getMAttributes().add(id_95bfa3d6586f4b83acdd49a640fae2f2);



        //## class NoteType ##

        MClass id_0148033c00000cdb0000000000000000 = new MClass("0148033c-0000-0cdb-0000-000000000000","NoteType","0148033c-0000-0cdb-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0148033c00000cdb0000000000000000);
        this.mClass.put("NoteType",id_0148033c00000cdb0000000000000000);
        // attribute IsHidden

        MAttribute id_0148033c0001add30000000000000000 = new MAttribute("0148033c-0001-add3-0000-000000000000","IsHidden","0148033c-0000-0cdb-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cdb0000000000000000.getMAttributes().add(id_0148033c0001add30000000000000000);


        // attribute LabelKey

        MAttribute id_b2bdc210574511de9197001ec947ccaf = new MAttribute("b2bdc210-5745-11de-9197-001ec947ccaf","LabelKey","0148033c-0000-0cdb-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cdb0000000000000000.getMAttributes().add(id_b2bdc210574511de9197001ec947ccaf);


        // attribute MimeType

        MAttribute id_060eaeee314449b7bdca98b2fde75d56 = new MAttribute("060eaeee-3144-49b7-bdca-98b2fde75d56","MimeType","0148033c-0000-0cdb-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cdb0000000000000000.getMAttributes().add(id_060eaeee314449b7bdca98b2fde75d56);



        //## class Profile ##

        MClass id_0148033c00000cbc0000000000000000 = new MClass("0148033c-0000-0cbc-0000-000000000000","Profile","0148033c-0000-0cbc-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0148033c00000cbc0000000000000000);
        this.mClass.put("Profile",id_0148033c00000cbc0000000000000000);
        // attribute JCode

        MAttribute id_f6b0da6c398e11de8c9d001ec947ccaf = new MAttribute("f6b0da6c-398e-11de-8c9d-001ec947ccaf","JCode","0148033c-0000-0cbc-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cbc0000000000000000.getMAttributes().add(id_f6b0da6c398e11de8c9d001ec947ccaf);



        //## class Stereotype ##

        MClass id_0148033c00000cdc0000000000000000 = new MClass("0148033c-0000-0cdc-0000-000000000000","Stereotype","0148033c-0000-0cdc-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0148033c00000cdc0000000000000000);
        this.mClass.put("Stereotype",id_0148033c00000cdc0000000000000000);
        // attribute Image

        MAttribute id_0148033c0001bccf0000000000000000 = new MAttribute("0148033c-0001-bccf-0000-000000000000","Image","0148033c-0000-0cdc-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cdc0000000000000000.getMAttributes().add(id_0148033c0001bccf0000000000000000);


        // attribute Icon

        MAttribute id_0148033c0001bcd70000000000000000 = new MAttribute("0148033c-0001-bcd7-0000-000000000000","Icon","0148033c-0000-0cdc-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cdc0000000000000000.getMAttributes().add(id_0148033c0001bcd70000000000000000);


        // attribute IsHidden

        MAttribute id_0148033c0001bcd50000000000000000 = new MAttribute("0148033c-0001-bcd5-0000-000000000000","IsHidden","0148033c-0000-0cdc-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cdc0000000000000000.getMAttributes().add(id_0148033c0001bcd50000000000000000);


        // attribute LabelKey

        MAttribute id_01f420d000036f340000000000000000 = new MAttribute("01f420d0-0003-6f34-0000-000000000000","LabelKey","0148033c-0000-0cdc-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cdc0000000000000000.getMAttributes().add(id_01f420d000036f340000000000000000);


        // attribute BaseClassName

        MAttribute id_071169734c6211de884f001ec947ccaf = new MAttribute("07116973-4c62-11de-884f-001ec947ccaf","BaseClassName","0148033c-0000-0cdc-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cdc0000000000000000.getMAttributes().add(id_071169734c6211de884f001ec947ccaf);



        //## class Substitution ##

        MClass id_0008152c00001bb30000000000000000 = new MClass("0008152c-0000-1bb3-0000-000000000000","Substitution","0008152c-0000-1bb3-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0008152c00001bb30000000000000000);
        this.mClass.put("Substitution",id_0008152c00001bb30000000000000000);

        //## class TagParameter ##

        MClass id_0148033c00000cd70000000000000000 = new MClass("0148033c-0000-0cd7-0000-000000000000","TagParameter","0148033c-0000-0cd7-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0148033c00000cd70000000000000000);
        this.mClass.put("TagParameter",id_0148033c00000cd70000000000000000);
        // attribute Value

        MAttribute id_0148033c0001bd710000000000000000 = new MAttribute("0148033c-0001-bd71-0000-000000000000","Value","0148033c-0000-0cd7-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cd70000000000000000.getMAttributes().add(id_0148033c0001bd710000000000000000);



        //## class TagType ##

        MClass id_0148033c00000cd80000000000000000 = new MClass("0148033c-0000-0cd8-0000-000000000000","TagType","0148033c-0000-0cd8-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0148033c00000cd80000000000000000);
        this.mClass.put("TagType",id_0148033c00000cd80000000000000000);
        // attribute ParamNumber

        MAttribute id_41e02b68415811dea777001ec947ccaf = new MAttribute("41e02b68-4158-11de-a777-001ec947ccaf","ParamNumber","0148033c-0000-0cd8-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cd80000000000000000.getMAttributes().add(id_41e02b68415811dea777001ec947ccaf);


        // attribute IsQualified

        MAttribute id_0148033c0001bddc0000000000000000 = new MAttribute("0148033c-0001-bddc-0000-000000000000","IsQualified","0148033c-0000-0cd8-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cd80000000000000000.getMAttributes().add(id_0148033c0001bddc0000000000000000);


        // attribute BelongToPrototype

        MAttribute id_0148033c0001bddf0000000000000000 = new MAttribute("0148033c-0001-bddf-0000-000000000000","BelongToPrototype","0148033c-0000-0cd8-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cd80000000000000000.getMAttributes().add(id_0148033c0001bddf0000000000000000);


        // attribute IsHidden

        MAttribute id_0148033c0001bde20000000000000000 = new MAttribute("0148033c-0001-bde2-0000-000000000000","IsHidden","0148033c-0000-0cd8-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cd80000000000000000.getMAttributes().add(id_0148033c0001bde20000000000000000);


        // attribute LabelKey

        MAttribute id_a9320fbc574511de9197001ec947ccaf = new MAttribute("a9320fbc-5745-11de-9197-001ec947ccaf","LabelKey","0148033c-0000-0cd8-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cd80000000000000000.getMAttributes().add(id_a9320fbc574511de9197001ec947ccaf);



        //## class TaggedValue ##

        MClass id_0148033c00000cd50000000000000000 = new MClass("0148033c-0000-0cd5-0000-000000000000","TaggedValue","0148033c-0000-0cd5-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0148033c00000cd50000000000000000);
        this.mClass.put("TaggedValue",id_0148033c00000cd50000000000000000);

        //## class Usage ##

        MClass id_00281854000003fa0000000000000000 = new MClass("00281854-0000-03fa-0000-000000000000","Usage","00281854-0000-03fa-0000-000000000000.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_00281854000003fa0000000000000000);
        this.mClass.put("Usage",id_00281854000003fa0000000000000000);

        //## class MetaclassReference ##

        MClass id_0319598d413e11dea777001ec947ccaf = new MClass("0319598d-413e-11de-a777-001ec947ccaf","MetaclassReference","0319598d-413e-11de-a777-001ec947ccaf.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_0319598d413e11dea777001ec947ccaf);
        this.mClass.put("MetaclassReference",id_0319598d413e11dea777001ec947ccaf);
        // attribute ReferencedClassName

        MAttribute id_217d216a4c6211de884f001ec947ccaf = new MAttribute("217d216a-4c62-11de-884f-001ec947ccaf","ReferencedClassName","0319598d-413e-11de-a777-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0319598d413e11dea777001ec947ccaf.getMAttributes().add(id_217d216a4c6211de884f001ec947ccaf);



        //## class ExternDocument ##

        MClass id_62e2c6f7faef11e08de7001ec947ccaf = new MClass("62e2c6f7-faef-11e0-8de7-001ec947ccaf","ExternDocument","62e2c6f7-faef-11e0-8de7-001ec947ccaf.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_62e2c6f7faef11e08de7001ec947ccaf);
        this.mClass.put("ExternDocument",id_62e2c6f7faef11e08de7001ec947ccaf);
        // attribute MimeType

        MAttribute id_835b184dfaf411e08de7001ec947ccaf = new MAttribute("835b184d-faf4-11e0-8de7-001ec947ccaf","MimeType","62e2c6f7-faef-11e0-8de7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_62e2c6f7faef11e08de7001ec947ccaf.getMAttributes().add(id_835b184dfaf411e08de7001ec947ccaf);


        // attribute Path

        MAttribute id_bf6614d1fb1c11e08de7001ec947ccaf = new MAttribute("bf6614d1-fb1c-11e0-8de7-001ec947ccaf","Path","62e2c6f7-faef-11e0-8de7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_62e2c6f7faef11e08de7001ec947ccaf.getMAttributes().add(id_bf6614d1fb1c11e08de7001ec947ccaf);


        // attribute Abstract

        MAttribute id_bfd884f1fb1c11e08de7001ec947ccaf = new MAttribute("bfd884f1-fb1c-11e0-8de7-001ec947ccaf","Abstract","62e2c6f7-faef-11e0-8de7-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_62e2c6f7faef11e08de7001ec947ccaf.getMAttributes().add(id_bfd884f1fb1c11e08de7001ec947ccaf);



        //## class ExternDocumentType ##

        MClass id_623fb2f8056f11e18525001ec947ccaf = new MClass("623fb2f8-056f-11e1-8525-001ec947ccaf","ExternDocumentType","623fb2f8-056f-11e1-8525-001ec947ccaf.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_623fb2f8056f11e18525001ec947ccaf);
        this.mClass.put("ExternDocumentType",id_623fb2f8056f11e18525001ec947ccaf);
        // attribute IsHidden

        MAttribute id_7d59ae04056f11e18525001ec947ccaf = new MAttribute("7d59ae04-056f-11e1-8525-001ec947ccaf","IsHidden","623fb2f8-056f-11e1-8525-001ec947ccaf.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_623fb2f8056f11e18525001ec947ccaf.getMAttributes().add(id_7d59ae04056f11e18525001ec947ccaf);


        // attribute LabelKey

        MAttribute id_7d59ae05056f11e18525001ec947ccaf = new MAttribute("7d59ae05-056f-11e1-8525-001ec947ccaf","LabelKey","623fb2f8-056f-11e1-8525-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_623fb2f8056f11e18525001ec947ccaf.getMAttributes().add(id_7d59ae05056f11e18525001ec947ccaf);


        // attribute Icon

        MAttribute id_57dac6ef060211e18c5c001ec947ccaf = new MAttribute("57dac6ef-0602-11e1-8c5c-001ec947ccaf","Icon","623fb2f8-056f-11e1-8525-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_623fb2f8056f11e18525001ec947ccaf.getMAttributes().add(id_57dac6ef060211e18c5c001ec947ccaf);


        // attribute Image

        MAttribute id_74a1e942060211e18c5c001ec947ccaf = new MAttribute("74a1e942-0602-11e1-8c5c-001ec947ccaf","Image","623fb2f8-056f-11e1-8525-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_623fb2f8056f11e18525001ec947ccaf.getMAttributes().add(id_74a1e942060211e18c5c001ec947ccaf);



        //## class ExternProcessor ##

        MClass id_b6c3f99748ef42529a4770ecbe642cb3 = new MClass("b6c3f997-48ef-4252-9a47-70ecbe642cb3","ExternProcessor","b6c3f997-48ef-4252-9a47-70ecbe642cb3.exml");
        id_00d00f24000000010000000000000000.getMClass().add(id_b6c3f99748ef42529a4770ecbe642cb3);
        this.mClass.put("ExternProcessor",id_b6c3f99748ef42529a4770ecbe642cb3);
        // attribute ClassName

        MAttribute id_25c770c22e2949a39f043257a71ebca3 = new MAttribute("25c770c2-2e29-49a3-9f04-3257a71ebca3","ClassName","b6c3f997-48ef-4252-9a47-70ecbe642cb3.exml",this.mBaseTypes.get("string"),false,true,false);
        id_b6c3f99748ef42529a4770ecbe642cb3.getMAttributes().add(id_25c770c22e2949a39f043257a71ebca3);





        //##### Package statik#####
        MPackage id_00d00f24000000020000000000000000 = new MPackage("00d00f24-0000-0002-0000-000000000000","statik","00d00f24-0000-0002-0000-000000000000.exml");
        id_01f4038c000042d60000000000000000.getMPackages().add(id_00d00f24000000020000000000000000);
        //## class Artifact ##

        MClass id_0148033c00000cea0000000000000000 = new MClass("0148033c-0000-0cea-0000-000000000000","Artifact","0148033c-0000-0cea-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cea0000000000000000);
        this.mClass.put("Artifact",id_0148033c00000cea0000000000000000);
        // attribute FileName

        MAttribute id_0008152c00001c530000000000000000 = new MAttribute("0008152c-0000-1c53-0000-000000000000","FileName","0148033c-0000-0cea-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cea0000000000000000.getMAttributes().add(id_0008152c00001c530000000000000000);



        //## class Association ##

        MClass id_959e3d6cc0ae4ff8a452e5a33f0ca7f7 = new MClass("959e3d6c-c0ae-4ff8-a452-e5a33f0ca7f7","Association","959e3d6c-c0ae-4ff8-a452-e5a33f0ca7f7.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_959e3d6cc0ae4ff8a452e5a33f0ca7f7);
        this.mClass.put("Association",id_959e3d6cc0ae4ff8a452e5a33f0ca7f7);

        //## class AssociationEnd ##

        MClass id_0148033c00000cb60000000000000000 = new MClass("0148033c-0000-0cb6-0000-000000000000","AssociationEnd","0148033c-0000-0cb6-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cb60000000000000000);
        this.mClass.put("AssociationEnd",id_0148033c00000cb60000000000000000);
        // attribute Aggregation

        MAttribute id_0148033c00018a8b0000000000000000 = new MAttribute("0148033c-0001-8a8b-0000-000000000000","Aggregation","0148033c-0000-0cb6-0000-000000000000.exml",this.mBaseTypes.get("AggregationKind"),false,true,false);
        id_0148033c00000cb60000000000000000.getMAttributes().add(id_0148033c00018a8b0000000000000000);


        // attribute IsChangeable

        MAttribute id_0148033c00018a8e0000000000000000 = new MAttribute("0148033c-0001-8a8e-0000-000000000000","IsChangeable","0148033c-0000-0cb6-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cb60000000000000000.getMAttributes().add(id_0148033c00018a8e0000000000000000);


        // attribute Navigability

        MAttribute id_9a308888441841fd909936640131d63c = new MAttribute("9a308888-4418-41fd-9099-36640131d63c","Navigability","0148033c-0000-0cb6-0000-000000000000.exml",this.mBaseTypes.get("Navigability"),false,true,false);
        id_0148033c00000cb60000000000000000.getMAttributes().add(id_9a308888441841fd909936640131d63c);



        //## class Attribute ##

        MClass id_0148033c00000cb20000000000000000 = new MClass("0148033c-0000-0cb2-0000-000000000000","Attribute","0148033c-0000-0cb2-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cb20000000000000000);
        this.mClass.put("Attribute",id_0148033c00000cb20000000000000000);
        // attribute TypeConstraint

        MAttribute id_0148033c00018e900000000000000000 = new MAttribute("0148033c-0001-8e90-0000-000000000000","TypeConstraint","0148033c-0000-0cb2-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cb20000000000000000.getMAttributes().add(id_0148033c00018e900000000000000000);


        // attribute Value

        MAttribute id_0148033c00018e9b0000000000000000 = new MAttribute("0148033c-0001-8e9b-0000-000000000000","Value","0148033c-0000-0cb2-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cb20000000000000000.getMAttributes().add(id_0148033c00018e9b0000000000000000);


        // attribute TargetIsClass

        MAttribute id_0148033c00018e980000000000000000 = new MAttribute("0148033c-0001-8e98-0000-000000000000","TargetIsClass","0148033c-0000-0cb2-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cb20000000000000000.getMAttributes().add(id_0148033c00018e980000000000000000);



        //## class AttributeLink ##

        MClass id_0148033c00000cc50000000000000000 = new MClass("0148033c-0000-0cc5-0000-000000000000","AttributeLink","0148033c-0000-0cc5-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cc50000000000000000);
        this.mClass.put("AttributeLink",id_0148033c00000cc50000000000000000);
        // attribute Value

        MAttribute id_0148033c00018f850000000000000000 = new MAttribute("0148033c-0001-8f85-0000-000000000000","Value","0148033c-0000-0cc5-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cc50000000000000000.getMAttributes().add(id_0148033c00018f850000000000000000);



        //## class BehavioralFeature ##

        MClass id_0018d04ecc011f43b54d001ec947cd2a = new MClass("0018d04e-cc01-1f43-b54d-001ec947cd2a","BehavioralFeature","0018d04e-cc01-1f43-b54d-001ec947cd2a.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0018d04ecc011f43b54d001ec947cd2a);
        this.mClass.put("BehavioralFeature",id_0018d04ecc011f43b54d001ec947cd2a);

        //## class BindableInstance ##

        MClass id_002818540000175f0000000000000000 = new MClass("00281854-0000-175f-0000-000000000000","BindableInstance","00281854-0000-175f-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_002818540000175f0000000000000000);
        this.mClass.put("BindableInstance",id_002818540000175f0000000000000000);

        //## class Binding ##

        MClass id_0008152c00001bad0000000000000000 = new MClass("0008152c-0000-1bad-0000-000000000000","Binding","0008152c-0000-1bad-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0008152c00001bad0000000000000000);
        this.mClass.put("Binding",id_0008152c00001bad0000000000000000);

        //## class Class ##

        MClass id_0148033c00000cae0000000000000000 = new MClass("0148033c-0000-0cae-0000-000000000000","Class","0148033c-0000-0cae-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cae0000000000000000);
        this.mClass.put("Class",id_0148033c00000cae0000000000000000);
        // attribute IsActive

        MAttribute id_0148033c000190820000000000000000 = new MAttribute("0148033c-0001-9082-0000-000000000000","IsActive","0148033c-0000-0cae-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cae0000000000000000.getMAttributes().add(id_0148033c000190820000000000000000);


        // attribute IsMain

        MAttribute id_0148033c0001907f0000000000000000 = new MAttribute("0148033c-0001-907f-0000-000000000000","IsMain","0148033c-0000-0cae-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cae0000000000000000.getMAttributes().add(id_0148033c0001907f0000000000000000);



        //## class ClassAssociation ##

        MClass id_0148033c00000cb70000000000000000 = new MClass("0148033c-0000-0cb7-0000-000000000000","ClassAssociation","0148033c-0000-0cb7-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cb70000000000000000);
        this.mClass.put("ClassAssociation",id_0148033c00000cb70000000000000000);

        //## class Classifier ##

        MClass id_0148033c00000cac0000000000000000 = new MClass("0148033c-0000-0cac-0000-000000000000","Classifier","0148033c-0000-0cac-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cac0000000000000000);
        this.mClass.put("Classifier",id_0148033c00000cac0000000000000000);

        //## class Collaboration ##

        MClass id_0148033c00000cc00000000000000000 = new MClass("0148033c-0000-0cc0-0000-000000000000","Collaboration","0148033c-0000-0cc0-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cc00000000000000000);
        this.mClass.put("Collaboration",id_0148033c00000cc00000000000000000);
        // attribute IsConcurrent

        MAttribute id_0148033c000196210000000000000000 = new MAttribute("0148033c-0001-9621-0000-000000000000","IsConcurrent","0148033c-0000-0cc0-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cc00000000000000000.getMAttributes().add(id_0148033c000196210000000000000000);



        //## class CollaborationUse ##

        MClass id_0008152c00001bae0000000000000000 = new MClass("0008152c-0000-1bae-0000-000000000000","CollaborationUse","0008152c-0000-1bae-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0008152c00001bae0000000000000000);
        this.mClass.put("CollaborationUse",id_0008152c00001bae0000000000000000);

        //## class Component ##

        MClass id_0008152c00001baf0000000000000000 = new MClass("0008152c-0000-1baf-0000-000000000000","Component","0008152c-0000-1baf-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0008152c00001baf0000000000000000);
        this.mClass.put("Component",id_0008152c00001baf0000000000000000);

        //## class ComponentRealization ##

        MClass id_813e41d66d9649658e075d93eddfc0e8 = new MClass("813e41d6-6d96-4965-8e07-5d93eddfc0e8","ComponentRealization","813e41d6-6d96-4965-8e07-5d93eddfc0e8.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_813e41d66d9649658e075d93eddfc0e8);
        this.mClass.put("ComponentRealization",id_813e41d66d9649658e075d93eddfc0e8);

        //## class Connector ##

        MClass id_df84dd12901a4a1ab6ddd7315d28e746 = new MClass("df84dd12-901a-4a1a-b6dd-d7315d28e746","Connector","df84dd12-901a-4a1a-b6dd-d7315d28e746.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_df84dd12901a4a1ab6ddd7315d28e746);
        this.mClass.put("Connector",id_df84dd12901a4a1ab6ddd7315d28e746);

        //## class ConnectorEnd ##

        MClass id_00281854000017c60000000000000000 = new MClass("00281854-0000-17c6-0000-000000000000","ConnectorEnd","00281854-0000-17c6-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_00281854000017c60000000000000000);
        this.mClass.put("ConnectorEnd",id_00281854000017c60000000000000000);

        //## class DataType ##

        MClass id_0148033c00000caf0000000000000000 = new MClass("0148033c-0000-0caf-0000-000000000000","DataType","0148033c-0000-0caf-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000caf0000000000000000);
        this.mClass.put("DataType",id_0148033c00000caf0000000000000000);

        //## class ElementImport ##

        MClass id_0008152c00001bb00000000000000000 = new MClass("0008152c-0000-1bb0-0000-000000000000","ElementImport","0008152c-0000-1bb0-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0008152c00001bb00000000000000000);
        this.mClass.put("ElementImport",id_0008152c00001bb00000000000000000);
        // attribute Visibility

        MAttribute id_0008152c00001d400000000000000000 = new MAttribute("0008152c-0000-1d40-0000-000000000000","Visibility","0008152c-0000-1bb0-0000-000000000000.exml",this.mBaseTypes.get("VisibilityMode"),false,true,false);
        id_0008152c00001bb00000000000000000.getMAttributes().add(id_0008152c00001d400000000000000000);



        //## class ElementRealization ##

        MClass id_0008152c00001bb90000000000000000 = new MClass("0008152c-0000-1bb9-0000-000000000000","ElementRealization","0008152c-0000-1bb9-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0008152c00001bb90000000000000000);
        this.mClass.put("ElementRealization",id_0008152c00001bb90000000000000000);

        //## class Enumeration ##

        MClass id_0148033c00000cb00000000000000000 = new MClass("0148033c-0000-0cb0-0000-000000000000","Enumeration","0148033c-0000-0cb0-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cb00000000000000000);
        this.mClass.put("Enumeration",id_0148033c00000cb00000000000000000);

        //## class EnumerationLiteral ##

        MClass id_0148033c00000cbb0000000000000000 = new MClass("0148033c-0000-0cbb-0000-000000000000","EnumerationLiteral","0148033c-0000-0cbb-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cbb0000000000000000);
        this.mClass.put("EnumerationLiteral",id_0148033c00000cbb0000000000000000);

        //## class Feature ##

        MClass id_0148033c00000cb10000000000000000 = new MClass("0148033c-0000-0cb1-0000-000000000000","Feature","0148033c-0000-0cb1-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cb10000000000000000);
        this.mClass.put("Feature",id_0148033c00000cb10000000000000000);
        // attribute Visibility

        MAttribute id_0148033c00019ecd0000000000000000 = new MAttribute("0148033c-0001-9ecd-0000-000000000000","Visibility","0148033c-0000-0cb1-0000-000000000000.exml",this.mBaseTypes.get("VisibilityMode"),false,true,false);
        id_0148033c00000cb10000000000000000.getMAttributes().add(id_0148033c00019ecd0000000000000000);


        // attribute IsClass

        MAttribute id_0148033c00019ed00000000000000000 = new MAttribute("0148033c-0001-9ed0-0000-000000000000","IsClass","0148033c-0000-0cb1-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cb10000000000000000.getMAttributes().add(id_0148033c00019ed00000000000000000);


        // attribute IsAbstract

        MAttribute id_0148033c00019ed30000000000000000 = new MAttribute("0148033c-0001-9ed3-0000-000000000000","IsAbstract","0148033c-0000-0cb1-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cb10000000000000000.getMAttributes().add(id_0148033c00019ed30000000000000000);



        //## class GeneralClass ##

        MClass id_0148033c00000cad0000000000000000 = new MClass("0148033c-0000-0cad-0000-000000000000","GeneralClass","0148033c-0000-0cad-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cad0000000000000000);
        this.mClass.put("GeneralClass",id_0148033c00000cad0000000000000000);
        // attribute IsElementary

        MAttribute id_0148033c00019f900000000000000000 = new MAttribute("0148033c-0001-9f90-0000-000000000000","IsElementary","0148033c-0000-0cad-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cad0000000000000000.getMAttributes().add(id_0148033c00019f900000000000000000);



        //## class Generalization ##

        MClass id_0148033c00000cb80000000000000000 = new MClass("0148033c-0000-0cb8-0000-000000000000","Generalization","0148033c-0000-0cb8-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cb80000000000000000);
        this.mClass.put("Generalization",id_0148033c00000cb80000000000000000);
        // attribute Discriminator

        MAttribute id_0148033c0001a0830000000000000000 = new MAttribute("0148033c-0001-a083-0000-000000000000","Discriminator","0148033c-0000-0cb8-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cb80000000000000000.getMAttributes().add(id_0148033c0001a0830000000000000000);



        //## class Instance ##

        MClass id_0148033c00000cc30000000000000000 = new MClass("0148033c-0000-0cc3-0000-000000000000","Instance","0148033c-0000-0cc3-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cc30000000000000000);
        this.mClass.put("Instance",id_0148033c00000cc30000000000000000);
        // attribute IsConstant

        MAttribute id_0008152c000021470000000000000000 = new MAttribute("0008152c-0000-2147-0000-000000000000","IsConstant","0148033c-0000-0cc3-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cc30000000000000000.getMAttributes().add(id_0008152c000021470000000000000000);


        // attribute MultiplicityMin

        MAttribute id_0008152c00001bdf0000000000000000 = new MAttribute("0008152c-0000-1bdf-0000-000000000000","MultiplicityMin","0148033c-0000-0cc3-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cc30000000000000000.getMAttributes().add(id_0008152c00001bdf0000000000000000);


        // attribute MultiplicityMax

        MAttribute id_0008152c00001be20000000000000000 = new MAttribute("0008152c-0000-1be2-0000-000000000000","MultiplicityMax","0148033c-0000-0cc3-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cc30000000000000000.getMAttributes().add(id_0008152c00001be20000000000000000);


        // attribute Value

        MAttribute id_0008152c0000214b0000000000000000 = new MAttribute("0008152c-0000-214b-0000-000000000000","Value","0148033c-0000-0cc3-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cc30000000000000000.getMAttributes().add(id_0008152c0000214b0000000000000000);



        //## class Interface ##

        MClass id_0008152c00001bba0000000000000000 = new MClass("0008152c-0000-1bba-0000-000000000000","Interface","0008152c-0000-1bba-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0008152c00001bba0000000000000000);
        this.mClass.put("Interface",id_0008152c00001bba0000000000000000);

        //## class InterfaceRealization ##

        MClass id_0148033c00000cbd0000000000000000 = new MClass("0148033c-0000-0cbd-0000-000000000000","InterfaceRealization","0148033c-0000-0cbd-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cbd0000000000000000);
        this.mClass.put("InterfaceRealization",id_0148033c00000cbd0000000000000000);

        //## class Link ##

        MClass id_98d3241e2d3840ddbbcb3c1e7c513035 = new MClass("98d3241e-2d38-40dd-bbcb-3c1e7c513035","Link","98d3241e-2d38-40dd-bbcb-3c1e7c513035.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_98d3241e2d3840ddbbcb3c1e7c513035);
        this.mClass.put("Link",id_98d3241e2d3840ddbbcb3c1e7c513035);

        //## class LinkEnd ##

        MClass id_0148033c00000ccc0000000000000000 = new MClass("0148033c-0000-0ccc-0000-000000000000","LinkEnd","0148033c-0000-0ccc-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000ccc0000000000000000);
        this.mClass.put("LinkEnd",id_0148033c00000ccc0000000000000000);
        // attribute IsOrdered

        MAttribute id_0008152c00001beb0000000000000000 = new MAttribute("0008152c-0000-1beb-0000-000000000000","IsOrdered","0148033c-0000-0ccc-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000ccc0000000000000000.getMAttributes().add(id_0008152c00001beb0000000000000000);


        // attribute IsUnique

        MAttribute id_0008152c00001bf30000000000000000 = new MAttribute("0008152c-0000-1bf3-0000-000000000000","IsUnique","0148033c-0000-0ccc-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000ccc0000000000000000.getMAttributes().add(id_0008152c00001bf30000000000000000);


        // attribute MultiplicityMax

        MAttribute id_0008152c00001be80000000000000000 = new MAttribute("0008152c-0000-1be8-0000-000000000000","MultiplicityMax","0148033c-0000-0ccc-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000ccc0000000000000000.getMAttributes().add(id_0008152c00001be80000000000000000);


        // attribute MultiplicityMin

        MAttribute id_0008152c00001be50000000000000000 = new MAttribute("0008152c-0000-1be5-0000-000000000000","MultiplicityMin","0148033c-0000-0ccc-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000ccc0000000000000000.getMAttributes().add(id_0008152c00001be50000000000000000);


        // attribute Navigability

        MAttribute id_6fac653d0ea143e3913271939253c4cb = new MAttribute("6fac653d-0ea1-43e3-9132-71939253c4cb","Navigability","0148033c-0000-0ccc-0000-000000000000.exml",this.mBaseTypes.get("Navigability"),false,true,false);
        id_0148033c00000ccc0000000000000000.getMAttributes().add(id_6fac653d0ea143e3913271939253c4cb);



        //## class Manifestation ##

        MClass id_0008152c00001bb60000000000000000 = new MClass("0008152c-0000-1bb6-0000-000000000000","Manifestation","0008152c-0000-1bb6-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0008152c00001bb60000000000000000);
        this.mClass.put("Manifestation",id_0008152c00001bb60000000000000000);

        //## class NameSpace ##

        MClass id_0148033c00000caa0000000000000000 = new MClass("0148033c-0000-0caa-0000-000000000000","NameSpace","0148033c-0000-0caa-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000caa0000000000000000);
        this.mClass.put("NameSpace",id_0148033c00000caa0000000000000000);
        // attribute IsAbstract

        MAttribute id_0148033c0001a9aa0000000000000000 = new MAttribute("0148033c-0001-a9aa-0000-000000000000","IsAbstract","0148033c-0000-0caa-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000caa0000000000000000.getMAttributes().add(id_0148033c0001a9aa0000000000000000);


        // attribute IsLeaf

        MAttribute id_0148033c0001a9ad0000000000000000 = new MAttribute("0148033c-0001-a9ad-0000-000000000000","IsLeaf","0148033c-0000-0caa-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000caa0000000000000000.getMAttributes().add(id_0148033c0001a9ad0000000000000000);


        // attribute IsRoot

        MAttribute id_0148033c0001a9b00000000000000000 = new MAttribute("0148033c-0001-a9b0-0000-000000000000","IsRoot","0148033c-0000-0caa-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000caa0000000000000000.getMAttributes().add(id_0148033c0001a9b00000000000000000);


        // attribute Visibility

        MAttribute id_0148033c0001a9b30000000000000000 = new MAttribute("0148033c-0001-a9b3-0000-000000000000","Visibility","0148033c-0000-0caa-0000-000000000000.exml",this.mBaseTypes.get("VisibilityMode"),false,true,false);
        id_0148033c00000caa0000000000000000.getMAttributes().add(id_0148033c0001a9b30000000000000000);



        //## class NamespaceUse ##

        MClass id_002818540000040b0000000000000000 = new MClass("00281854-0000-040b-0000-000000000000","NamespaceUse","00281854-0000-040b-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_002818540000040b0000000000000000);
        this.mClass.put("NamespaceUse",id_002818540000040b0000000000000000);

        //## class NaryAssociationEnd ##

        MClass id_0006801acc2c1f43b54d001ec947cd2a = new MClass("0006801a-cc2c-1f43-b54d-001ec947cd2a","NaryAssociationEnd","0006801a-cc2c-1f43-b54d-001ec947cd2a.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0006801acc2c1f43b54d001ec947cd2a);
        this.mClass.put("NaryAssociationEnd",id_0006801acc2c1f43b54d001ec947cd2a);

        //## class NaryAssociation ##

        MClass id_006bd1b8cc381f43b54d001ec947cd2a = new MClass("006bd1b8-cc38-1f43-b54d-001ec947cd2a","NaryAssociation","006bd1b8-cc38-1f43-b54d-001ec947cd2a.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_006bd1b8cc381f43b54d001ec947cd2a);
        this.mClass.put("NaryAssociation",id_006bd1b8cc381f43b54d001ec947cd2a);

        //## class NaryConnector ##

        MClass id_002818540000175e0000000000000000 = new MClass("00281854-0000-175e-0000-000000000000","NaryConnector","00281854-0000-175e-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_002818540000175e0000000000000000);
        this.mClass.put("NaryConnector",id_002818540000175e0000000000000000);

        //## class NaryConnectorEnd ##

        MClass id_002df582147d10a188a0001ec947cd2a = new MClass("002df582-147d-10a1-88a0-001ec947cd2a","NaryConnectorEnd","002df582-147d-10a1-88a0-001ec947cd2a.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_002df582147d10a188a0001ec947cd2a);
        this.mClass.put("NaryConnectorEnd",id_002df582147d10a188a0001ec947cd2a);

        //## class NaryLink ##

        MClass id_003da3e2123f1f46b1d2001ec947cd2a = new MClass("003da3e2-123f-1f46-b1d2-001ec947cd2a","NaryLink","003da3e2-123f-1f46-b1d2-001ec947cd2a.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_003da3e2123f1f46b1d2001ec947cd2a);
        this.mClass.put("NaryLink",id_003da3e2123f1f46b1d2001ec947cd2a);

        //## class NaryLinkEnd ##

        MClass id_00139d9a131a10a188a0001ec947cd2a = new MClass("00139d9a-131a-10a1-88a0-001ec947cd2a","NaryLinkEnd","00139d9a-131a-10a1-88a0-001ec947cd2a.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_00139d9a131a10a188a0001ec947cd2a);
        this.mClass.put("NaryLinkEnd",id_00139d9a131a10a188a0001ec947cd2a);
        // attribute IsOrdered

        MAttribute id_0013a7a4131a10a188a0001ec947cd2a = new MAttribute("0013a7a4-131a-10a1-88a0-001ec947cd2a","IsOrdered","00139d9a-131a-10a1-88a0-001ec947cd2a.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00139d9a131a10a188a0001ec947cd2a.getMAttributes().add(id_0013a7a4131a10a188a0001ec947cd2a);


        // attribute IsUnique

        MAttribute id_0013a89e131a10a188a0001ec947cd2a = new MAttribute("0013a89e-131a-10a1-88a0-001ec947cd2a","IsUnique","00139d9a-131a-10a1-88a0-001ec947cd2a.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00139d9a131a10a188a0001ec947cd2a.getMAttributes().add(id_0013a89e131a10a188a0001ec947cd2a);


        // attribute MultiplicityMax

        MAttribute id_0013abf0131a10a188a0001ec947cd2a = new MAttribute("0013abf0-131a-10a1-88a0-001ec947cd2a","MultiplicityMax","00139d9a-131a-10a1-88a0-001ec947cd2a.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00139d9a131a10a188a0001ec947cd2a.getMAttributes().add(id_0013abf0131a10a188a0001ec947cd2a);


        // attribute MultiplicityMin

        MAttribute id_0013acf4131a10a188a0001ec947cd2a = new MAttribute("0013acf4-131a-10a1-88a0-001ec947cd2a","MultiplicityMin","00139d9a-131a-10a1-88a0-001ec947cd2a.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00139d9a131a10a188a0001ec947cd2a.getMAttributes().add(id_0013acf4131a10a188a0001ec947cd2a);



        //## class Node ##

        MClass id_0148033c00000ce90000000000000000 = new MClass("0148033c-0000-0ce9-0000-000000000000","Node","0148033c-0000-0ce9-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000ce90000000000000000);
        this.mClass.put("Node",id_0148033c00000ce90000000000000000);

        //## class Operation ##

        MClass id_0148033c00000cb30000000000000000 = new MClass("0148033c-0000-0cb3-0000-000000000000","Operation","0148033c-0000-0cb3-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cb30000000000000000);
        this.mClass.put("Operation",id_0148033c00000cb30000000000000000);
        // attribute Concurrency

        MAttribute id_0148033c0001aef10000000000000000 = new MAttribute("0148033c-0001-aef1-0000-000000000000","Concurrency","0148033c-0000-0cb3-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cb30000000000000000.getMAttributes().add(id_0148033c0001aef10000000000000000);


        // attribute Final

        MAttribute id_0148033c0001aeec0000000000000000 = new MAttribute("0148033c-0001-aeec-0000-000000000000","Final","0148033c-0000-0cb3-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cb30000000000000000.getMAttributes().add(id_0148033c0001aeec0000000000000000);


        // attribute Passing

        MAttribute id_0148033c0001aee70000000000000000 = new MAttribute("0148033c-0001-aee7-0000-000000000000","Passing","0148033c-0000-0cb3-0000-000000000000.exml",this.mBaseTypes.get("MethodPassingMode"),false,true,false);
        id_0148033c00000cb30000000000000000.getMAttributes().add(id_0148033c0001aee70000000000000000);



        //## class Package ##

        MClass id_0148033c00000cab0000000000000000 = new MClass("0148033c-0000-0cab-0000-000000000000","Package","0148033c-0000-0cab-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cab0000000000000000);
        this.mClass.put("Package",id_0148033c00000cab0000000000000000);
        // attribute IsInstantiable

        MAttribute id_0148033c0001b0d50000000000000000 = new MAttribute("0148033c-0001-b0d5-0000-000000000000","IsInstantiable","0148033c-0000-0cab-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cab0000000000000000.getMAttributes().add(id_0148033c0001b0d50000000000000000);



        //## class PackageImport ##

        MClass id_0008152c00001bb10000000000000000 = new MClass("0008152c-0000-1bb1-0000-000000000000","PackageImport","0008152c-0000-1bb1-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0008152c00001bb10000000000000000);
        this.mClass.put("PackageImport",id_0008152c00001bb10000000000000000);
        // attribute Visibility

        MAttribute id_0008152c00001d420000000000000000 = new MAttribute("0008152c-0000-1d42-0000-000000000000","Visibility","0008152c-0000-1bb1-0000-000000000000.exml",this.mBaseTypes.get("VisibilityMode"),false,true,false);
        id_0008152c00001bb10000000000000000.getMAttributes().add(id_0008152c00001d420000000000000000);



        //## class PackageMerge ##

        MClass id_0008152c00001bb70000000000000000 = new MClass("0008152c-0000-1bb7-0000-000000000000","PackageMerge","0008152c-0000-1bb7-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0008152c00001bb70000000000000000);
        this.mClass.put("PackageMerge",id_0008152c00001bb70000000000000000);

        //## class Parameter ##

        MClass id_0148033c00000cb40000000000000000 = new MClass("0148033c-0000-0cb4-0000-000000000000","Parameter","0148033c-0000-0cb4-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cb40000000000000000);
        this.mClass.put("Parameter",id_0148033c00000cb40000000000000000);
        // attribute ParameterPassing

        MAttribute id_0148033c0001b26a0000000000000000 = new MAttribute("0148033c-0001-b26a-0000-000000000000","ParameterPassing","0148033c-0000-0cb4-0000-000000000000.exml",this.mBaseTypes.get("PassingMode"),false,true,false);
        id_0148033c00000cb40000000000000000.getMAttributes().add(id_0148033c0001b26a0000000000000000);


        // attribute MultiplicityMin

        MAttribute id_0148033c0001b26f0000000000000000 = new MAttribute("0148033c-0001-b26f-0000-000000000000","MultiplicityMin","0148033c-0000-0cb4-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cb40000000000000000.getMAttributes().add(id_0148033c0001b26f0000000000000000);


        // attribute MultiplicityMax

        MAttribute id_000c042c00000bb60000000000000000 = new MAttribute("000c042c-0000-0bb6-0000-000000000000","MultiplicityMax","0148033c-0000-0cb4-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cb40000000000000000.getMAttributes().add(id_000c042c00000bb60000000000000000);


        // attribute TypeConstraint

        MAttribute id_0148033c0001b2730000000000000000 = new MAttribute("0148033c-0001-b273-0000-000000000000","TypeConstraint","0148033c-0000-0cb4-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cb40000000000000000.getMAttributes().add(id_0148033c0001b2730000000000000000);


        // attribute DefaultValue

        MAttribute id_0148033c0001b2750000000000000000 = new MAttribute("0148033c-0001-b275-0000-000000000000","DefaultValue","0148033c-0000-0cb4-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cb40000000000000000.getMAttributes().add(id_0148033c0001b2750000000000000000);


        // attribute IsOrdered

        MAttribute id_590eef38fb1c11e08de7001ec947ccaf = new MAttribute("590eef38-fb1c-11e0-8de7-001ec947ccaf","IsOrdered","0148033c-0000-0cb4-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cb40000000000000000.getMAttributes().add(id_590eef38fb1c11e08de7001ec947ccaf);


        // attribute IsUnique

        MAttribute id_590eef39fb1c11e08de7001ec947ccaf = new MAttribute("590eef39-fb1c-11e0-8de7-001ec947ccaf","IsUnique","0148033c-0000-0cb4-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cb40000000000000000.getMAttributes().add(id_590eef39fb1c11e08de7001ec947ccaf);


        // attribute IsException

        MAttribute id_00d00f24000009fe0000000000000000 = new MAttribute("00d00f24-0000-09fe-0000-000000000000","IsException","0148033c-0000-0cb4-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cb40000000000000000.getMAttributes().add(id_00d00f24000009fe0000000000000000);


        // attribute IsStream

        MAttribute id_00d00f2400000a000000000000000000 = new MAttribute("00d00f24-0000-0a00-0000-000000000000","IsStream","0148033c-0000-0cb4-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cb40000000000000000.getMAttributes().add(id_00d00f2400000a000000000000000000);


        // attribute Effect

        MAttribute id_00d00f2400000a010000000000000000 = new MAttribute("00d00f24-0000-0a01-0000-000000000000","Effect","0148033c-0000-0cb4-0000-000000000000.exml",this.mBaseTypes.get("ParameterEffectKind"),false,true,false);
        id_0148033c00000cb40000000000000000.getMAttributes().add(id_00d00f2400000a010000000000000000);



        //## class Port ##

        MClass id_0008152c00001bb20000000000000000 = new MClass("0008152c-0000-1bb2-0000-000000000000","Port","0008152c-0000-1bb2-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0008152c00001bb20000000000000000);
        this.mClass.put("Port",id_0008152c00001bb20000000000000000);
        // attribute IsBehavior

        MAttribute id_0008152c00001d7d0000000000000000 = new MAttribute("0008152c-0000-1d7d-0000-000000000000","IsBehavior","0008152c-0000-1bb2-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0008152c00001bb20000000000000000.getMAttributes().add(id_0008152c00001d7d0000000000000000);


        // attribute IsService

        MAttribute id_0008152c00001d790000000000000000 = new MAttribute("0008152c-0000-1d79-0000-000000000000","IsService","0008152c-0000-1bb2-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0008152c00001bb20000000000000000.getMAttributes().add(id_0008152c00001d790000000000000000);


        // attribute IsConjugated

        MAttribute id_49808d0afe3c11e09dc6001ec947ccaf = new MAttribute("49808d0a-fe3c-11e0-9dc6-001ec947ccaf","IsConjugated","0008152c-0000-1bb2-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0008152c00001bb20000000000000000.getMAttributes().add(id_49808d0afe3c11e09dc6001ec947ccaf);


        // attribute Direction

        MAttribute id_1a55012abba011e1ac85001ec947ccaf = new MAttribute("1a55012a-bba0-11e1-ac85-001ec947ccaf","Direction","0008152c-0000-1bb2-0000-000000000000.exml",this.mBaseTypes.get("PortOrientation"),false,true,false);
        id_0008152c00001bb20000000000000000.getMAttributes().add(id_1a55012abba011e1ac85001ec947ccaf);



        //## class ProvidedInterface ##

        MClass id_0014116000000bb00000000000000000 = new MClass("00141160-0000-0bb0-0000-000000000000","ProvidedInterface","00141160-0000-0bb0-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0014116000000bb00000000000000000);
        this.mClass.put("ProvidedInterface",id_0014116000000bb00000000000000000);

        //## class RaisedException ##

        MClass id_0014116000000c100000000000000000 = new MClass("00141160-0000-0c10-0000-000000000000","RaisedException","00141160-0000-0c10-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0014116000000c100000000000000000);
        this.mClass.put("RaisedException",id_0014116000000c100000000000000000);

        //## class RequiredInterface ##

        MClass id_0014116000000b500000000000000000 = new MClass("00141160-0000-0b50-0000-000000000000","RequiredInterface","00141160-0000-0b50-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0014116000000b500000000000000000);
        this.mClass.put("RequiredInterface",id_0014116000000b500000000000000000);

        //## class StructuralFeature ##

        MClass id_000565eacbd41f43b54d001ec947cd2a = new MClass("000565ea-cbd4-1f43-b54d-001ec947cd2a","StructuralFeature","000565ea-cbd4-1f43-b54d-001ec947cd2a.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_000565eacbd41f43b54d001ec947cd2a);
        this.mClass.put("StructuralFeature",id_000565eacbd41f43b54d001ec947cd2a);
        // attribute Changeable

        MAttribute id_0148033c00018e950000000000000000 = new MAttribute("0148033c-0001-8e95-0000-000000000000","Changeable","000565ea-cbd4-1f43-b54d-001ec947cd2a.exml",this.mBaseTypes.get("KindOfAccess"),false,true,false);
        id_000565eacbd41f43b54d001ec947cd2a.getMAttributes().add(id_0148033c00018e950000000000000000);


        // attribute IsDerived

        MAttribute id_0148033c00018e880000000000000000 = new MAttribute("0148033c-0001-8e88-0000-000000000000","IsDerived","000565ea-cbd4-1f43-b54d-001ec947cd2a.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_000565eacbd41f43b54d001ec947cd2a.getMAttributes().add(id_0148033c00018e880000000000000000);


        // attribute IsOrdered

        MAttribute id_0008152c00001bd10000000000000000 = new MAttribute("0008152c-0000-1bd1-0000-000000000000","IsOrdered","000565ea-cbd4-1f43-b54d-001ec947cd2a.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_000565eacbd41f43b54d001ec947cd2a.getMAttributes().add(id_0008152c00001bd10000000000000000);


        // attribute IsUnique

        MAttribute id_0008152c00001bd50000000000000000 = new MAttribute("0008152c-0000-1bd5-0000-000000000000","IsUnique","000565ea-cbd4-1f43-b54d-001ec947cd2a.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_000565eacbd41f43b54d001ec947cd2a.getMAttributes().add(id_0008152c00001bd50000000000000000);


        // attribute MultiplicityMin

        MAttribute id_0008152c00001bd90000000000000000 = new MAttribute("0008152c-0000-1bd9-0000-000000000000","MultiplicityMin","000565ea-cbd4-1f43-b54d-001ec947cd2a.exml",this.mBaseTypes.get("string"),false,true,false);
        id_000565eacbd41f43b54d001ec947cd2a.getMAttributes().add(id_0008152c00001bd90000000000000000);


        // attribute MultiplicityMax

        MAttribute id_0008152c00001bdc0000000000000000 = new MAttribute("0008152c-0000-1bdc-0000-000000000000","MultiplicityMax","000565ea-cbd4-1f43-b54d-001ec947cd2a.exml",this.mBaseTypes.get("string"),false,true,false);
        id_000565eacbd41f43b54d001ec947cd2a.getMAttributes().add(id_0008152c00001bdc0000000000000000);



        //## class TemplateBinding ##

        MClass id_0008152c00001bb40000000000000000 = new MClass("0008152c-0000-1bb4-0000-000000000000","TemplateBinding","0008152c-0000-1bb4-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0008152c00001bb40000000000000000);
        this.mClass.put("TemplateBinding",id_0008152c00001bb40000000000000000);

        //## class TemplateParameter ##

        MClass id_0148033c00000cba0000000000000000 = new MClass("0148033c-0000-0cba-0000-000000000000","TemplateParameter","0148033c-0000-0cba-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0148033c00000cba0000000000000000);
        this.mClass.put("TemplateParameter",id_0148033c00000cba0000000000000000);
        // attribute DefaultValue

        MAttribute id_0008152c00001bf70000000000000000 = new MAttribute("0008152c-0000-1bf7-0000-000000000000","DefaultValue","0148033c-0000-0cba-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cba0000000000000000.getMAttributes().add(id_0008152c00001bf70000000000000000);


        // attribute IsValueParameter

        MAttribute id_00281854000017260000000000000000 = new MAttribute("00281854-0000-1726-0000-000000000000","IsValueParameter","0148033c-0000-0cba-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cba0000000000000000.getMAttributes().add(id_00281854000017260000000000000000);



        //## class TemplateParameterSubstitution ##

        MClass id_0008152c00001bb50000000000000000 = new MClass("0008152c-0000-1bb5-0000-000000000000","TemplateParameterSubstitution","0008152c-0000-1bb5-0000-000000000000.exml");
        id_00d00f24000000020000000000000000.getMClass().add(id_0008152c00001bb50000000000000000);
        this.mClass.put("TemplateParameterSubstitution",id_0008152c00001bb50000000000000000);
        // attribute Value

        MAttribute id_0008152c00001bf90000000000000000 = new MAttribute("0008152c-0000-1bf9-0000-000000000000","Value","0008152c-0000-1bb5-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0008152c00001bb50000000000000000.getMAttributes().add(id_0008152c00001bf90000000000000000);





        //##### Package behavior#####
        MPackage id_00d00f24000000030000000000000000 = new MPackage("00d00f24-0000-0003-0000-000000000000","behavior","00d00f24-0000-0003-0000-000000000000.exml");
        id_01f4038c000042d60000000000000000.getMPackages().add(id_00d00f24000000030000000000000000);
        //##### Package activityModel#####
        MPackage id_00d00f24000008f60000000000000000 = new MPackage("00d00f24-0000-08f6-0000-000000000000","activityModel","00d00f24-0000-08f6-0000-000000000000.exml");
        id_00d00f24000000030000000000000000.getMPackages().add(id_00d00f24000008f60000000000000000);
        //## class AcceptCallEventAction ##

        MClass id_00d012d80001ee0d0000000000000000 = new MClass("00d012d8-0001-ee0d-0000-000000000000","AcceptCallEventAction","00d012d8-0001-ee0d-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d012d80001ee0d0000000000000000);
        this.mClass.put("AcceptCallEventAction",id_00d012d80001ee0d0000000000000000);

        //## class AcceptChangeEventAction ##

        MClass id_00d00f24000009880000000000000000 = new MClass("00d00f24-0000-0988-0000-000000000000","AcceptChangeEventAction","00d00f24-0000-0988-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f24000009880000000000000000);
        this.mClass.put("AcceptChangeEventAction",id_00d00f24000009880000000000000000);
        // attribute ChangeExpresion

        MAttribute id_00d012d80001ee2e0000000000000000 = new MAttribute("00d012d8-0001-ee2e-0000-000000000000","ChangeExpresion","00d00f24-0000-0988-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f24000009880000000000000000.getMAttributes().add(id_00d012d80001ee2e0000000000000000);



        //## class AcceptSignalAction ##

        MClass id_00d00f240000116f0000000000000000 = new MClass("00d00f24-0000-116f-0000-000000000000","AcceptSignalAction","00d00f24-0000-116f-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f240000116f0000000000000000);
        this.mClass.put("AcceptSignalAction",id_00d00f240000116f0000000000000000);

        //## class AcceptTimeEventAction ##

        MClass id_00d012d80001edef0000000000000000 = new MClass("00d012d8-0001-edef-0000-000000000000","AcceptTimeEventAction","00d012d8-0001-edef-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d012d80001edef0000000000000000);
        this.mClass.put("AcceptTimeEventAction",id_00d012d80001edef0000000000000000);
        // attribute TimeExpresion

        MAttribute id_00d012d80001ee2b0000000000000000 = new MAttribute("00d012d8-0001-ee2b-0000-000000000000","TimeExpresion","00d012d8-0001-edef-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d012d80001edef0000000000000000.getMAttributes().add(id_00d012d80001ee2b0000000000000000);



        //## class Activity ##

        MClass id_0008152c00001c930000000000000000 = new MClass("0008152c-0000-1c93-0000-000000000000","Activity","0008152c-0000-1c93-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_0008152c00001c930000000000000000);
        this.mClass.put("Activity",id_0008152c00001c930000000000000000);
        // attribute IsSingleExecution

        MAttribute id_00d00f24000009e00000000000000000 = new MAttribute("00d00f24-0000-09e0-0000-000000000000","IsSingleExecution","0008152c-0000-1c93-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0008152c00001c930000000000000000.getMAttributes().add(id_00d00f24000009e00000000000000000);


        // attribute IsReadOnly

        MAttribute id_00d00f24000009e20000000000000000 = new MAttribute("00d00f24-0000-09e2-0000-000000000000","IsReadOnly","0008152c-0000-1c93-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0008152c00001c930000000000000000.getMAttributes().add(id_00d00f24000009e20000000000000000);



        //## class ActivityAction ##

        MClass id_00d00f240000094c0000000000000000 = new MClass("00d00f24-0000-094c-0000-000000000000","ActivityAction","00d00f24-0000-094c-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f240000094c0000000000000000);
        this.mClass.put("ActivityAction",id_00d00f240000094c0000000000000000);
        // attribute IsMultipleInstance

        MAttribute id_00d00f2400000a0a0000000000000000 = new MAttribute("00d00f24-0000-0a0a-0000-000000000000","IsMultipleInstance","00d00f24-0000-094c-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f240000094c0000000000000000.getMAttributes().add(id_00d00f2400000a0a0000000000000000);


        // attribute IsCompensation

        MAttribute id_00d00f2400000a0c0000000000000000 = new MAttribute("00d00f24-0000-0a0c-0000-000000000000","IsCompensation","00d00f24-0000-094c-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f240000094c0000000000000000.getMAttributes().add(id_00d00f2400000a0c0000000000000000);



        //## class ActivityEdge ##

        MClass id_00d00f240000094e0000000000000000 = new MClass("00d00f24-0000-094e-0000-000000000000","ActivityEdge","00d00f24-0000-094e-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f240000094e0000000000000000);
        this.mClass.put("ActivityEdge",id_00d00f240000094e0000000000000000);
        // attribute Guard

        MAttribute id_00d00f24000009640000000000000000 = new MAttribute("00d00f24-0000-0964-0000-000000000000","Guard","00d00f24-0000-094e-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f240000094e0000000000000000.getMAttributes().add(id_00d00f24000009640000000000000000);


        // attribute Weight

        MAttribute id_00d00f24000009660000000000000000 = new MAttribute("00d00f24-0000-0966-0000-000000000000","Weight","00d00f24-0000-094e-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f240000094e0000000000000000.getMAttributes().add(id_00d00f24000009660000000000000000);



        //## class ActivityFinalNode ##

        MClass id_00d00f240000112b0000000000000000 = new MClass("00d00f24-0000-112b-0000-000000000000","ActivityFinalNode","00d00f24-0000-112b-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f240000112b0000000000000000);
        this.mClass.put("ActivityFinalNode",id_00d00f240000112b0000000000000000);

        //## class ActivityGroup ##

        MClass id_00d00f24000009500000000000000000 = new MClass("00d00f24-0000-0950-0000-000000000000","ActivityGroup","00d00f24-0000-0950-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f24000009500000000000000000);
        this.mClass.put("ActivityGroup",id_00d00f24000009500000000000000000);

        //## class ActivityNode ##

        MClass id_00d00f24000009540000000000000000 = new MClass("00d00f24-0000-0954-0000-000000000000","ActivityNode","00d00f24-0000-0954-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f24000009540000000000000000);
        this.mClass.put("ActivityNode",id_00d00f24000009540000000000000000);

        //## class ActivityParameterNode ##

        MClass id_00d00f240000097e0000000000000000 = new MClass("00d00f24-0000-097e-0000-000000000000","ActivityParameterNode","00d00f24-0000-097e-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f240000097e0000000000000000);
        this.mClass.put("ActivityParameterNode",id_00d00f240000097e0000000000000000);

        //## class ActivityPartition ##

        MClass id_00d00f24000009920000000000000000 = new MClass("00d00f24-0000-0992-0000-000000000000","ActivityPartition","00d00f24-0000-0992-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f24000009920000000000000000);
        this.mClass.put("ActivityPartition",id_00d00f24000009920000000000000000);
        // attribute IsDimension

        MAttribute id_00d00f24000009d40000000000000000 = new MAttribute("00d00f24-0000-09d4-0000-000000000000","IsDimension","00d00f24-0000-0992-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f24000009920000000000000000.getMAttributes().add(id_00d00f24000009d40000000000000000);


        // attribute IsExternal

        MAttribute id_00d00f24000009d60000000000000000 = new MAttribute("00d00f24-0000-09d6-0000-000000000000","IsExternal","00d00f24-0000-0992-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f24000009920000000000000000.getMAttributes().add(id_00d00f24000009d60000000000000000);



        //## class CallAction ##

        MClass id_00d00f24000009820000000000000000 = new MClass("00d00f24-0000-0982-0000-000000000000","CallAction","00d00f24-0000-0982-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f24000009820000000000000000);
        this.mClass.put("CallAction",id_00d00f24000009820000000000000000);
        // attribute IsSynchronous

        MAttribute id_00d00f2400000d1a0000000000000000 = new MAttribute("00d00f24-0000-0d1a-0000-000000000000","IsSynchronous","00d00f24-0000-0982-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f24000009820000000000000000.getMAttributes().add(id_00d00f2400000d1a0000000000000000);



        //## class CallBehaviorAction ##

        MClass id_00d00f2400000d200000000000000000 = new MClass("00d00f24-0000-0d20-0000-000000000000","CallBehaviorAction","00d00f24-0000-0d20-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f2400000d200000000000000000);
        this.mClass.put("CallBehaviorAction",id_00d00f2400000d200000000000000000);

        //## class CallOperationAction ##

        MClass id_00d00f2400000d1e0000000000000000 = new MClass("00d00f24-0000-0d1e-0000-000000000000","CallOperationAction","00d00f24-0000-0d1e-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f2400000d1e0000000000000000);
        this.mClass.put("CallOperationAction",id_00d00f2400000d1e0000000000000000);

        //## class CentralBufferNode ##

        MClass id_00d00f2400000cc70000000000000000 = new MClass("00d00f24-0000-0cc7-0000-000000000000","CentralBufferNode","00d00f24-0000-0cc7-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f2400000cc70000000000000000);
        this.mClass.put("CentralBufferNode",id_00d00f2400000cc70000000000000000);

        //## class Clause ##

        MClass id_00d012d80002e9f80000000000000000 = new MClass("00d012d8-0002-e9f8-0000-000000000000","Clause","00d012d8-0002-e9f8-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d012d80002e9f80000000000000000);
        this.mClass.put("Clause",id_00d012d80002e9f80000000000000000);
        // attribute Test

        MAttribute id_00d012d80002eaa30000000000000000 = new MAttribute("00d012d8-0002-eaa3-0000-000000000000","Test","00d012d8-0002-e9f8-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d012d80002e9f80000000000000000.getMAttributes().add(id_00d012d80002eaa30000000000000000);



        //## class ConditionalNode ##

        MClass id_00d00f24000009840000000000000000 = new MClass("00d00f24-0000-0984-0000-000000000000","ConditionalNode","00d00f24-0000-0984-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f24000009840000000000000000);
        this.mClass.put("ConditionalNode",id_00d00f24000009840000000000000000);
        // attribute IsDeterminate

        MAttribute id_00d00f2400000a100000000000000000 = new MAttribute("00d00f24-0000-0a10-0000-000000000000","IsDeterminate","00d00f24-0000-0984-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f24000009840000000000000000.getMAttributes().add(id_00d00f2400000a100000000000000000);


        // attribute IsAssured

        MAttribute id_00d00f2400000a120000000000000000 = new MAttribute("00d00f24-0000-0a12-0000-000000000000","IsAssured","00d00f24-0000-0984-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f24000009840000000000000000.getMAttributes().add(id_00d00f2400000a120000000000000000);



        //## class ControlFlow ##

        MClass id_00d00f240000098e0000000000000000 = new MClass("00d00f24-0000-098e-0000-000000000000","ControlFlow","00d00f24-0000-098e-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f240000098e0000000000000000);
        this.mClass.put("ControlFlow",id_00d00f240000098e0000000000000000);

        //## class ControlNode ##

        MClass id_00d00f24000009780000000000000000 = new MClass("00d00f24-0000-0978-0000-000000000000","ControlNode","00d00f24-0000-0978-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f24000009780000000000000000);
        this.mClass.put("ControlNode",id_00d00f24000009780000000000000000);

        //## class DataStoreNode ##

        MClass id_00d00f2400000cc90000000000000000 = new MClass("00d00f24-0000-0cc9-0000-000000000000","DataStoreNode","00d00f24-0000-0cc9-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f2400000cc90000000000000000);
        this.mClass.put("DataStoreNode",id_00d00f2400000cc90000000000000000);

        //## class DecisionMergeNode ##

        MClass id_00d00f2400000a940000000000000000 = new MClass("00d00f24-0000-0a94-0000-000000000000","DecisionMergeNode","00d00f24-0000-0a94-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f2400000a940000000000000000);
        this.mClass.put("DecisionMergeNode",id_00d00f2400000a940000000000000000);
        // attribute DecisionKind

        MAttribute id_00d00f2400000aae0000000000000000 = new MAttribute("00d00f24-0000-0aae-0000-000000000000","DecisionKind","00d00f24-0000-0a94-0000-000000000000.exml",this.mBaseTypes.get("DecisionNodeKind"),false,true,false);
        id_00d00f2400000a940000000000000000.getMAttributes().add(id_00d00f2400000aae0000000000000000);


        // attribute DecisionInputBehavior

        MAttribute id_00d00f2400000a8b0000000000000000 = new MAttribute("00d00f24-0000-0a8b-0000-000000000000","DecisionInputBehavior","00d00f24-0000-0a94-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f2400000a940000000000000000.getMAttributes().add(id_00d00f2400000a8b0000000000000000);



        //## class ExceptionHandler ##

        MClass id_abfcfba6f87c11dfa2c5001ec947ccaf = new MClass("abfcfba6-f87c-11df-a2c5-001ec947ccaf","ExceptionHandler","abfcfba6-f87c-11df-a2c5-001ec947ccaf.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_abfcfba6f87c11dfa2c5001ec947ccaf);
        this.mClass.put("ExceptionHandler",id_abfcfba6f87c11dfa2c5001ec947ccaf);
        // attribute Guard

        MAttribute id_abfcfbaef87c11dfa2c5001ec947ccaf = new MAttribute("abfcfbae-f87c-11df-a2c5-001ec947ccaf","Guard","abfcfba6-f87c-11df-a2c5-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_abfcfba6f87c11dfa2c5001ec947ccaf.getMAttributes().add(id_abfcfbaef87c11dfa2c5001ec947ccaf);


        // attribute Weight

        MAttribute id_abfcfb9ff87c11dfa2c5001ec947ccaf = new MAttribute("abfcfb9f-f87c-11df-a2c5-001ec947ccaf","Weight","abfcfba6-f87c-11df-a2c5-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_abfcfba6f87c11dfa2c5001ec947ccaf.getMAttributes().add(id_abfcfb9ff87c11dfa2c5001ec947ccaf);



        //## class ExpansionNode ##

        MClass id_361a58e9f87811dfa2c5001ec947ccaf = new MClass("361a58e9-f878-11df-a2c5-001ec947ccaf","ExpansionNode","361a58e9-f878-11df-a2c5-001ec947ccaf.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_361a58e9f87811dfa2c5001ec947ccaf);
        this.mClass.put("ExpansionNode",id_361a58e9f87811dfa2c5001ec947ccaf);

        //## class ExpansionRegion ##

        MClass id_f0e31419f87711dfa2c5001ec947ccaf = new MClass("f0e31419-f877-11df-a2c5-001ec947ccaf","ExpansionRegion","f0e31419-f877-11df-a2c5-001ec947ccaf.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_f0e31419f87711dfa2c5001ec947ccaf);
        this.mClass.put("ExpansionRegion",id_f0e31419f87711dfa2c5001ec947ccaf);
        // attribute Mode

        MAttribute id_f0e31416f87711dfa2c5001ec947ccaf = new MAttribute("f0e31416-f877-11df-a2c5-001ec947ccaf","Mode","f0e31419-f877-11df-a2c5-001ec947ccaf.exml",this.mBaseTypes.get("ExpansionKind"),false,true,false);
        id_f0e31419f87711dfa2c5001ec947ccaf.getMAttributes().add(id_f0e31416f87711dfa2c5001ec947ccaf);



        //## class FinalNode ##

        MClass id_00d00f24000011290000000000000000 = new MClass("00d00f24-0000-1129-0000-000000000000","FinalNode","00d00f24-0000-1129-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f24000011290000000000000000);
        this.mClass.put("FinalNode",id_00d00f24000011290000000000000000);

        //## class FlowFinalNode ##

        MClass id_00d00f240000112d0000000000000000 = new MClass("00d00f24-0000-112d-0000-000000000000","FlowFinalNode","00d00f24-0000-112d-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f240000112d0000000000000000);
        this.mClass.put("FlowFinalNode",id_00d00f240000112d0000000000000000);

        //## class ForkJoinNode ##

        MClass id_00d00f2400000a900000000000000000 = new MClass("00d00f24-0000-0a90-0000-000000000000","ForkJoinNode","00d00f24-0000-0a90-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f2400000a900000000000000000);
        this.mClass.put("ForkJoinNode",id_00d00f2400000a900000000000000000);
        // attribute IsCombineDuplicate

        MAttribute id_00d00f2400000ab20000000000000000 = new MAttribute("00d00f24-0000-0ab2-0000-000000000000","IsCombineDuplicate","00d00f24-0000-0a90-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f2400000a900000000000000000.getMAttributes().add(id_00d00f2400000ab20000000000000000);


        // attribute JoinSpec

        MAttribute id_00d00f2400000ab50000000000000000 = new MAttribute("00d00f24-0000-0ab5-0000-000000000000","JoinSpec","00d00f24-0000-0a90-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f2400000a900000000000000000.getMAttributes().add(id_00d00f2400000ab50000000000000000);



        //## class InitialNode ##

        MClass id_00d00f240000113d0000000000000000 = new MClass("00d00f24-0000-113d-0000-000000000000","InitialNode","00d00f24-0000-113d-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f240000113d0000000000000000);
        this.mClass.put("InitialNode",id_00d00f240000113d0000000000000000);

        //## class InputPin ##

        MClass id_00d012d800096b900000000000000000 = new MClass("00d012d8-0009-6b90-0000-000000000000","InputPin","00d012d8-0009-6b90-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d012d800096b900000000000000000);
        this.mClass.put("InputPin",id_00d012d800096b900000000000000000);
        // attribute IsSelf

        MAttribute id_00d012d800096baa0000000000000000 = new MAttribute("00d012d8-0009-6baa-0000-000000000000","IsSelf","00d012d8-0009-6b90-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d012d800096b900000000000000000.getMAttributes().add(id_00d012d800096baa0000000000000000);



        //## class InstanceNode ##

        MClass id_00d00f2400000c820000000000000000 = new MClass("00d00f24-0000-0c82-0000-000000000000","InstanceNode","00d00f24-0000-0c82-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f2400000c820000000000000000);
        this.mClass.put("InstanceNode",id_00d00f2400000c820000000000000000);

        //## class InterruptibleActivityRegion ##

        MClass id_00d00f24000009ce0000000000000000 = new MClass("00d00f24-0000-09ce-0000-000000000000","InterruptibleActivityRegion","00d00f24-0000-09ce-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f24000009ce0000000000000000);
        this.mClass.put("InterruptibleActivityRegion",id_00d00f24000009ce0000000000000000);

        //## class LoopNode ##

        MClass id_00d00f24000009860000000000000000 = new MClass("00d00f24-0000-0986-0000-000000000000","LoopNode","00d00f24-0000-0986-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f24000009860000000000000000);
        this.mClass.put("LoopNode",id_00d00f24000009860000000000000000);
        // attribute IsTestedFirst

        MAttribute id_00d00f2400000a0e0000000000000000 = new MAttribute("00d00f24-0000-0a0e-0000-000000000000","IsTestedFirst","00d00f24-0000-0986-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f24000009860000000000000000.getMAttributes().add(id_00d00f2400000a0e0000000000000000);


        // attribute Setup

        MAttribute id_00d00f2400000daa0000000000000000 = new MAttribute("00d00f24-0000-0daa-0000-000000000000","Setup","00d00f24-0000-0986-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f24000009860000000000000000.getMAttributes().add(id_00d00f2400000daa0000000000000000);


        // attribute Test

        MAttribute id_00d00f2400000dac0000000000000000 = new MAttribute("00d00f24-0000-0dac-0000-000000000000","Test","00d00f24-0000-0986-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f24000009860000000000000000.getMAttributes().add(id_00d00f2400000dac0000000000000000);



        //## class MessageFlow ##

        MClass id_00d00f24000009900000000000000000 = new MClass("00d00f24-0000-0990-0000-000000000000","MessageFlow","00d00f24-0000-0990-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f24000009900000000000000000);
        this.mClass.put("MessageFlow",id_00d00f24000009900000000000000000);

        //## class ObjectFlow ##

        MClass id_00d00f240000098c0000000000000000 = new MClass("00d00f24-0000-098c-0000-000000000000","ObjectFlow","00d00f24-0000-098c-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f240000098c0000000000000000);
        this.mClass.put("ObjectFlow",id_00d00f240000098c0000000000000000);
        // attribute TransformationBehavior

        MAttribute id_00d00f2400000a150000000000000000 = new MAttribute("00d00f24-0000-0a15-0000-000000000000","TransformationBehavior","00d00f24-0000-098c-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f240000098c0000000000000000.getMAttributes().add(id_00d00f2400000a150000000000000000);


        // attribute SelectionBehavior

        MAttribute id_00d00f2400000a190000000000000000 = new MAttribute("00d00f24-0000-0a19-0000-000000000000","SelectionBehavior","00d00f24-0000-098c-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f240000098c0000000000000000.getMAttributes().add(id_00d00f2400000a190000000000000000);


        // attribute IsMultiCast

        MAttribute id_00d00f2400000a1b0000000000000000 = new MAttribute("00d00f24-0000-0a1b-0000-000000000000","IsMultiCast","00d00f24-0000-098c-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f240000098c0000000000000000.getMAttributes().add(id_00d00f2400000a1b0000000000000000);


        // attribute IsMultiReceive

        MAttribute id_00d00f2400000a1d0000000000000000 = new MAttribute("00d00f24-0000-0a1d-0000-000000000000","IsMultiReceive","00d00f24-0000-098c-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f240000098c0000000000000000.getMAttributes().add(id_00d00f2400000a1d0000000000000000);


        // attribute Effect

        MAttribute id_00d00f2400000a1e0000000000000000 = new MAttribute("00d00f24-0000-0a1e-0000-000000000000","Effect","00d00f24-0000-098c-0000-000000000000.exml",this.mBaseTypes.get("ObjectFlowEffectKind"),false,true,false);
        id_00d00f240000098c0000000000000000.getMAttributes().add(id_00d00f2400000a1e0000000000000000);



        //## class ObjectNode ##

        MClass id_00d00f240000097a0000000000000000 = new MClass("00d00f24-0000-097a-0000-000000000000","ObjectNode","00d00f24-0000-097a-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f240000097a0000000000000000);
        this.mClass.put("ObjectNode",id_00d00f240000097a0000000000000000);
        // attribute IsControlType

        MAttribute id_00d00f2400000cd40000000000000000 = new MAttribute("00d00f24-0000-0cd4-0000-000000000000","IsControlType","00d00f24-0000-097a-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f240000097a0000000000000000.getMAttributes().add(id_00d00f2400000cd40000000000000000);


        // attribute Ordering

        MAttribute id_00d00f2400000cc40000000000000000 = new MAttribute("00d00f24-0000-0cc4-0000-000000000000","Ordering","00d00f24-0000-097a-0000-000000000000.exml",this.mBaseTypes.get("ObjectNodeOrderingKind"),false,true,false);
        id_00d00f240000097a0000000000000000.getMAttributes().add(id_00d00f2400000cc40000000000000000);


        // attribute SelectionBehavior

        MAttribute id_00d00f2400000cc60000000000000000 = new MAttribute("00d00f24-0000-0cc6-0000-000000000000","SelectionBehavior","00d00f24-0000-097a-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f240000097a0000000000000000.getMAttributes().add(id_00d00f2400000cc60000000000000000);


        // attribute UpperBound

        MAttribute id_00d00f2400000cd30000000000000000 = new MAttribute("00d00f24-0000-0cd3-0000-000000000000","UpperBound","00d00f24-0000-097a-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f240000097a0000000000000000.getMAttributes().add(id_00d00f2400000cd30000000000000000);



        //## class OpaqueAction ##

        MClass id_00d00f2400000d9f0000000000000000 = new MClass("00d00f24-0000-0d9f-0000-000000000000","OpaqueAction","00d00f24-0000-0d9f-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f2400000d9f0000000000000000);
        this.mClass.put("OpaqueAction",id_00d00f2400000d9f0000000000000000);
        // attribute Body

        MAttribute id_00d00f2400000da10000000000000000 = new MAttribute("00d00f24-0000-0da1-0000-000000000000","Body","00d00f24-0000-0d9f-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f2400000d9f0000000000000000.getMAttributes().add(id_00d00f2400000da10000000000000000);



        //## class OutputPin ##

        MClass id_00d012d800096c290000000000000000 = new MClass("00d012d8-0009-6c29-0000-000000000000","OutputPin","00d012d8-0009-6c29-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d012d800096c290000000000000000);
        this.mClass.put("OutputPin",id_00d012d800096c290000000000000000);

        //## class Pin ##

        MClass id_00d00f240000097c0000000000000000 = new MClass("00d00f24-0000-097c-0000-000000000000","Pin","00d00f24-0000-097c-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f240000097c0000000000000000);
        this.mClass.put("Pin",id_00d00f240000097c0000000000000000);
        // attribute IsControl

        MAttribute id_00d00f24000009d80000000000000000 = new MAttribute("00d00f24-0000-09d8-0000-000000000000","IsControl","00d00f24-0000-097c-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f240000097c0000000000000000.getMAttributes().add(id_00d00f24000009d80000000000000000);


        // attribute IsExpansion

        MAttribute id_00d00f24000009db0000000000000000 = new MAttribute("00d00f24-0000-09db-0000-000000000000","IsExpansion","00d00f24-0000-097c-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f240000097c0000000000000000.getMAttributes().add(id_00d00f24000009db0000000000000000);



        //## class SendSignalAction ##

        MClass id_00d00f24000011690000000000000000 = new MClass("00d00f24-0000-1169-0000-000000000000","SendSignalAction","00d00f24-0000-1169-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f24000011690000000000000000);
        this.mClass.put("SendSignalAction",id_00d00f24000011690000000000000000);

        //## class StructuredActivityNode ##

        MClass id_00d00f24000009800000000000000000 = new MClass("00d00f24-0000-0980-0000-000000000000","StructuredActivityNode","00d00f24-0000-0980-0000-000000000000.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_00d00f24000009800000000000000000);
        this.mClass.put("StructuredActivityNode",id_00d00f24000009800000000000000000);
        // attribute MustIsolate

        MAttribute id_00d00f2400000dca0000000000000000 = new MAttribute("00d00f24-0000-0dca-0000-000000000000","MustIsolate","00d00f24-0000-0980-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_00d00f24000009800000000000000000.getMAttributes().add(id_00d00f2400000dca0000000000000000);



        //## class ValuePin ##

        MClass id_dcb5c3c1038011e08bdf001ec947ccaf = new MClass("dcb5c3c1-0380-11e0-8bdf-001ec947ccaf","ValuePin","dcb5c3c1-0380-11e0-8bdf-001ec947ccaf.exml");
        id_00d00f24000008f60000000000000000.getMClass().add(id_dcb5c3c1038011e08bdf001ec947ccaf);
        this.mClass.put("ValuePin",id_dcb5c3c1038011e08bdf001ec947ccaf);
        // attribute Value

        MAttribute id_dcb5c3d7038011e08bdf001ec947ccaf = new MAttribute("dcb5c3d7-0380-11e0-8bdf-001ec947ccaf","Value","dcb5c3c1-0380-11e0-8bdf-001ec947ccaf.exml",this.mBaseTypes.get("string"),false,true,false);
        id_dcb5c3c1038011e08bdf001ec947ccaf.getMAttributes().add(id_dcb5c3d7038011e08bdf001ec947ccaf);





        //##### Package commonBehaviors#####
        MPackage id_00d00f24000009520000000000000000 = new MPackage("00d00f24-0000-0952-0000-000000000000","commonBehaviors","00d00f24-0000-0952-0000-000000000000.exml");
        id_00d00f24000000030000000000000000.getMPackages().add(id_00d00f24000009520000000000000000);
        //## class Behavior ##

        MClass id_0008152c00001bac0000000000000000 = new MClass("0008152c-0000-1bac-0000-000000000000","Behavior","0008152c-0000-1bac-0000-000000000000.exml");
        id_00d00f24000009520000000000000000.getMClass().add(id_0008152c00001bac0000000000000000);
        this.mClass.put("Behavior",id_0008152c00001bac0000000000000000);
        // attribute IsReentrant

        MAttribute id_00d00f24000009ed0000000000000000 = new MAttribute("00d00f24-0000-09ed-0000-000000000000","IsReentrant","0008152c-0000-1bac-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0008152c00001bac0000000000000000.getMAttributes().add(id_00d00f24000009ed0000000000000000);



        //## class BehaviorParameter ##

        MClass id_00d00f240000098a0000000000000000 = new MClass("00d00f24-0000-098a-0000-000000000000","BehaviorParameter","00d00f24-0000-098a-0000-000000000000.exml");
        id_00d00f24000009520000000000000000.getMClass().add(id_00d00f240000098a0000000000000000);
        this.mClass.put("BehaviorParameter",id_00d00f240000098a0000000000000000);

        //## class OpaqueBehavior ##

        MClass id_00d00f24000009e50000000000000000 = new MClass("00d00f24-0000-09e5-0000-000000000000","OpaqueBehavior","00d00f24-0000-09e5-0000-000000000000.exml");
        id_00d00f24000009520000000000000000.getMClass().add(id_00d00f24000009e50000000000000000);
        this.mClass.put("OpaqueBehavior",id_00d00f24000009e50000000000000000);
        // attribute Body

        MAttribute id_00d00f2400000d170000000000000000 = new MAttribute("00d00f24-0000-0d17-0000-000000000000","Body","00d00f24-0000-09e5-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f24000009e50000000000000000.getMAttributes().add(id_00d00f2400000d170000000000000000);



        //## class Signal ##

        MClass id_0148033c00000cbe0000000000000000 = new MClass("0148033c-0000-0cbe-0000-000000000000","Signal","0148033c-0000-0cbe-0000-000000000000.exml");
        id_00d00f24000009520000000000000000.getMClass().add(id_0148033c00000cbe0000000000000000);
        this.mClass.put("Signal",id_0148033c00000cbe0000000000000000);
        // attribute IsEvent

        MAttribute id_0148033c0001b8670000000000000000 = new MAttribute("0148033c-0001-b867-0000-000000000000","IsEvent","0148033c-0000-0cbe-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cbe0000000000000000.getMAttributes().add(id_0148033c0001b8670000000000000000);


        // attribute IsException

        MAttribute id_0148033c0001b86a0000000000000000 = new MAttribute("0148033c-0001-b86a-0000-000000000000","IsException","0148033c-0000-0cbe-0000-000000000000.exml",this.mBaseTypes.get("boolean"),false,true,false);
        id_0148033c00000cbe0000000000000000.getMAttributes().add(id_0148033c0001b86a0000000000000000);



        //## class Event ##

        MClass id_0148033c00000ce80000000000000000 = new MClass("0148033c-0000-0ce8-0000-000000000000","Event","0148033c-0000-0ce8-0000-000000000000.exml");
        id_00d00f24000009520000000000000000.getMClass().add(id_0148033c00000ce80000000000000000);
        this.mClass.put("Event",id_0148033c00000ce80000000000000000);
        // attribute Expression

        MAttribute id_0148033c00019dc70000000000000000 = new MAttribute("0148033c-0001-9dc7-0000-000000000000","Expression","0148033c-0000-0ce8-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000ce80000000000000000.getMAttributes().add(id_0148033c00019dc70000000000000000);


        // attribute Kind

        MAttribute id_0148033c00019dc30000000000000000 = new MAttribute("0148033c-0001-9dc3-0000-000000000000","Kind","0148033c-0000-0ce8-0000-000000000000.exml",this.mBaseTypes.get("EventType"),false,true,false);
        id_0148033c00000ce80000000000000000.getMAttributes().add(id_0148033c00019dc30000000000000000);





        //##### Package interactionModel#####
        MPackage id_00d00f2400000b150000000000000000 = new MPackage("00d00f24-0000-0b15-0000-000000000000","interactionModel","00d00f24-0000-0b15-0000-000000000000.exml");
        id_00d00f24000000030000000000000000.getMPackages().add(id_00d00f2400000b150000000000000000);
        //##### Package facilities#####
        MPackage id_01ec00f4001848cf0000000000000000 = new MPackage("01ec00f4-0018-48cf-0000-000000000000","facilities","01ec00f4-0018-48cf-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMPackages().add(id_01ec00f4001848cf0000000000000000);
        //## class InteractionNavigationServices ##

        MClass id_01ec00f4001848d40000000000000000 = new MClass("01ec00f4-0018-48d4-0000-000000000000","InteractionNavigationServices","01ec00f4-0018-48d4-0000-000000000000.exml");
        id_01ec00f4001848cf0000000000000000.getMClass().add(id_01ec00f4001848d40000000000000000);
        this.mClass.put("InteractionNavigationServices",id_01ec00f4001848d40000000000000000);



        //## class CombinedFragment ##

        MClass id_00d00f2400000fd20000000000000000 = new MClass("00d00f24-0000-0fd2-0000-000000000000","CombinedFragment","00d00f24-0000-0fd2-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_00d00f2400000fd20000000000000000);
        this.mClass.put("CombinedFragment",id_00d00f2400000fd20000000000000000);
        // attribute Operator

        MAttribute id_00d00f24000010040000000000000000 = new MAttribute("00d00f24-0000-1004-0000-000000000000","Operator","00d00f24-0000-0fd2-0000-000000000000.exml",this.mBaseTypes.get("InteractionOperator"),false,true,false);
        id_00d00f2400000fd20000000000000000.getMAttributes().add(id_00d00f24000010040000000000000000);



        //## class DurationConstraint ##

        MClass id_00d00f2400000fd40000000000000000 = new MClass("00d00f24-0000-0fd4-0000-000000000000","DurationConstraint","00d00f24-0000-0fd4-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_00d00f2400000fd40000000000000000);
        this.mClass.put("DurationConstraint",id_00d00f2400000fd40000000000000000);
        // attribute DurationMin

        MAttribute id_00d00f24000016360000000000000000 = new MAttribute("00d00f24-0000-1636-0000-000000000000","DurationMin","00d00f24-0000-0fd4-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f2400000fd40000000000000000.getMAttributes().add(id_00d00f24000016360000000000000000);


        // attribute DurationMax

        MAttribute id_00d00f240000163a0000000000000000 = new MAttribute("00d00f24-0000-163a-0000-000000000000","DurationMax","00d00f24-0000-0fd4-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f2400000fd40000000000000000.getMAttributes().add(id_00d00f240000163a0000000000000000);



        //## class ExecutionOccurenceSpecification ##

        MClass id_00d00f2400000fd60000000000000000 = new MClass("00d00f24-0000-0fd6-0000-000000000000","ExecutionOccurenceSpecification","00d00f24-0000-0fd6-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_00d00f2400000fd60000000000000000);
        this.mClass.put("ExecutionOccurenceSpecification",id_00d00f2400000fd60000000000000000);

        //## class ExecutionSpecification ##

        MClass id_00d00f2400000fd80000000000000000 = new MClass("00d00f24-0000-0fd8-0000-000000000000","ExecutionSpecification","00d00f24-0000-0fd8-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_00d00f2400000fd80000000000000000);
        this.mClass.put("ExecutionSpecification",id_00d00f2400000fd80000000000000000);

        //## class Gate ##

        MClass id_00d00f2400000fda0000000000000000 = new MClass("00d00f24-0000-0fda-0000-000000000000","Gate","00d00f24-0000-0fda-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_00d00f2400000fda0000000000000000);
        this.mClass.put("Gate",id_00d00f2400000fda0000000000000000);

        //## class GeneralOrdering ##

        MClass id_00d00f2400000fdc0000000000000000 = new MClass("00d00f24-0000-0fdc-0000-000000000000","GeneralOrdering","00d00f24-0000-0fdc-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_00d00f2400000fdc0000000000000000);
        this.mClass.put("GeneralOrdering",id_00d00f2400000fdc0000000000000000);

        //## class Interaction ##

        MClass id_0148033c00000cc10000000000000000 = new MClass("0148033c-0000-0cc1-0000-000000000000","Interaction","0148033c-0000-0cc1-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_0148033c00000cc10000000000000000);
        this.mClass.put("Interaction",id_0148033c00000cc10000000000000000);

        //## class InteractionFragment ##

        MClass id_00d00f2400000fde0000000000000000 = new MClass("00d00f24-0000-0fde-0000-000000000000","InteractionFragment","00d00f24-0000-0fde-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_00d00f2400000fde0000000000000000);
        this.mClass.put("InteractionFragment",id_00d00f2400000fde0000000000000000);
        // attribute LineNumber

        MAttribute id_01e4048c0000000a0000000000000000 = new MAttribute("01e4048c-0000-000a-0000-000000000000","LineNumber","00d00f24-0000-0fde-0000-000000000000.exml",this.mBaseTypes.get("integer"),false,true,false);
        id_00d00f2400000fde0000000000000000.getMAttributes().add(id_01e4048c0000000a0000000000000000);



        //## class InteractionOperand ##

        MClass id_00d00f2400000fe00000000000000000 = new MClass("00d00f24-0000-0fe0-0000-000000000000","InteractionOperand","00d00f24-0000-0fe0-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_00d00f2400000fe00000000000000000);
        this.mClass.put("InteractionOperand",id_00d00f2400000fe00000000000000000);
        // attribute Guard

        MAttribute id_00d00f24000010830000000000000000 = new MAttribute("00d00f24-0000-1083-0000-000000000000","Guard","00d00f24-0000-0fe0-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f2400000fe00000000000000000.getMAttributes().add(id_00d00f24000010830000000000000000);


        // attribute EndLineNumber

        MAttribute id_01e4048c000033910000000000000000 = new MAttribute("01e4048c-0000-3391-0000-000000000000","EndLineNumber","00d00f24-0000-0fe0-0000-000000000000.exml",this.mBaseTypes.get("integer"),false,true,false);
        id_00d00f2400000fe00000000000000000.getMAttributes().add(id_01e4048c000033910000000000000000);



        //## class InteractionUse ##

        MClass id_00d00f2400000fe20000000000000000 = new MClass("00d00f24-0000-0fe2-0000-000000000000","InteractionUse","00d00f24-0000-0fe2-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_00d00f2400000fe20000000000000000);
        this.mClass.put("InteractionUse",id_00d00f2400000fe20000000000000000);
        // attribute EndLineNumber

        MAttribute id_01e4048c000033930000000000000000 = new MAttribute("01e4048c-0000-3393-0000-000000000000","EndLineNumber","00d00f24-0000-0fe2-0000-000000000000.exml",this.mBaseTypes.get("integer"),false,true,false);
        id_00d00f2400000fe20000000000000000.getMAttributes().add(id_01e4048c000033930000000000000000);



        //## class Lifeline ##

        MClass id_00d00f2400000fe40000000000000000 = new MClass("00d00f24-0000-0fe4-0000-000000000000","Lifeline","00d00f24-0000-0fe4-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_00d00f2400000fe40000000000000000);
        this.mClass.put("Lifeline",id_00d00f2400000fe40000000000000000);
        // attribute Selector

        MAttribute id_00d00f24000010930000000000000000 = new MAttribute("00d00f24-0000-1093-0000-000000000000","Selector","00d00f24-0000-0fe4-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f2400000fe40000000000000000.getMAttributes().add(id_00d00f24000010930000000000000000);



        //## class Message ##

        MClass id_0148033c00000cce0000000000000000 = new MClass("0148033c-0000-0cce-0000-000000000000","Message","0148033c-0000-0cce-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_0148033c00000cce0000000000000000);
        this.mClass.put("Message",id_0148033c00000cce0000000000000000);
        // attribute Argument

        MAttribute id_0148033c0001a5fd0000000000000000 = new MAttribute("0148033c-0001-a5fd-0000-000000000000","Argument","0148033c-0000-0cce-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000cce0000000000000000.getMAttributes().add(id_0148033c0001a5fd0000000000000000);


        // attribute KindOfMessage

        MAttribute id_00d00f24000016fd0000000000000000 = new MAttribute("00d00f24-0000-16fd-0000-000000000000","KindOfMessage","0148033c-0000-0cce-0000-000000000000.exml",this.mBaseTypes.get("MessageKind"),false,true,false);
        id_0148033c00000cce0000000000000000.getMAttributes().add(id_00d00f24000016fd0000000000000000);


        // attribute SortOfMessage

        MAttribute id_0148033c0001a5ff0000000000000000 = new MAttribute("0148033c-0001-a5ff-0000-000000000000","SortOfMessage","0148033c-0000-0cce-0000-000000000000.exml",this.mBaseTypes.get("MessageSort"),false,true,false);
        id_0148033c00000cce0000000000000000.getMAttributes().add(id_0148033c0001a5ff0000000000000000);



        //## class MessageEnd ##

        MClass id_00d00f2400000fe60000000000000000 = new MClass("00d00f24-0000-0fe6-0000-000000000000","MessageEnd","00d00f24-0000-0fe6-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_00d00f2400000fe60000000000000000);
        this.mClass.put("MessageEnd",id_00d00f2400000fe60000000000000000);

        //## class OccurrenceSpecification ##

        MClass id_00d00f2400000fe80000000000000000 = new MClass("00d00f24-0000-0fe8-0000-000000000000","OccurrenceSpecification","00d00f24-0000-0fe8-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_00d00f2400000fe80000000000000000);
        this.mClass.put("OccurrenceSpecification",id_00d00f2400000fe80000000000000000);

        //## class PartDecomposition ##

        MClass id_00d00f2400000fea0000000000000000 = new MClass("00d00f24-0000-0fea-0000-000000000000","PartDecomposition","00d00f24-0000-0fea-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_00d00f2400000fea0000000000000000);
        this.mClass.put("PartDecomposition",id_00d00f2400000fea0000000000000000);

        //## class StateInvariant ##

        MClass id_00d00f2400000fec0000000000000000 = new MClass("00d00f24-0000-0fec-0000-000000000000","StateInvariant","00d00f24-0000-0fec-0000-000000000000.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_00d00f2400000fec0000000000000000);
        this.mClass.put("StateInvariant",id_00d00f2400000fec0000000000000000);
        // attribute Body

        MAttribute id_00d00f24000010b60000000000000000 = new MAttribute("00d00f24-0000-10b6-0000-000000000000","Body","00d00f24-0000-0fec-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_00d00f2400000fec0000000000000000.getMAttributes().add(id_00d00f24000010b60000000000000000);


        // attribute EndLineNumber

        MAttribute id_01e4048c000033a00000000000000000 = new MAttribute("01e4048c-0000-33a0-0000-000000000000","EndLineNumber","00d00f24-0000-0fec-0000-000000000000.exml",this.mBaseTypes.get("integer"),false,true,false);
        id_00d00f2400000fec0000000000000000.getMAttributes().add(id_01e4048c000033a00000000000000000);



        //## class TerminateSpecification ##

        MClass id_a56f1e02a5d411dd9376001ec947ccaf = new MClass("a56f1e02-a5d4-11dd-9376-001ec947ccaf","TerminateSpecification","a56f1e02-a5d4-11dd-9376-001ec947ccaf.exml");
        id_00d00f2400000b150000000000000000.getMClass().add(id_a56f1e02a5d411dd9376001ec947ccaf);
        this.mClass.put("TerminateSpecification",id_a56f1e02a5d411dd9376001ec947ccaf);



        //##### Package stateMachineModel#####
        MPackage id_00d00f2400000b140000000000000000 = new MPackage("00d00f24-0000-0b14-0000-000000000000","stateMachineModel","00d00f24-0000-0b14-0000-000000000000.exml");
        id_00d00f24000000030000000000000000.getMPackages().add(id_00d00f2400000b140000000000000000);
        //## class AbstractPseudoState ##

        MClass id_00d00f24000019180000000000000000 = new MClass("00d00f24-0000-1918-0000-000000000000","AbstractPseudoState","00d00f24-0000-1918-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_00d00f24000019180000000000000000);
        this.mClass.put("AbstractPseudoState",id_00d00f24000019180000000000000000);

        //## class ChoicePseudoState ##

        MClass id_00d00f24000017230000000000000000 = new MClass("00d00f24-0000-1723-0000-000000000000","ChoicePseudoState","00d00f24-0000-1723-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_00d00f24000017230000000000000000);
        this.mClass.put("ChoicePseudoState",id_00d00f24000017230000000000000000);

        //## class ConnectionPointReference ##

        MClass id_00d00f24000017790000000000000000 = new MClass("00d00f24-0000-1779-0000-000000000000","ConnectionPointReference","00d00f24-0000-1779-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_00d00f24000017790000000000000000);
        this.mClass.put("ConnectionPointReference",id_00d00f24000017790000000000000000);

        //## class DeepHistoryPseudoState ##

        MClass id_00d00f24000017170000000000000000 = new MClass("00d00f24-0000-1717-0000-000000000000","DeepHistoryPseudoState","00d00f24-0000-1717-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_00d00f24000017170000000000000000);
        this.mClass.put("DeepHistoryPseudoState",id_00d00f24000017170000000000000000);

        //## class EntryPointPseudoState ##

        MClass id_00d00f24000017250000000000000000 = new MClass("00d00f24-0000-1725-0000-000000000000","EntryPointPseudoState","00d00f24-0000-1725-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_00d00f24000017250000000000000000);
        this.mClass.put("EntryPointPseudoState",id_00d00f24000017250000000000000000);

        //## class ExitPointPseudoState ##

        MClass id_00d00f24000017270000000000000000 = new MClass("00d00f24-0000-1727-0000-000000000000","ExitPointPseudoState","00d00f24-0000-1727-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_00d00f24000017270000000000000000);
        this.mClass.put("ExitPointPseudoState",id_00d00f24000017270000000000000000);

        //## class ForkPseudoState ##

        MClass id_00d00f240000171d0000000000000000 = new MClass("00d00f24-0000-171d-0000-000000000000","ForkPseudoState","00d00f24-0000-171d-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_00d00f240000171d0000000000000000);
        this.mClass.put("ForkPseudoState",id_00d00f240000171d0000000000000000);

        //## class InitialPseudoState ##

        MClass id_00d00f24000017150000000000000000 = new MClass("00d00f24-0000-1715-0000-000000000000","InitialPseudoState","00d00f24-0000-1715-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_00d00f24000017150000000000000000);
        this.mClass.put("InitialPseudoState",id_00d00f24000017150000000000000000);

        //## class InternalTransition ##

        MClass id_0148033c00000ce60000000000000000 = new MClass("0148033c-0000-0ce6-0000-000000000000","InternalTransition","0148033c-0000-0ce6-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_0148033c00000ce60000000000000000);
        this.mClass.put("InternalTransition",id_0148033c00000ce60000000000000000);

        //## class JoinPseudoState ##

        MClass id_00d00f240000171b0000000000000000 = new MClass("00d00f24-0000-171b-0000-000000000000","JoinPseudoState","00d00f24-0000-171b-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_00d00f240000171b0000000000000000);
        this.mClass.put("JoinPseudoState",id_00d00f240000171b0000000000000000);

        //## class JunctionPseudoState ##

        MClass id_00d00f24000017210000000000000000 = new MClass("00d00f24-0000-1721-0000-000000000000","JunctionPseudoState","00d00f24-0000-1721-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_00d00f24000017210000000000000000);
        this.mClass.put("JunctionPseudoState",id_00d00f24000017210000000000000000);

        //## class ShallowHistoryPseudoState ##

        MClass id_00d00f24000017190000000000000000 = new MClass("00d00f24-0000-1719-0000-000000000000","ShallowHistoryPseudoState","00d00f24-0000-1719-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_00d00f24000017190000000000000000);
        this.mClass.put("ShallowHistoryPseudoState",id_00d00f24000017190000000000000000);

        //## class State ##

        MClass id_0148033c00000ce30000000000000000 = new MClass("0148033c-0000-0ce3-0000-000000000000","State","0148033c-0000-0ce3-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_0148033c00000ce30000000000000000);
        this.mClass.put("State",id_0148033c00000ce30000000000000000);

        //## class StateMachine ##

        MClass id_0148033c00000ce10000000000000000 = new MClass("0148033c-0000-0ce1-0000-000000000000","StateMachine","0148033c-0000-0ce1-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_0148033c00000ce10000000000000000);
        this.mClass.put("StateMachine",id_0148033c00000ce10000000000000000);
        // attribute Kind

        MAttribute id_0148033c0001bae20000000000000000 = new MAttribute("0148033c-0001-bae2-0000-000000000000","Kind","0148033c-0000-0ce1-0000-000000000000.exml",this.mBaseTypes.get("KindOfStateMachine"),false,true,false);
        id_0148033c00000ce10000000000000000.getMAttributes().add(id_0148033c0001bae20000000000000000);



        //## class StateVertex ##

        MClass id_0148033c00000ce20000000000000000 = new MClass("0148033c-0000-0ce2-0000-000000000000","StateVertex","0148033c-0000-0ce2-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_0148033c00000ce20000000000000000);
        this.mClass.put("StateVertex",id_0148033c00000ce20000000000000000);

        //## class TerminatePseudoState ##

        MClass id_00d00f24000017290000000000000000 = new MClass("00d00f24-0000-1729-0000-000000000000","TerminatePseudoState","00d00f24-0000-1729-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_00d00f24000017290000000000000000);
        this.mClass.put("TerminatePseudoState",id_00d00f24000017290000000000000000);

        //## class Transition ##

        MClass id_0148033c00000ce50000000000000000 = new MClass("0148033c-0000-0ce5-0000-000000000000","Transition","0148033c-0000-0ce5-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_0148033c00000ce50000000000000000);
        this.mClass.put("Transition",id_0148033c00000ce50000000000000000);
        // attribute Effect

        MAttribute id_0148033c0001bf840000000000000000 = new MAttribute("0148033c-0001-bf84-0000-000000000000","Effect","0148033c-0000-0ce5-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000ce50000000000000000.getMAttributes().add(id_0148033c0001bf840000000000000000);


        // attribute ReceivedEvents

        MAttribute id_0148033c0001bf880000000000000000 = new MAttribute("0148033c-0001-bf88-0000-000000000000","ReceivedEvents","0148033c-0000-0ce5-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000ce50000000000000000.getMAttributes().add(id_0148033c0001bf880000000000000000);


        // attribute SentEvents

        MAttribute id_0148033c0001bf860000000000000000 = new MAttribute("0148033c-0001-bf86-0000-000000000000","SentEvents","0148033c-0000-0ce5-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000ce50000000000000000.getMAttributes().add(id_0148033c0001bf860000000000000000);


        // attribute Guard

        MAttribute id_01f420d000036f220000000000000000 = new MAttribute("01f420d0-0003-6f22-0000-000000000000","Guard","0148033c-0000-0ce5-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000ce50000000000000000.getMAttributes().add(id_01f420d000036f220000000000000000);


        // attribute PostCondition

        MAttribute id_01f420d000036f240000000000000000 = new MAttribute("01f420d0-0003-6f24-0000-000000000000","PostCondition","0148033c-0000-0ce5-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_0148033c00000ce50000000000000000.getMAttributes().add(id_01f420d000036f240000000000000000);



        //## class FinalState ##

        MClass id_01f420d00003681e0000000000000000 = new MClass("01f420d0-0003-681e-0000-000000000000","FinalState","01f420d0-0003-681e-0000-000000000000.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_01f420d00003681e0000000000000000);
        this.mClass.put("FinalState",id_01f420d00003681e0000000000000000);

        //## class Region ##

        MClass id_d79b6c03a42c11dda00b001ec947ccaf = new MClass("d79b6c03-a42c-11dd-a00b-001ec947ccaf","Region","d79b6c03-a42c-11dd-a00b-001ec947ccaf.exml");
        id_00d00f2400000b140000000000000000.getMClass().add(id_d79b6c03a42c11dda00b001ec947ccaf);
        this.mClass.put("Region",id_d79b6c03a42c11dda00b001ec947ccaf);



        //##### Package usecaseModel#####
        MPackage id_00d00f24000009020000000000000000 = new MPackage("00d00f24-0000-0902-0000-000000000000","usecaseModel","00d00f24-0000-0902-0000-000000000000.exml");
        id_00d00f24000000030000000000000000.getMPackages().add(id_00d00f24000009020000000000000000);
        //## class Actor ##

        MClass id_0148033c00000cd10000000000000000 = new MClass("0148033c-0000-0cd1-0000-000000000000","Actor","0148033c-0000-0cd1-0000-000000000000.exml");
        id_00d00f24000009020000000000000000.getMClass().add(id_0148033c00000cd10000000000000000);
        this.mClass.put("Actor",id_0148033c00000cd10000000000000000);

        //## class UseCase ##

        MClass id_0148033c00000cd20000000000000000 = new MClass("0148033c-0000-0cd2-0000-000000000000","UseCase","0148033c-0000-0cd2-0000-000000000000.exml");
        id_00d00f24000009020000000000000000.getMClass().add(id_0148033c00000cd20000000000000000);
        this.mClass.put("UseCase",id_0148033c00000cd20000000000000000);

        //## class UseCaseDependency ##

        MClass id_0148033c00000cd40000000000000000 = new MClass("0148033c-0000-0cd4-0000-000000000000","UseCaseDependency","0148033c-0000-0cd4-0000-000000000000.exml");
        id_00d00f24000009020000000000000000.getMClass().add(id_0148033c00000cd40000000000000000);
        this.mClass.put("UseCaseDependency",id_0148033c00000cd40000000000000000);

        //## class ExtensionPoint ##

        MClass id_00d0002400000c000000000000000000 = new MClass("00d00024-0000-0c00-0000-000000000000","ExtensionPoint","00d00024-0000-0c00-0000-000000000000.exml");
        id_00d00f24000009020000000000000000.getMClass().add(id_00d0002400000c000000000000000000);
        this.mClass.put("ExtensionPoint",id_00d0002400000c000000000000000000);
        // attribute Visibility

        MAttribute id_00d0002400000c190000000000000000 = new MAttribute("00d00024-0000-0c19-0000-000000000000","Visibility","00d00024-0000-0c00-0000-000000000000.exml",this.mBaseTypes.get("VisibilityMode"),false,true,false);
        id_00d0002400000c000000000000000000.getMAttributes().add(id_00d0002400000c190000000000000000);





        //##### Package communicationModel#####
        MPackage id_01ec00cc00172ace0000000000000000 = new MPackage("01ec00cc-0017-2ace-0000-000000000000","communicationModel","01ec00cc-0017-2ace-0000-000000000000.exml");
        id_00d00f24000000030000000000000000.getMPackages().add(id_01ec00cc00172ace0000000000000000);
        //## class CommunicationInteraction ##

        MClass id_01ec00cc00172ad30000000000000000 = new MClass("01ec00cc-0017-2ad3-0000-000000000000","CommunicationInteraction","01ec00cc-0017-2ad3-0000-000000000000.exml");
        id_01ec00cc00172ace0000000000000000.getMClass().add(id_01ec00cc00172ad30000000000000000);
        this.mClass.put("CommunicationInteraction",id_01ec00cc00172ad30000000000000000);

        //## class CommunicationNode ##

        MClass id_01ec00cc00172b330000000000000000 = new MClass("01ec00cc-0017-2b33-0000-000000000000","CommunicationNode","01ec00cc-0017-2b33-0000-000000000000.exml");
        id_01ec00cc00172ace0000000000000000.getMClass().add(id_01ec00cc00172b330000000000000000);
        this.mClass.put("CommunicationNode",id_01ec00cc00172b330000000000000000);
        // attribute Selector

        MAttribute id_01ec00cc00172b810000000000000000 = new MAttribute("01ec00cc-0017-2b81-0000-000000000000","Selector","01ec00cc-0017-2b33-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_01ec00cc00172b330000000000000000.getMAttributes().add(id_01ec00cc00172b810000000000000000);



        //## class CommunicationMessage ##

        MClass id_01ec00cc00172da00000000000000000 = new MClass("01ec00cc-0017-2da0-0000-000000000000","CommunicationMessage","01ec00cc-0017-2da0-0000-000000000000.exml");
        id_01ec00cc00172ace0000000000000000.getMClass().add(id_01ec00cc00172da00000000000000000);
        this.mClass.put("CommunicationMessage",id_01ec00cc00172da00000000000000000);
        // attribute Argument

        MAttribute id_01ec00cc00172db60000000000000000 = new MAttribute("01ec00cc-0017-2db6-0000-000000000000","Argument","01ec00cc-0017-2da0-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_01ec00cc00172da00000000000000000.getMAttributes().add(id_01ec00cc00172db60000000000000000);


        // attribute Sequence

        MAttribute id_01ec00cc00172e060000000000000000 = new MAttribute("01ec00cc-0017-2e06-0000-000000000000","Sequence","01ec00cc-0017-2da0-0000-000000000000.exml",this.mBaseTypes.get("string"),false,true,false);
        id_01ec00cc00172da00000000000000000.getMAttributes().add(id_01ec00cc00172e060000000000000000);


        // attribute SortOfMessage

        MAttribute id_01ec00cc00172e1a0000000000000000 = new MAttribute("01ec00cc-0017-2e1a-0000-000000000000","SortOfMessage","01ec00cc-0017-2da0-0000-000000000000.exml",this.mBaseTypes.get("MessageSort"),false,true,false);
        id_01ec00cc00172da00000000000000000.getMAttributes().add(id_01ec00cc00172e1a0000000000000000);



        //## class CommunicationChannel ##

        MClass id_fbce3b8c076842e0a09b78f366bdeb73 = new MClass("fbce3b8c-0768-42e0-a09b-78f366bdeb73","CommunicationChannel","fbce3b8c-0768-42e0-a09b-78f366bdeb73.exml");
        id_01ec00cc00172ace0000000000000000.getMClass().add(id_fbce3b8c076842e0a09b78f366bdeb73);
        this.mClass.put("CommunicationChannel",id_fbce3b8c076842e0a09b78f366bdeb73);





        //##### Package informationFlow#####
        MPackage id_00d00f24000012880000000000000000 = new MPackage("00d00f24-0000-1288-0000-000000000000","informationFlow","00d00f24-0000-1288-0000-000000000000.exml");
        id_01f4038c000042d60000000000000000.getMPackages().add(id_00d00f24000012880000000000000000);
        //## class InformationFlow ##

        MClass id_00d00f240000128a0000000000000000 = new MClass("00d00f24-0000-128a-0000-000000000000","InformationFlow","00d00f24-0000-128a-0000-000000000000.exml");
        id_00d00f24000012880000000000000000.getMClass().add(id_00d00f240000128a0000000000000000);
        this.mClass.put("InformationFlow",id_00d00f240000128a0000000000000000);

        //## class InformationItem ##

        MClass id_00d00f240000128c0000000000000000 = new MClass("00d00f24-0000-128c-0000-000000000000","InformationItem","00d00f24-0000-128c-0000-000000000000.exml");
        id_00d00f24000012880000000000000000.getMClass().add(id_00d00f240000128c0000000000000000);
        this.mClass.put("InformationItem",id_00d00f240000128c0000000000000000);

        //## class DataFlow ##

        MClass id_0148033c00000cbf0000000000000000 = new MClass("0148033c-0000-0cbf-0000-000000000000","DataFlow","0148033c-0000-0cbf-0000-000000000000.exml");
        id_00d00f24000012880000000000000000.getMClass().add(id_0148033c00000cbf0000000000000000);
        this.mClass.put("DataFlow",id_0148033c00000cbf0000000000000000);
    }

    private void initGeneralizations() {



         // ########### Generalizations ###########


        // Generalization : class AnalystItem
        this.mClass.get("AnalystItem").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("AnalystItem").getMSubTypes().add(this.mClass.get("AnalystElement"));
        this.mClass.get("AnalystItem").getMSubTypes().add(this.mClass.get("AnalystContainer"));

        // Generalization : class AnalystElement
        this.mClass.get("AnalystElement").getMSuperType().add(this.mClass.get("AnalystItem"));
        this.mClass.get("AnalystElement").getMSubTypes().add(this.mClass.get("BusinessRule"));
        this.mClass.get("AnalystElement").getMSubTypes().add(this.mClass.get("Goal"));
        this.mClass.get("AnalystElement").getMSubTypes().add(this.mClass.get("Requirement"));
        this.mClass.get("AnalystElement").getMSubTypes().add(this.mClass.get("Term"));
        this.mClass.get("AnalystElement").getMSubTypes().add(this.mClass.get("GenericAnalystElement"));
        this.mClass.get("AnalystElement").getMSubTypes().add(this.mClass.get("Risk"));

        // Generalization : class AnalystContainer
        this.mClass.get("AnalystContainer").getMSuperType().add(this.mClass.get("AnalystItem"));
        this.mClass.get("AnalystContainer").getMSubTypes().add(this.mClass.get("BusinessRuleContainer"));
        this.mClass.get("AnalystContainer").getMSubTypes().add(this.mClass.get("Dictionary"));
        this.mClass.get("AnalystContainer").getMSubTypes().add(this.mClass.get("GoalContainer"));
        this.mClass.get("AnalystContainer").getMSubTypes().add(this.mClass.get("RequirementContainer"));
        this.mClass.get("AnalystContainer").getMSubTypes().add(this.mClass.get("GenericAnalystContainer"));
        this.mClass.get("AnalystContainer").getMSubTypes().add(this.mClass.get("RiskContainer"));

        // Generalization : class AnalystProject
        this.mClass.get("AnalystProject").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class AnalystPropertyTable
        this.mClass.get("AnalystPropertyTable").getMSuperType().add(this.mClass.get("TypedPropertyTable"));

        // Generalization : class BusinessRule
        this.mClass.get("BusinessRule").getMSuperType().add(this.mClass.get("AnalystElement"));

        // Generalization : class BusinessRuleContainer
        this.mClass.get("BusinessRuleContainer").getMSuperType().add(this.mClass.get("AnalystContainer"));

        // Generalization : class Dictionary
        this.mClass.get("Dictionary").getMSuperType().add(this.mClass.get("AnalystContainer"));

        // Generalization : class Goal
        this.mClass.get("Goal").getMSuperType().add(this.mClass.get("AnalystElement"));

        // Generalization : class GoalContainer
        this.mClass.get("GoalContainer").getMSuperType().add(this.mClass.get("AnalystContainer"));

        // Generalization : class PropertyContainer
        this.mClass.get("PropertyContainer").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Requirement
        this.mClass.get("Requirement").getMSuperType().add(this.mClass.get("AnalystElement"));

        // Generalization : class RequirementContainer
        this.mClass.get("RequirementContainer").getMSuperType().add(this.mClass.get("AnalystContainer"));

        // Generalization : class Term
        this.mClass.get("Term").getMSuperType().add(this.mClass.get("AnalystElement"));

        // Generalization : class GenericAnalystContainer
        this.mClass.get("GenericAnalystContainer").getMSuperType().add(this.mClass.get("AnalystContainer"));

        // Generalization : class GenericAnalystElement
        this.mClass.get("GenericAnalystElement").getMSuperType().add(this.mClass.get("AnalystElement"));

        // Generalization : class RiskContainer
        this.mClass.get("RiskContainer").getMSuperType().add(this.mClass.get("AnalystContainer"));

        // Generalization : class Risk
        this.mClass.get("Risk").getMSuperType().add(this.mClass.get("AnalystElement"));

        // Generalization : class BpmnCollaboration
        this.mClass.get("BpmnCollaboration").getMSuperType().add(this.mClass.get("BpmnRootElement"));

        // Generalization : class BpmnLane
        this.mClass.get("BpmnLane").getMSuperType().add(this.mClass.get("BpmnBaseElement"));

        // Generalization : class BpmnLaneSet
        this.mClass.get("BpmnLaneSet").getMSuperType().add(this.mClass.get("BpmnBaseElement"));

        // Generalization : class BpmnParticipant
        this.mClass.get("BpmnParticipant").getMSuperType().add(this.mClass.get("BpmnBaseElement"));

        // Generalization : class BpmnProcess
        this.mClass.get("BpmnProcess").getMSuperType().add(this.mClass.get("BpmnRootElement"));

        // Generalization : class BpmnAssociation
        this.mClass.get("BpmnAssociation").getMSuperType().add(this.mClass.get("BpmnArtifact"));

        // Generalization : class BpmnBaseElement
        this.mClass.get("BpmnBaseElement").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnLane"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnLaneSet"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnParticipant"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnArtifact"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnFlowElement"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnRootElement"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnMessageFlow"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnComplexBehaviorDefinition"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnLoopCharacteristics"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnEventDefinition"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnDataAssociation"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnSequenceFlowDataAssociation"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnDataState"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnResourceParameter"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnResourceRole"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnResourceParameterBinding"));
        this.mClass.get("BpmnBaseElement").getMSubTypes().add(this.mClass.get("BpmnOperation"));

        // Generalization : class BpmnArtifact
        this.mClass.get("BpmnArtifact").getMSuperType().add(this.mClass.get("BpmnBaseElement"));
        this.mClass.get("BpmnArtifact").getMSubTypes().add(this.mClass.get("BpmnAssociation"));
        this.mClass.get("BpmnArtifact").getMSubTypes().add(this.mClass.get("BpmnGroup"));

        // Generalization : class BpmnFlowElement
        this.mClass.get("BpmnFlowElement").getMSuperType().add(this.mClass.get("BpmnBaseElement"));
        this.mClass.get("BpmnFlowElement").getMSubTypes().add(this.mClass.get("BpmnFlowNode"));
        this.mClass.get("BpmnFlowElement").getMSubTypes().add(this.mClass.get("BpmnSequenceFlow"));
        this.mClass.get("BpmnFlowElement").getMSubTypes().add(this.mClass.get("BpmnItemAwareElement"));

        // Generalization : class BpmnFlowNode
        this.mClass.get("BpmnFlowNode").getMSuperType().add(this.mClass.get("BpmnFlowElement"));
        this.mClass.get("BpmnFlowNode").getMSubTypes().add(this.mClass.get("BpmnActivity"));
        this.mClass.get("BpmnFlowNode").getMSubTypes().add(this.mClass.get("BpmnEvent"));
        this.mClass.get("BpmnFlowNode").getMSubTypes().add(this.mClass.get("BpmnGateway"));

        // Generalization : class BpmnGroup
        this.mClass.get("BpmnGroup").getMSuperType().add(this.mClass.get("BpmnArtifact"));

        // Generalization : class BpmnRootElement
        this.mClass.get("BpmnRootElement").getMSuperType().add(this.mClass.get("BpmnBaseElement"));
        this.mClass.get("BpmnRootElement").getMSubTypes().add(this.mClass.get("BpmnCollaboration"));
        this.mClass.get("BpmnRootElement").getMSubTypes().add(this.mClass.get("BpmnProcess"));
        this.mClass.get("BpmnRootElement").getMSubTypes().add(this.mClass.get("BpmnMessage"));
        this.mClass.get("BpmnRootElement").getMSubTypes().add(this.mClass.get("BpmnItemDefinition"));
        this.mClass.get("BpmnRootElement").getMSubTypes().add(this.mClass.get("BpmnResource"));
        this.mClass.get("BpmnRootElement").getMSubTypes().add(this.mClass.get("BpmnInterface"));
        this.mClass.get("BpmnRootElement").getMSubTypes().add(this.mClass.get("BpmnEndPoint"));

        // Generalization : class BpmnBehavior
        this.mClass.get("BpmnBehavior").getMSuperType().add(this.mClass.get("Behavior"));

        // Generalization : class BpmnMessage
        this.mClass.get("BpmnMessage").getMSuperType().add(this.mClass.get("BpmnRootElement"));

        // Generalization : class BpmnMessageFlow
        this.mClass.get("BpmnMessageFlow").getMSuperType().add(this.mClass.get("BpmnBaseElement"));

        // Generalization : class BpmnSequenceFlow
        this.mClass.get("BpmnSequenceFlow").getMSuperType().add(this.mClass.get("BpmnFlowElement"));

        // Generalization : class BpmnActivity
        this.mClass.get("BpmnActivity").getMSuperType().add(this.mClass.get("BpmnFlowNode"));
        this.mClass.get("BpmnActivity").getMSubTypes().add(this.mClass.get("BpmnCallActivity"));
        this.mClass.get("BpmnActivity").getMSubTypes().add(this.mClass.get("BpmnSubProcess"));
        this.mClass.get("BpmnActivity").getMSubTypes().add(this.mClass.get("BpmnTask"));

        // Generalization : class BpmnAdHocSubProcess
        this.mClass.get("BpmnAdHocSubProcess").getMSuperType().add(this.mClass.get("BpmnSubProcess"));

        // Generalization : class BpmnBusinessRuleTask
        this.mClass.get("BpmnBusinessRuleTask").getMSuperType().add(this.mClass.get("BpmnTask"));

        // Generalization : class BpmnCallActivity
        this.mClass.get("BpmnCallActivity").getMSuperType().add(this.mClass.get("BpmnActivity"));

        // Generalization : class BpmnComplexBehaviorDefinition
        this.mClass.get("BpmnComplexBehaviorDefinition").getMSuperType().add(this.mClass.get("BpmnBaseElement"));

        // Generalization : class BpmnLoopCharacteristics
        this.mClass.get("BpmnLoopCharacteristics").getMSuperType().add(this.mClass.get("BpmnBaseElement"));
        this.mClass.get("BpmnLoopCharacteristics").getMSubTypes().add(this.mClass.get("BpmnMultiInstanceLoopCharacteristics"));
        this.mClass.get("BpmnLoopCharacteristics").getMSubTypes().add(this.mClass.get("BpmnStandardLoopCharacteristics"));

        // Generalization : class BpmnManualTask
        this.mClass.get("BpmnManualTask").getMSuperType().add(this.mClass.get("BpmnTask"));

        // Generalization : class BpmnMultiInstanceLoopCharacteristics
        this.mClass.get("BpmnMultiInstanceLoopCharacteristics").getMSuperType().add(this.mClass.get("BpmnLoopCharacteristics"));

        // Generalization : class BpmnReceiveTask
        this.mClass.get("BpmnReceiveTask").getMSuperType().add(this.mClass.get("BpmnTask"));

        // Generalization : class BpmnScriptTask
        this.mClass.get("BpmnScriptTask").getMSuperType().add(this.mClass.get("BpmnTask"));

        // Generalization : class BpmnSendTask
        this.mClass.get("BpmnSendTask").getMSuperType().add(this.mClass.get("BpmnTask"));

        // Generalization : class BpmnServiceTask
        this.mClass.get("BpmnServiceTask").getMSuperType().add(this.mClass.get("BpmnTask"));

        // Generalization : class BpmnStandardLoopCharacteristics
        this.mClass.get("BpmnStandardLoopCharacteristics").getMSuperType().add(this.mClass.get("BpmnLoopCharacteristics"));

        // Generalization : class BpmnSubProcess
        this.mClass.get("BpmnSubProcess").getMSuperType().add(this.mClass.get("BpmnActivity"));
        this.mClass.get("BpmnSubProcess").getMSubTypes().add(this.mClass.get("BpmnAdHocSubProcess"));
        this.mClass.get("BpmnSubProcess").getMSubTypes().add(this.mClass.get("BpmnTransaction"));

        // Generalization : class BpmnTask
        this.mClass.get("BpmnTask").getMSuperType().add(this.mClass.get("BpmnActivity"));
        this.mClass.get("BpmnTask").getMSubTypes().add(this.mClass.get("BpmnBusinessRuleTask"));
        this.mClass.get("BpmnTask").getMSubTypes().add(this.mClass.get("BpmnManualTask"));
        this.mClass.get("BpmnTask").getMSubTypes().add(this.mClass.get("BpmnReceiveTask"));
        this.mClass.get("BpmnTask").getMSubTypes().add(this.mClass.get("BpmnScriptTask"));
        this.mClass.get("BpmnTask").getMSubTypes().add(this.mClass.get("BpmnSendTask"));
        this.mClass.get("BpmnTask").getMSubTypes().add(this.mClass.get("BpmnServiceTask"));
        this.mClass.get("BpmnTask").getMSubTypes().add(this.mClass.get("BpmnUserTask"));

        // Generalization : class BpmnTransaction
        this.mClass.get("BpmnTransaction").getMSuperType().add(this.mClass.get("BpmnSubProcess"));

        // Generalization : class BpmnUserTask
        this.mClass.get("BpmnUserTask").getMSuperType().add(this.mClass.get("BpmnTask"));

        // Generalization : class BpmnBoundaryEvent
        this.mClass.get("BpmnBoundaryEvent").getMSuperType().add(this.mClass.get("BpmnCatchEvent"));

        // Generalization : class BpmnCancelEventDefinition
        this.mClass.get("BpmnCancelEventDefinition").getMSuperType().add(this.mClass.get("BpmnEventDefinition"));

        // Generalization : class BpmnCatchEvent
        this.mClass.get("BpmnCatchEvent").getMSuperType().add(this.mClass.get("BpmnEvent"));
        this.mClass.get("BpmnCatchEvent").getMSubTypes().add(this.mClass.get("BpmnBoundaryEvent"));
        this.mClass.get("BpmnCatchEvent").getMSubTypes().add(this.mClass.get("BpmnIntermediateCatchEvent"));
        this.mClass.get("BpmnCatchEvent").getMSubTypes().add(this.mClass.get("BpmnStartEvent"));

        // Generalization : class BpmnCompensateEventDefinition
        this.mClass.get("BpmnCompensateEventDefinition").getMSuperType().add(this.mClass.get("BpmnEventDefinition"));

        // Generalization : class BpmnConditionalEventDefinition
        this.mClass.get("BpmnConditionalEventDefinition").getMSuperType().add(this.mClass.get("BpmnEventDefinition"));

        // Generalization : class BpmnEndEvent
        this.mClass.get("BpmnEndEvent").getMSuperType().add(this.mClass.get("BpmnThrowEvent"));

        // Generalization : class BpmnErrorEventDefinition
        this.mClass.get("BpmnErrorEventDefinition").getMSuperType().add(this.mClass.get("BpmnEventDefinition"));

        // Generalization : class BpmnEscalationEventDefinition
        this.mClass.get("BpmnEscalationEventDefinition").getMSuperType().add(this.mClass.get("BpmnEventDefinition"));

        // Generalization : class BpmnEvent
        this.mClass.get("BpmnEvent").getMSuperType().add(this.mClass.get("BpmnFlowNode"));
        this.mClass.get("BpmnEvent").getMSubTypes().add(this.mClass.get("BpmnCatchEvent"));
        this.mClass.get("BpmnEvent").getMSubTypes().add(this.mClass.get("BpmnThrowEvent"));

        // Generalization : class BpmnEventDefinition
        this.mClass.get("BpmnEventDefinition").getMSuperType().add(this.mClass.get("BpmnBaseElement"));
        this.mClass.get("BpmnEventDefinition").getMSubTypes().add(this.mClass.get("BpmnCancelEventDefinition"));
        this.mClass.get("BpmnEventDefinition").getMSubTypes().add(this.mClass.get("BpmnCompensateEventDefinition"));
        this.mClass.get("BpmnEventDefinition").getMSubTypes().add(this.mClass.get("BpmnConditionalEventDefinition"));
        this.mClass.get("BpmnEventDefinition").getMSubTypes().add(this.mClass.get("BpmnErrorEventDefinition"));
        this.mClass.get("BpmnEventDefinition").getMSubTypes().add(this.mClass.get("BpmnEscalationEventDefinition"));
        this.mClass.get("BpmnEventDefinition").getMSubTypes().add(this.mClass.get("BpmnLinkEventDefinition"));
        this.mClass.get("BpmnEventDefinition").getMSubTypes().add(this.mClass.get("BpmnMessageEventDefinition"));
        this.mClass.get("BpmnEventDefinition").getMSubTypes().add(this.mClass.get("BpmnSignalEventDefinition"));
        this.mClass.get("BpmnEventDefinition").getMSubTypes().add(this.mClass.get("BpmnTerminateEventDefinition"));
        this.mClass.get("BpmnEventDefinition").getMSubTypes().add(this.mClass.get("BpmnTimerEventDefinition"));

        // Generalization : class BpmnImplicitThrowEvent
        this.mClass.get("BpmnImplicitThrowEvent").getMSuperType().add(this.mClass.get("BpmnThrowEvent"));

        // Generalization : class BpmnIntermediateCatchEvent
        this.mClass.get("BpmnIntermediateCatchEvent").getMSuperType().add(this.mClass.get("BpmnCatchEvent"));

        // Generalization : class BpmnIntermediateThrowEvent
        this.mClass.get("BpmnIntermediateThrowEvent").getMSuperType().add(this.mClass.get("BpmnThrowEvent"));

        // Generalization : class BpmnLinkEventDefinition
        this.mClass.get("BpmnLinkEventDefinition").getMSuperType().add(this.mClass.get("BpmnEventDefinition"));

        // Generalization : class BpmnMessageEventDefinition
        this.mClass.get("BpmnMessageEventDefinition").getMSuperType().add(this.mClass.get("BpmnEventDefinition"));

        // Generalization : class BpmnSignalEventDefinition
        this.mClass.get("BpmnSignalEventDefinition").getMSuperType().add(this.mClass.get("BpmnEventDefinition"));

        // Generalization : class BpmnStartEvent
        this.mClass.get("BpmnStartEvent").getMSuperType().add(this.mClass.get("BpmnCatchEvent"));

        // Generalization : class BpmnTerminateEventDefinition
        this.mClass.get("BpmnTerminateEventDefinition").getMSuperType().add(this.mClass.get("BpmnEventDefinition"));

        // Generalization : class BpmnThrowEvent
        this.mClass.get("BpmnThrowEvent").getMSuperType().add(this.mClass.get("BpmnEvent"));
        this.mClass.get("BpmnThrowEvent").getMSubTypes().add(this.mClass.get("BpmnEndEvent"));
        this.mClass.get("BpmnThrowEvent").getMSubTypes().add(this.mClass.get("BpmnImplicitThrowEvent"));
        this.mClass.get("BpmnThrowEvent").getMSubTypes().add(this.mClass.get("BpmnIntermediateThrowEvent"));

        // Generalization : class BpmnTimerEventDefinition
        this.mClass.get("BpmnTimerEventDefinition").getMSuperType().add(this.mClass.get("BpmnEventDefinition"));

        // Generalization : class BpmnComplexGateway
        this.mClass.get("BpmnComplexGateway").getMSuperType().add(this.mClass.get("BpmnGateway"));

        // Generalization : class BpmnEventBasedGateway
        this.mClass.get("BpmnEventBasedGateway").getMSuperType().add(this.mClass.get("BpmnGateway"));

        // Generalization : class BpmnExclusiveGateway
        this.mClass.get("BpmnExclusiveGateway").getMSuperType().add(this.mClass.get("BpmnGateway"));

        // Generalization : class BpmnGateway
        this.mClass.get("BpmnGateway").getMSuperType().add(this.mClass.get("BpmnFlowNode"));
        this.mClass.get("BpmnGateway").getMSubTypes().add(this.mClass.get("BpmnComplexGateway"));
        this.mClass.get("BpmnGateway").getMSubTypes().add(this.mClass.get("BpmnEventBasedGateway"));
        this.mClass.get("BpmnGateway").getMSubTypes().add(this.mClass.get("BpmnExclusiveGateway"));
        this.mClass.get("BpmnGateway").getMSubTypes().add(this.mClass.get("BpmnInclusiveGateway"));
        this.mClass.get("BpmnGateway").getMSubTypes().add(this.mClass.get("BpmnParallelGateway"));

        // Generalization : class BpmnInclusiveGateway
        this.mClass.get("BpmnInclusiveGateway").getMSuperType().add(this.mClass.get("BpmnGateway"));

        // Generalization : class BpmnParallelGateway
        this.mClass.get("BpmnParallelGateway").getMSuperType().add(this.mClass.get("BpmnGateway"));

        // Generalization : class BpmnDataObject
        this.mClass.get("BpmnDataObject").getMSuperType().add(this.mClass.get("BpmnItemAwareElement"));

        // Generalization : class BpmnDataStore
        this.mClass.get("BpmnDataStore").getMSuperType().add(this.mClass.get("BpmnItemAwareElement"));

        // Generalization : class BpmnDataAssociation
        this.mClass.get("BpmnDataAssociation").getMSuperType().add(this.mClass.get("BpmnBaseElement"));

        // Generalization : class BpmnSequenceFlowDataAssociation
        this.mClass.get("BpmnSequenceFlowDataAssociation").getMSuperType().add(this.mClass.get("BpmnBaseElement"));

        // Generalization : class BpmnDataOutput
        this.mClass.get("BpmnDataOutput").getMSuperType().add(this.mClass.get("BpmnItemAwareElement"));

        // Generalization : class BpmnDataInput
        this.mClass.get("BpmnDataInput").getMSuperType().add(this.mClass.get("BpmnItemAwareElement"));

        // Generalization : class BpmnItemAwareElement
        this.mClass.get("BpmnItemAwareElement").getMSuperType().add(this.mClass.get("BpmnFlowElement"));
        this.mClass.get("BpmnItemAwareElement").getMSubTypes().add(this.mClass.get("BpmnDataObject"));
        this.mClass.get("BpmnItemAwareElement").getMSubTypes().add(this.mClass.get("BpmnDataStore"));
        this.mClass.get("BpmnItemAwareElement").getMSubTypes().add(this.mClass.get("BpmnDataOutput"));
        this.mClass.get("BpmnItemAwareElement").getMSubTypes().add(this.mClass.get("BpmnDataInput"));

        // Generalization : class BpmnItemDefinition
        this.mClass.get("BpmnItemDefinition").getMSuperType().add(this.mClass.get("BpmnRootElement"));

        // Generalization : class BpmnDataState
        this.mClass.get("BpmnDataState").getMSuperType().add(this.mClass.get("BpmnBaseElement"));

        // Generalization : class BpmnResource
        this.mClass.get("BpmnResource").getMSuperType().add(this.mClass.get("BpmnRootElement"));

        // Generalization : class BpmnResourceParameter
        this.mClass.get("BpmnResourceParameter").getMSuperType().add(this.mClass.get("BpmnBaseElement"));

        // Generalization : class BpmnResourceRole
        this.mClass.get("BpmnResourceRole").getMSuperType().add(this.mClass.get("BpmnBaseElement"));

        // Generalization : class BpmnResourceParameterBinding
        this.mClass.get("BpmnResourceParameterBinding").getMSuperType().add(this.mClass.get("BpmnBaseElement"));

        // Generalization : class BpmnProcessCollaborationDiagram
        this.mClass.get("BpmnProcessCollaborationDiagram").getMSuperType().add(this.mClass.get("BehaviorDiagram"));

        // Generalization : class BpmnSubProcessDiagram
        this.mClass.get("BpmnSubProcessDiagram").getMSuperType().add(this.mClass.get("BehaviorDiagram"));

        // Generalization : class BpmnOperation
        this.mClass.get("BpmnOperation").getMSuperType().add(this.mClass.get("BpmnBaseElement"));

        // Generalization : class BpmnInterface
        this.mClass.get("BpmnInterface").getMSuperType().add(this.mClass.get("BpmnRootElement"));

        // Generalization : class BpmnEndPoint
        this.mClass.get("BpmnEndPoint").getMSuperType().add(this.mClass.get("BpmnRootElement"));

        // Generalization : class AbstractDiagram
        this.mClass.get("AbstractDiagram").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("AbstractDiagram").getMSubTypes().add(this.mClass.get("BehaviorDiagram"));
        this.mClass.get("AbstractDiagram").getMSubTypes().add(this.mClass.get("StaticDiagram"));

        // Generalization : class ActivityDiagram
        this.mClass.get("ActivityDiagram").getMSuperType().add(this.mClass.get("BehaviorDiagram"));

        // Generalization : class BehaviorDiagram
        this.mClass.get("BehaviorDiagram").getMSuperType().add(this.mClass.get("AbstractDiagram"));
        this.mClass.get("BehaviorDiagram").getMSubTypes().add(this.mClass.get("BpmnProcessCollaborationDiagram"));
        this.mClass.get("BehaviorDiagram").getMSubTypes().add(this.mClass.get("BpmnSubProcessDiagram"));
        this.mClass.get("BehaviorDiagram").getMSubTypes().add(this.mClass.get("ActivityDiagram"));
        this.mClass.get("BehaviorDiagram").getMSubTypes().add(this.mClass.get("CommunicationDiagram"));
        this.mClass.get("BehaviorDiagram").getMSubTypes().add(this.mClass.get("SequenceDiagram"));
        this.mClass.get("BehaviorDiagram").getMSubTypes().add(this.mClass.get("StateMachineDiagram"));

        // Generalization : class ClassDiagram
        this.mClass.get("ClassDiagram").getMSuperType().add(this.mClass.get("StaticDiagram"));

        // Generalization : class CommunicationDiagram
        this.mClass.get("CommunicationDiagram").getMSuperType().add(this.mClass.get("BehaviorDiagram"));

        // Generalization : class DeploymentDiagram
        this.mClass.get("DeploymentDiagram").getMSuperType().add(this.mClass.get("StaticDiagram"));

        // Generalization : class DiagramSet
        this.mClass.get("DiagramSet").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class SequenceDiagram
        this.mClass.get("SequenceDiagram").getMSuperType().add(this.mClass.get("BehaviorDiagram"));

        // Generalization : class StateMachineDiagram
        this.mClass.get("StateMachineDiagram").getMSuperType().add(this.mClass.get("BehaviorDiagram"));

        // Generalization : class StaticDiagram
        this.mClass.get("StaticDiagram").getMSuperType().add(this.mClass.get("AbstractDiagram"));
        this.mClass.get("StaticDiagram").getMSubTypes().add(this.mClass.get("ClassDiagram"));
        this.mClass.get("StaticDiagram").getMSubTypes().add(this.mClass.get("DeploymentDiagram"));
        this.mClass.get("StaticDiagram").getMSubTypes().add(this.mClass.get("UseCaseDiagram"));
        this.mClass.get("StaticDiagram").getMSubTypes().add(this.mClass.get("ObjectDiagram"));
        this.mClass.get("StaticDiagram").getMSubTypes().add(this.mClass.get("CompositeStructureDiagram"));

        // Generalization : class UseCaseDiagram
        this.mClass.get("UseCaseDiagram").getMSuperType().add(this.mClass.get("StaticDiagram"));

        // Generalization : class ObjectDiagram
        this.mClass.get("ObjectDiagram").getMSuperType().add(this.mClass.get("StaticDiagram"));

        // Generalization : class CompositeStructureDiagram
        this.mClass.get("CompositeStructureDiagram").getMSuperType().add(this.mClass.get("StaticDiagram"));

        // Generalization : class ModuleParameter
        this.mClass.get("ModuleParameter").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class ModuleComponent
        this.mClass.get("ModuleComponent").getMSuperType().add(this.mClass.get("Component"));

        // Generalization : class Project
        this.mClass.get("Project").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Abstraction
        this.mClass.get("Abstraction").getMSuperType().add(this.mClass.get("Dependency"));
        this.mClass.get("Abstraction").getMSubTypes().add(this.mClass.get("ElementRealization"));

        // Generalization : class Constraint
        this.mClass.get("Constraint").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("Constraint").getMSubTypes().add(this.mClass.get("DurationConstraint"));

        // Generalization : class Dependency
        this.mClass.get("Dependency").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("Dependency").getMSubTypes().add(this.mClass.get("Abstraction"));
        this.mClass.get("Dependency").getMSubTypes().add(this.mClass.get("Usage"));

        // Generalization : class Element
        this.mClass.get("Element").getMSubTypes().add(this.mClass.get("PropertyTable"));
        this.mClass.get("Element").getMSubTypes().add(this.mClass.get("QueryDefinition"));
        this.mClass.get("Element").getMSubTypes().add(this.mClass.get("MatrixValueDefinition"));
        this.mClass.get("Element").getMSubTypes().add(this.mClass.get("ModelElement"));
        this.mClass.get("Element").getMSubTypes().add(this.mClass.get("TagParameter"));
        this.mClass.get("Element").getMSubTypes().add(this.mClass.get("MetaclassReference"));
        this.mClass.get("Element").getMSubTypes().add(this.mClass.get("NamespaceUse"));
        this.mClass.get("Element").getMSubTypes().add(this.mClass.get("GeneralOrdering"));

        // Generalization : class ModelElement
        this.mClass.get("ModelElement").getMSuperType().add(this.mClass.get("Element"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("AnalystItem"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("AnalystProject"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("PropertyContainer"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("BpmnBaseElement"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("AbstractDiagram"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("DiagramSet"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("ModuleParameter"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Project"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("PropertyDefinition"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("PropertyEnumerationLitteral"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("PropertyTableDefinition"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("PropertyType"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("MatrixDefinition"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Constraint"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Dependency"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("ModelTree"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Note"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("NoteType"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Stereotype"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Substitution"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("TagType"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("TaggedValue"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("ExternDocument"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("ExternDocumentType"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("ExternProcessor"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Association"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("AttributeLink"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Binding"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("ClassAssociation"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("CollaborationUse"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("ComponentRealization"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("ElementImport"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("EnumerationLiteral"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Feature"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Generalization"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Instance"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("InterfaceRealization"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Link"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("LinkEnd"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Manifestation"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("NaryAssociation"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("NaryLink"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("NaryLinkEnd"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("PackageImport"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("PackageMerge"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Parameter"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("ProvidedInterface"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("RaisedException"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("RequiredInterface"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("TemplateBinding"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("TemplateParameterSubstitution"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("ActivityEdge"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("ActivityGroup"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("ActivityNode"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Clause"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("ExceptionHandler"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Behavior"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Event"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("InteractionFragment"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Lifeline"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Message"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("StateVertex"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Transition"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("Region"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("UseCaseDependency"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("ExtensionPoint"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("CommunicationNode"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("CommunicationMessage"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("CommunicationChannel"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("InformationFlow"));
        this.mClass.get("ModelElement").getMSubTypes().add(this.mClass.get("DataFlow"));

        // Generalization : class ModelTree
        this.mClass.get("ModelTree").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("ModelTree").getMSubTypes().add(this.mClass.get("NameSpace"));

        // Generalization : class Note
        this.mClass.get("Note").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class NoteType
        this.mClass.get("NoteType").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Profile
        this.mClass.get("Profile").getMSuperType().add(this.mClass.get("Package"));

        // Generalization : class Stereotype
        this.mClass.get("Stereotype").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Substitution
        this.mClass.get("Substitution").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class TagParameter
        this.mClass.get("TagParameter").getMSuperType().add(this.mClass.get("Element"));

        // Generalization : class TagType
        this.mClass.get("TagType").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class TaggedValue
        this.mClass.get("TaggedValue").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Usage
        this.mClass.get("Usage").getMSuperType().add(this.mClass.get("Dependency"));

        // Generalization : class MetaclassReference
        this.mClass.get("MetaclassReference").getMSuperType().add(this.mClass.get("Element"));

        // Generalization : class ExternDocument
        this.mClass.get("ExternDocument").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class ExternDocumentType
        this.mClass.get("ExternDocumentType").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class ExternProcessor
        this.mClass.get("ExternProcessor").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class EnumeratedPropertyType
        this.mClass.get("EnumeratedPropertyType").getMSuperType().add(this.mClass.get("PropertyType"));

        // Generalization : class LocalPropertyTable
        this.mClass.get("LocalPropertyTable").getMSuperType().add(this.mClass.get("PropertyTable"));

        // Generalization : class PropertyDefinition
        this.mClass.get("PropertyDefinition").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class PropertyEnumerationLitteral
        this.mClass.get("PropertyEnumerationLitteral").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class PropertyTable
        this.mClass.get("PropertyTable").getMSuperType().add(this.mClass.get("Element"));
        this.mClass.get("PropertyTable").getMSubTypes().add(this.mClass.get("LocalPropertyTable"));
        this.mClass.get("PropertyTable").getMSubTypes().add(this.mClass.get("TypedPropertyTable"));

        // Generalization : class PropertyTableDefinition
        this.mClass.get("PropertyTableDefinition").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class PropertyType
        this.mClass.get("PropertyType").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("PropertyType").getMSubTypes().add(this.mClass.get("EnumeratedPropertyType"));

        // Generalization : class TypedPropertyTable
        this.mClass.get("TypedPropertyTable").getMSuperType().add(this.mClass.get("PropertyTable"));
        this.mClass.get("TypedPropertyTable").getMSubTypes().add(this.mClass.get("AnalystPropertyTable"));

        // Generalization : class MatrixDefinition
        this.mClass.get("MatrixDefinition").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class QueryDefinition
        this.mClass.get("QueryDefinition").getMSuperType().add(this.mClass.get("Element"));

        // Generalization : class MatrixValueDefinition
        this.mClass.get("MatrixValueDefinition").getMSuperType().add(this.mClass.get("Element"));

        // Generalization : class Artifact
        this.mClass.get("Artifact").getMSuperType().add(this.mClass.get("Classifier"));

        // Generalization : class Association
        this.mClass.get("Association").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class AssociationEnd
        this.mClass.get("AssociationEnd").getMSuperType().add(this.mClass.get("StructuralFeature"));

        // Generalization : class Attribute
        this.mClass.get("Attribute").getMSuperType().add(this.mClass.get("StructuralFeature"));

        // Generalization : class AttributeLink
        this.mClass.get("AttributeLink").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class BehavioralFeature
        this.mClass.get("BehavioralFeature").getMSuperType().add(this.mClass.get("Feature"));
        this.mClass.get("BehavioralFeature").getMSubTypes().add(this.mClass.get("Operation"));

        // Generalization : class BindableInstance
        this.mClass.get("BindableInstance").getMSuperType().add(this.mClass.get("Instance"));
        this.mClass.get("BindableInstance").getMSubTypes().add(this.mClass.get("Port"));

        // Generalization : class Binding
        this.mClass.get("Binding").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Class
        this.mClass.get("Class").getMSuperType().add(this.mClass.get("GeneralClass"));
        this.mClass.get("Class").getMSubTypes().add(this.mClass.get("Component"));

        // Generalization : class ClassAssociation
        this.mClass.get("ClassAssociation").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Classifier
        this.mClass.get("Classifier").getMSuperType().add(this.mClass.get("NameSpace"));
        this.mClass.get("Classifier").getMSubTypes().add(this.mClass.get("Artifact"));
        this.mClass.get("Classifier").getMSubTypes().add(this.mClass.get("GeneralClass"));
        this.mClass.get("Classifier").getMSubTypes().add(this.mClass.get("Node"));
        this.mClass.get("Classifier").getMSubTypes().add(this.mClass.get("InformationItem"));

        // Generalization : class Collaboration
        this.mClass.get("Collaboration").getMSuperType().add(this.mClass.get("NameSpace"));

        // Generalization : class CollaborationUse
        this.mClass.get("CollaborationUse").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Component
        this.mClass.get("Component").getMSuperType().add(this.mClass.get("Class"));
        this.mClass.get("Component").getMSubTypes().add(this.mClass.get("ModuleComponent"));

        // Generalization : class ComponentRealization
        this.mClass.get("ComponentRealization").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Connector
        this.mClass.get("Connector").getMSuperType().add(this.mClass.get("Link"));

        // Generalization : class ConnectorEnd
        this.mClass.get("ConnectorEnd").getMSuperType().add(this.mClass.get("LinkEnd"));

        // Generalization : class DataType
        this.mClass.get("DataType").getMSuperType().add(this.mClass.get("GeneralClass"));

        // Generalization : class ElementImport
        this.mClass.get("ElementImport").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class ElementRealization
        this.mClass.get("ElementRealization").getMSuperType().add(this.mClass.get("Abstraction"));

        // Generalization : class Enumeration
        this.mClass.get("Enumeration").getMSuperType().add(this.mClass.get("GeneralClass"));

        // Generalization : class EnumerationLiteral
        this.mClass.get("EnumerationLiteral").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Feature
        this.mClass.get("Feature").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("Feature").getMSubTypes().add(this.mClass.get("BehavioralFeature"));
        this.mClass.get("Feature").getMSubTypes().add(this.mClass.get("StructuralFeature"));

        // Generalization : class GeneralClass
        this.mClass.get("GeneralClass").getMSuperType().add(this.mClass.get("Classifier"));
        this.mClass.get("GeneralClass").getMSubTypes().add(this.mClass.get("Class"));
        this.mClass.get("GeneralClass").getMSubTypes().add(this.mClass.get("DataType"));
        this.mClass.get("GeneralClass").getMSubTypes().add(this.mClass.get("Enumeration"));
        this.mClass.get("GeneralClass").getMSubTypes().add(this.mClass.get("Interface"));
        this.mClass.get("GeneralClass").getMSubTypes().add(this.mClass.get("TemplateParameter"));
        this.mClass.get("GeneralClass").getMSubTypes().add(this.mClass.get("Signal"));
        this.mClass.get("GeneralClass").getMSubTypes().add(this.mClass.get("Actor"));
        this.mClass.get("GeneralClass").getMSubTypes().add(this.mClass.get("UseCase"));

        // Generalization : class Generalization
        this.mClass.get("Generalization").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Instance
        this.mClass.get("Instance").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("Instance").getMSubTypes().add(this.mClass.get("BindableInstance"));

        // Generalization : class Interface
        this.mClass.get("Interface").getMSuperType().add(this.mClass.get("GeneralClass"));

        // Generalization : class InterfaceRealization
        this.mClass.get("InterfaceRealization").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Link
        this.mClass.get("Link").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("Link").getMSubTypes().add(this.mClass.get("Connector"));

        // Generalization : class LinkEnd
        this.mClass.get("LinkEnd").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("LinkEnd").getMSubTypes().add(this.mClass.get("ConnectorEnd"));

        // Generalization : class Manifestation
        this.mClass.get("Manifestation").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class NameSpace
        this.mClass.get("NameSpace").getMSuperType().add(this.mClass.get("ModelTree"));
        this.mClass.get("NameSpace").getMSubTypes().add(this.mClass.get("Classifier"));
        this.mClass.get("NameSpace").getMSubTypes().add(this.mClass.get("Collaboration"));
        this.mClass.get("NameSpace").getMSubTypes().add(this.mClass.get("Package"));

        // Generalization : class NamespaceUse
        this.mClass.get("NamespaceUse").getMSuperType().add(this.mClass.get("Element"));

        // Generalization : class NaryAssociationEnd
        this.mClass.get("NaryAssociationEnd").getMSuperType().add(this.mClass.get("StructuralFeature"));

        // Generalization : class NaryAssociation
        this.mClass.get("NaryAssociation").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class NaryConnector
        this.mClass.get("NaryConnector").getMSuperType().add(this.mClass.get("NaryLink"));

        // Generalization : class NaryConnectorEnd
        this.mClass.get("NaryConnectorEnd").getMSuperType().add(this.mClass.get("NaryLinkEnd"));

        // Generalization : class NaryLink
        this.mClass.get("NaryLink").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("NaryLink").getMSubTypes().add(this.mClass.get("NaryConnector"));

        // Generalization : class NaryLinkEnd
        this.mClass.get("NaryLinkEnd").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("NaryLinkEnd").getMSubTypes().add(this.mClass.get("NaryConnectorEnd"));

        // Generalization : class Node
        this.mClass.get("Node").getMSuperType().add(this.mClass.get("Classifier"));

        // Generalization : class Operation
        this.mClass.get("Operation").getMSuperType().add(this.mClass.get("BehavioralFeature"));

        // Generalization : class Package
        this.mClass.get("Package").getMSuperType().add(this.mClass.get("NameSpace"));
        this.mClass.get("Package").getMSubTypes().add(this.mClass.get("Profile"));

        // Generalization : class PackageImport
        this.mClass.get("PackageImport").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class PackageMerge
        this.mClass.get("PackageMerge").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Parameter
        this.mClass.get("Parameter").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("Parameter").getMSubTypes().add(this.mClass.get("BehaviorParameter"));

        // Generalization : class Port
        this.mClass.get("Port").getMSuperType().add(this.mClass.get("BindableInstance"));

        // Generalization : class ProvidedInterface
        this.mClass.get("ProvidedInterface").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class RaisedException
        this.mClass.get("RaisedException").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class RequiredInterface
        this.mClass.get("RequiredInterface").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class StructuralFeature
        this.mClass.get("StructuralFeature").getMSuperType().add(this.mClass.get("Feature"));
        this.mClass.get("StructuralFeature").getMSubTypes().add(this.mClass.get("AssociationEnd"));
        this.mClass.get("StructuralFeature").getMSubTypes().add(this.mClass.get("Attribute"));
        this.mClass.get("StructuralFeature").getMSubTypes().add(this.mClass.get("NaryAssociationEnd"));

        // Generalization : class TemplateBinding
        this.mClass.get("TemplateBinding").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class TemplateParameter
        this.mClass.get("TemplateParameter").getMSuperType().add(this.mClass.get("GeneralClass"));

        // Generalization : class TemplateParameterSubstitution
        this.mClass.get("TemplateParameterSubstitution").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class AcceptCallEventAction
        this.mClass.get("AcceptCallEventAction").getMSuperType().add(this.mClass.get("ActivityAction"));

        // Generalization : class AcceptChangeEventAction
        this.mClass.get("AcceptChangeEventAction").getMSuperType().add(this.mClass.get("ActivityAction"));

        // Generalization : class AcceptSignalAction
        this.mClass.get("AcceptSignalAction").getMSuperType().add(this.mClass.get("ActivityAction"));

        // Generalization : class AcceptTimeEventAction
        this.mClass.get("AcceptTimeEventAction").getMSuperType().add(this.mClass.get("ActivityAction"));

        // Generalization : class Activity
        this.mClass.get("Activity").getMSuperType().add(this.mClass.get("Behavior"));

        // Generalization : class ActivityAction
        this.mClass.get("ActivityAction").getMSuperType().add(this.mClass.get("ActivityNode"));
        this.mClass.get("ActivityAction").getMSubTypes().add(this.mClass.get("AcceptCallEventAction"));
        this.mClass.get("ActivityAction").getMSubTypes().add(this.mClass.get("AcceptChangeEventAction"));
        this.mClass.get("ActivityAction").getMSubTypes().add(this.mClass.get("AcceptSignalAction"));
        this.mClass.get("ActivityAction").getMSubTypes().add(this.mClass.get("AcceptTimeEventAction"));
        this.mClass.get("ActivityAction").getMSubTypes().add(this.mClass.get("CallAction"));
        this.mClass.get("ActivityAction").getMSubTypes().add(this.mClass.get("OpaqueAction"));
        this.mClass.get("ActivityAction").getMSubTypes().add(this.mClass.get("SendSignalAction"));
        this.mClass.get("ActivityAction").getMSubTypes().add(this.mClass.get("StructuredActivityNode"));

        // Generalization : class ActivityEdge
        this.mClass.get("ActivityEdge").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("ActivityEdge").getMSubTypes().add(this.mClass.get("ControlFlow"));
        this.mClass.get("ActivityEdge").getMSubTypes().add(this.mClass.get("MessageFlow"));
        this.mClass.get("ActivityEdge").getMSubTypes().add(this.mClass.get("ObjectFlow"));

        // Generalization : class ActivityFinalNode
        this.mClass.get("ActivityFinalNode").getMSuperType().add(this.mClass.get("FinalNode"));

        // Generalization : class ActivityGroup
        this.mClass.get("ActivityGroup").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("ActivityGroup").getMSubTypes().add(this.mClass.get("ActivityPartition"));
        this.mClass.get("ActivityGroup").getMSubTypes().add(this.mClass.get("InterruptibleActivityRegion"));

        // Generalization : class ActivityNode
        this.mClass.get("ActivityNode").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("ActivityNode").getMSubTypes().add(this.mClass.get("ActivityAction"));
        this.mClass.get("ActivityNode").getMSubTypes().add(this.mClass.get("ControlNode"));
        this.mClass.get("ActivityNode").getMSubTypes().add(this.mClass.get("ObjectNode"));

        // Generalization : class ActivityParameterNode
        this.mClass.get("ActivityParameterNode").getMSuperType().add(this.mClass.get("ObjectNode"));

        // Generalization : class ActivityPartition
        this.mClass.get("ActivityPartition").getMSuperType().add(this.mClass.get("ActivityGroup"));

        // Generalization : class CallAction
        this.mClass.get("CallAction").getMSuperType().add(this.mClass.get("ActivityAction"));
        this.mClass.get("CallAction").getMSubTypes().add(this.mClass.get("CallBehaviorAction"));
        this.mClass.get("CallAction").getMSubTypes().add(this.mClass.get("CallOperationAction"));

        // Generalization : class CallBehaviorAction
        this.mClass.get("CallBehaviorAction").getMSuperType().add(this.mClass.get("CallAction"));

        // Generalization : class CallOperationAction
        this.mClass.get("CallOperationAction").getMSuperType().add(this.mClass.get("CallAction"));

        // Generalization : class CentralBufferNode
        this.mClass.get("CentralBufferNode").getMSuperType().add(this.mClass.get("ObjectNode"));
        this.mClass.get("CentralBufferNode").getMSubTypes().add(this.mClass.get("DataStoreNode"));

        // Generalization : class Clause
        this.mClass.get("Clause").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class ConditionalNode
        this.mClass.get("ConditionalNode").getMSuperType().add(this.mClass.get("StructuredActivityNode"));

        // Generalization : class ControlFlow
        this.mClass.get("ControlFlow").getMSuperType().add(this.mClass.get("ActivityEdge"));

        // Generalization : class ControlNode
        this.mClass.get("ControlNode").getMSuperType().add(this.mClass.get("ActivityNode"));
        this.mClass.get("ControlNode").getMSubTypes().add(this.mClass.get("DecisionMergeNode"));
        this.mClass.get("ControlNode").getMSubTypes().add(this.mClass.get("FinalNode"));
        this.mClass.get("ControlNode").getMSubTypes().add(this.mClass.get("ForkJoinNode"));
        this.mClass.get("ControlNode").getMSubTypes().add(this.mClass.get("InitialNode"));

        // Generalization : class DataStoreNode
        this.mClass.get("DataStoreNode").getMSuperType().add(this.mClass.get("CentralBufferNode"));

        // Generalization : class DecisionMergeNode
        this.mClass.get("DecisionMergeNode").getMSuperType().add(this.mClass.get("ControlNode"));

        // Generalization : class ExceptionHandler
        this.mClass.get("ExceptionHandler").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class ExpansionNode
        this.mClass.get("ExpansionNode").getMSuperType().add(this.mClass.get("ObjectNode"));

        // Generalization : class ExpansionRegion
        this.mClass.get("ExpansionRegion").getMSuperType().add(this.mClass.get("StructuredActivityNode"));

        // Generalization : class FinalNode
        this.mClass.get("FinalNode").getMSuperType().add(this.mClass.get("ControlNode"));
        this.mClass.get("FinalNode").getMSubTypes().add(this.mClass.get("ActivityFinalNode"));
        this.mClass.get("FinalNode").getMSubTypes().add(this.mClass.get("FlowFinalNode"));

        // Generalization : class FlowFinalNode
        this.mClass.get("FlowFinalNode").getMSuperType().add(this.mClass.get("FinalNode"));

        // Generalization : class ForkJoinNode
        this.mClass.get("ForkJoinNode").getMSuperType().add(this.mClass.get("ControlNode"));

        // Generalization : class InitialNode
        this.mClass.get("InitialNode").getMSuperType().add(this.mClass.get("ControlNode"));

        // Generalization : class InputPin
        this.mClass.get("InputPin").getMSuperType().add(this.mClass.get("Pin"));
        this.mClass.get("InputPin").getMSubTypes().add(this.mClass.get("ValuePin"));

        // Generalization : class InstanceNode
        this.mClass.get("InstanceNode").getMSuperType().add(this.mClass.get("ObjectNode"));

        // Generalization : class InterruptibleActivityRegion
        this.mClass.get("InterruptibleActivityRegion").getMSuperType().add(this.mClass.get("ActivityGroup"));

        // Generalization : class LoopNode
        this.mClass.get("LoopNode").getMSuperType().add(this.mClass.get("StructuredActivityNode"));

        // Generalization : class MessageFlow
        this.mClass.get("MessageFlow").getMSuperType().add(this.mClass.get("ActivityEdge"));

        // Generalization : class ObjectFlow
        this.mClass.get("ObjectFlow").getMSuperType().add(this.mClass.get("ActivityEdge"));

        // Generalization : class ObjectNode
        this.mClass.get("ObjectNode").getMSuperType().add(this.mClass.get("ActivityNode"));
        this.mClass.get("ObjectNode").getMSubTypes().add(this.mClass.get("ActivityParameterNode"));
        this.mClass.get("ObjectNode").getMSubTypes().add(this.mClass.get("CentralBufferNode"));
        this.mClass.get("ObjectNode").getMSubTypes().add(this.mClass.get("ExpansionNode"));
        this.mClass.get("ObjectNode").getMSubTypes().add(this.mClass.get("InstanceNode"));
        this.mClass.get("ObjectNode").getMSubTypes().add(this.mClass.get("Pin"));

        // Generalization : class OpaqueAction
        this.mClass.get("OpaqueAction").getMSuperType().add(this.mClass.get("ActivityAction"));

        // Generalization : class OutputPin
        this.mClass.get("OutputPin").getMSuperType().add(this.mClass.get("Pin"));

        // Generalization : class Pin
        this.mClass.get("Pin").getMSuperType().add(this.mClass.get("ObjectNode"));
        this.mClass.get("Pin").getMSubTypes().add(this.mClass.get("InputPin"));
        this.mClass.get("Pin").getMSubTypes().add(this.mClass.get("OutputPin"));

        // Generalization : class SendSignalAction
        this.mClass.get("SendSignalAction").getMSuperType().add(this.mClass.get("ActivityAction"));

        // Generalization : class StructuredActivityNode
        this.mClass.get("StructuredActivityNode").getMSuperType().add(this.mClass.get("ActivityAction"));
        this.mClass.get("StructuredActivityNode").getMSubTypes().add(this.mClass.get("ConditionalNode"));
        this.mClass.get("StructuredActivityNode").getMSubTypes().add(this.mClass.get("ExpansionRegion"));
        this.mClass.get("StructuredActivityNode").getMSubTypes().add(this.mClass.get("LoopNode"));

        // Generalization : class ValuePin
        this.mClass.get("ValuePin").getMSuperType().add(this.mClass.get("InputPin"));

        // Generalization : class Behavior
        this.mClass.get("Behavior").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("Behavior").getMSubTypes().add(this.mClass.get("BpmnBehavior"));
        this.mClass.get("Behavior").getMSubTypes().add(this.mClass.get("Activity"));
        this.mClass.get("Behavior").getMSubTypes().add(this.mClass.get("OpaqueBehavior"));
        this.mClass.get("Behavior").getMSubTypes().add(this.mClass.get("Interaction"));
        this.mClass.get("Behavior").getMSubTypes().add(this.mClass.get("StateMachine"));
        this.mClass.get("Behavior").getMSubTypes().add(this.mClass.get("CommunicationInteraction"));

        // Generalization : class BehaviorParameter
        this.mClass.get("BehaviorParameter").getMSuperType().add(this.mClass.get("Parameter"));

        // Generalization : class OpaqueBehavior
        this.mClass.get("OpaqueBehavior").getMSuperType().add(this.mClass.get("Behavior"));

        // Generalization : class Signal
        this.mClass.get("Signal").getMSuperType().add(this.mClass.get("GeneralClass"));

        // Generalization : class Event
        this.mClass.get("Event").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class CombinedFragment
        this.mClass.get("CombinedFragment").getMSuperType().add(this.mClass.get("InteractionFragment"));

        // Generalization : class DurationConstraint
        this.mClass.get("DurationConstraint").getMSuperType().add(this.mClass.get("Constraint"));

        // Generalization : class ExecutionOccurenceSpecification
        this.mClass.get("ExecutionOccurenceSpecification").getMSuperType().add(this.mClass.get("MessageEnd"));
        this.mClass.get("ExecutionOccurenceSpecification").getMSubTypes().add(this.mClass.get("TerminateSpecification"));

        // Generalization : class ExecutionSpecification
        this.mClass.get("ExecutionSpecification").getMSuperType().add(this.mClass.get("InteractionFragment"));

        // Generalization : class Gate
        this.mClass.get("Gate").getMSuperType().add(this.mClass.get("MessageEnd"));

        // Generalization : class GeneralOrdering
        this.mClass.get("GeneralOrdering").getMSuperType().add(this.mClass.get("Element"));

        // Generalization : class Interaction
        this.mClass.get("Interaction").getMSuperType().add(this.mClass.get("Behavior"));

        // Generalization : class InteractionFragment
        this.mClass.get("InteractionFragment").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("InteractionFragment").getMSubTypes().add(this.mClass.get("CombinedFragment"));
        this.mClass.get("InteractionFragment").getMSubTypes().add(this.mClass.get("ExecutionSpecification"));
        this.mClass.get("InteractionFragment").getMSubTypes().add(this.mClass.get("InteractionOperand"));
        this.mClass.get("InteractionFragment").getMSubTypes().add(this.mClass.get("InteractionUse"));
        this.mClass.get("InteractionFragment").getMSubTypes().add(this.mClass.get("OccurrenceSpecification"));

        // Generalization : class InteractionOperand
        this.mClass.get("InteractionOperand").getMSuperType().add(this.mClass.get("InteractionFragment"));

        // Generalization : class InteractionUse
        this.mClass.get("InteractionUse").getMSuperType().add(this.mClass.get("InteractionFragment"));
        this.mClass.get("InteractionUse").getMSubTypes().add(this.mClass.get("PartDecomposition"));

        // Generalization : class Lifeline
        this.mClass.get("Lifeline").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Message
        this.mClass.get("Message").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class MessageEnd
        this.mClass.get("MessageEnd").getMSuperType().add(this.mClass.get("OccurrenceSpecification"));
        this.mClass.get("MessageEnd").getMSubTypes().add(this.mClass.get("ExecutionOccurenceSpecification"));
        this.mClass.get("MessageEnd").getMSubTypes().add(this.mClass.get("Gate"));

        // Generalization : class OccurrenceSpecification
        this.mClass.get("OccurrenceSpecification").getMSuperType().add(this.mClass.get("InteractionFragment"));
        this.mClass.get("OccurrenceSpecification").getMSubTypes().add(this.mClass.get("MessageEnd"));
        this.mClass.get("OccurrenceSpecification").getMSubTypes().add(this.mClass.get("StateInvariant"));

        // Generalization : class PartDecomposition
        this.mClass.get("PartDecomposition").getMSuperType().add(this.mClass.get("InteractionUse"));

        // Generalization : class StateInvariant
        this.mClass.get("StateInvariant").getMSuperType().add(this.mClass.get("OccurrenceSpecification"));

        // Generalization : class TerminateSpecification
        this.mClass.get("TerminateSpecification").getMSuperType().add(this.mClass.get("ExecutionOccurenceSpecification"));

        // Generalization : class AbstractPseudoState
        this.mClass.get("AbstractPseudoState").getMSuperType().add(this.mClass.get("StateVertex"));
        this.mClass.get("AbstractPseudoState").getMSubTypes().add(this.mClass.get("ChoicePseudoState"));
        this.mClass.get("AbstractPseudoState").getMSubTypes().add(this.mClass.get("DeepHistoryPseudoState"));
        this.mClass.get("AbstractPseudoState").getMSubTypes().add(this.mClass.get("EntryPointPseudoState"));
        this.mClass.get("AbstractPseudoState").getMSubTypes().add(this.mClass.get("ExitPointPseudoState"));
        this.mClass.get("AbstractPseudoState").getMSubTypes().add(this.mClass.get("ForkPseudoState"));
        this.mClass.get("AbstractPseudoState").getMSubTypes().add(this.mClass.get("InitialPseudoState"));
        this.mClass.get("AbstractPseudoState").getMSubTypes().add(this.mClass.get("JoinPseudoState"));
        this.mClass.get("AbstractPseudoState").getMSubTypes().add(this.mClass.get("JunctionPseudoState"));
        this.mClass.get("AbstractPseudoState").getMSubTypes().add(this.mClass.get("ShallowHistoryPseudoState"));
        this.mClass.get("AbstractPseudoState").getMSubTypes().add(this.mClass.get("TerminatePseudoState"));

        // Generalization : class ChoicePseudoState
        this.mClass.get("ChoicePseudoState").getMSuperType().add(this.mClass.get("AbstractPseudoState"));

        // Generalization : class ConnectionPointReference
        this.mClass.get("ConnectionPointReference").getMSuperType().add(this.mClass.get("StateVertex"));

        // Generalization : class DeepHistoryPseudoState
        this.mClass.get("DeepHistoryPseudoState").getMSuperType().add(this.mClass.get("AbstractPseudoState"));

        // Generalization : class EntryPointPseudoState
        this.mClass.get("EntryPointPseudoState").getMSuperType().add(this.mClass.get("AbstractPseudoState"));

        // Generalization : class ExitPointPseudoState
        this.mClass.get("ExitPointPseudoState").getMSuperType().add(this.mClass.get("AbstractPseudoState"));

        // Generalization : class ForkPseudoState
        this.mClass.get("ForkPseudoState").getMSuperType().add(this.mClass.get("AbstractPseudoState"));

        // Generalization : class InitialPseudoState
        this.mClass.get("InitialPseudoState").getMSuperType().add(this.mClass.get("AbstractPseudoState"));

        // Generalization : class InternalTransition
        this.mClass.get("InternalTransition").getMSuperType().add(this.mClass.get("Transition"));

        // Generalization : class JoinPseudoState
        this.mClass.get("JoinPseudoState").getMSuperType().add(this.mClass.get("AbstractPseudoState"));

        // Generalization : class JunctionPseudoState
        this.mClass.get("JunctionPseudoState").getMSuperType().add(this.mClass.get("AbstractPseudoState"));

        // Generalization : class ShallowHistoryPseudoState
        this.mClass.get("ShallowHistoryPseudoState").getMSuperType().add(this.mClass.get("AbstractPseudoState"));

        // Generalization : class State
        this.mClass.get("State").getMSuperType().add(this.mClass.get("StateVertex"));
        this.mClass.get("State").getMSubTypes().add(this.mClass.get("FinalState"));

        // Generalization : class StateMachine
        this.mClass.get("StateMachine").getMSuperType().add(this.mClass.get("Behavior"));

        // Generalization : class StateVertex
        this.mClass.get("StateVertex").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("StateVertex").getMSubTypes().add(this.mClass.get("AbstractPseudoState"));
        this.mClass.get("StateVertex").getMSubTypes().add(this.mClass.get("ConnectionPointReference"));
        this.mClass.get("StateVertex").getMSubTypes().add(this.mClass.get("State"));

        // Generalization : class TerminatePseudoState
        this.mClass.get("TerminatePseudoState").getMSuperType().add(this.mClass.get("AbstractPseudoState"));

        // Generalization : class Transition
        this.mClass.get("Transition").getMSuperType().add(this.mClass.get("ModelElement"));
        this.mClass.get("Transition").getMSubTypes().add(this.mClass.get("InternalTransition"));

        // Generalization : class FinalState
        this.mClass.get("FinalState").getMSuperType().add(this.mClass.get("State"));

        // Generalization : class Region
        this.mClass.get("Region").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class Actor
        this.mClass.get("Actor").getMSuperType().add(this.mClass.get("GeneralClass"));

        // Generalization : class UseCase
        this.mClass.get("UseCase").getMSuperType().add(this.mClass.get("GeneralClass"));

        // Generalization : class UseCaseDependency
        this.mClass.get("UseCaseDependency").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class ExtensionPoint
        this.mClass.get("ExtensionPoint").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class CommunicationInteraction
        this.mClass.get("CommunicationInteraction").getMSuperType().add(this.mClass.get("Behavior"));

        // Generalization : class CommunicationNode
        this.mClass.get("CommunicationNode").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class CommunicationMessage
        this.mClass.get("CommunicationMessage").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class CommunicationChannel
        this.mClass.get("CommunicationChannel").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class InformationFlow
        this.mClass.get("InformationFlow").getMSuperType().add(this.mClass.get("ModelElement"));

        // Generalization : class InformationItem
        this.mClass.get("InformationItem").getMSuperType().add(this.mClass.get("Classifier"));

        // Generalization : class DataFlow
        this.mClass.get("DataFlow").getMSuperType().add(this.mClass.get("ModelElement"));
    }

    private void initDependencys() {



         // ########### Dependencies ###########


        // dependency AnalystItem.AnalystProperties
        MDependency id_c97abeb3db554d4388b9ae46d0b6cd00 = new MDependency("c97abeb3-db55-4d43-88b9-ae46d0b6cd00","AnalystProperties","47b29e94-ef89-4e19-b7a9-79c93ef077b9.exml",this.mClass.get("AnalystPropertyTable"),true,false,false,true);
        this.mClass.get("AnalystItem").getMDependencys().add(id_c97abeb3db554d4388b9ae46d0b6cd00);

        // dependency AnalystProject.PropertyRoot
        MDependency id_e5d49ec3a8ef11deade4001ec947ccaf = new MDependency("e5d49ec3-a8ef-11de-ade4-001ec947ccaf","PropertyRoot","00080b08-0000-1a25-0000-000000000000.exml",this.mClass.get("PropertyContainer"),true,false,false,true);
        this.mClass.get("AnalystProject").getMDependencys().add(id_e5d49ec3a8ef11deade4001ec947ccaf);

        // dependency AnalystProject.GoalRoot
        MDependency id_343cd2c8a8f011deade4001ec947ccaf = new MDependency("343cd2c8-a8f0-11de-ade4-001ec947ccaf","GoalRoot","00080b08-0000-1a25-0000-000000000000.exml",this.mClass.get("GoalContainer"),false,false,false,true);
        this.mClass.get("AnalystProject").getMDependencys().add(id_343cd2c8a8f011deade4001ec947ccaf);

        // dependency AnalystProject.BusinessRuleRoot
        MDependency id_34fdf0a0a8f011deade4001ec947ccaf = new MDependency("34fdf0a0-a8f0-11de-ade4-001ec947ccaf","BusinessRuleRoot","00080b08-0000-1a25-0000-000000000000.exml",this.mClass.get("BusinessRuleContainer"),false,false,false,true);
        this.mClass.get("AnalystProject").getMDependencys().add(id_34fdf0a0a8f011deade4001ec947ccaf);

        // dependency AnalystProject.DictionaryRoot
        MDependency id_00080b0800001ccd0000000000000000 = new MDependency("00080b08-0000-1ccd-0000-000000000000","DictionaryRoot","00080b08-0000-1a25-0000-000000000000.exml",this.mClass.get("Dictionary"),false,false,false,true);
        this.mClass.get("AnalystProject").getMDependencys().add(id_00080b0800001ccd0000000000000000);

        // dependency AnalystProject.RequirementRoot
        MDependency id_00080b0800001a270000000000000000 = new MDependency("00080b08-0000-1a27-0000-000000000000","RequirementRoot","00080b08-0000-1a25-0000-000000000000.exml",this.mClass.get("RequirementContainer"),false,false,false,true);
        this.mClass.get("AnalystProject").getMDependencys().add(id_00080b0800001a270000000000000000);

        // dependency AnalystProject.GenericRoot
        MDependency id_90e16370831a42318d01a52776ad1df5 = new MDependency("90e16370-831a-4231-8d01-a52776ad1df5","GenericRoot","00080b08-0000-1a25-0000-000000000000.exml",this.mClass.get("GenericAnalystContainer"),false,false,false,true);
        this.mClass.get("AnalystProject").getMDependencys().add(id_90e16370831a42318d01a52776ad1df5);

        // dependency AnalystProject.RiskRoot
        MDependency id_0d078e91d666429db083e6b9ae2d29d3 = new MDependency("0d078e91-d666-429d-b083-e6b9ae2d29d3","RiskRoot","00080b08-0000-1a25-0000-000000000000.exml",this.mClass.get("RiskContainer"),false,false,false,true);
        this.mClass.get("AnalystProject").getMDependencys().add(id_0d078e91d666429db083e6b9ae2d29d3);

        // dependency AnalystPropertyTable.AnalystOwner
        MDependency id_b63c16d7c8e645558c85215794de188e = new MDependency("b63c16d7-c8e6-4555-8c85-215794de188e","AnalystOwner","00080b08-0000-1871-0000-000000000000.exml",this.mClass.get("AnalystItem"),true,false,false,false);
        this.mClass.get("AnalystPropertyTable").getMDependencys().add(id_b63c16d7c8e645558c85215794de188e);

        // dependency BusinessRule.SubRule
        MDependency id_c731dd3f11cd46ce88b207e66ff5ebc2 = new MDependency("c731dd3f-11cd-46ce-88b2-07e66ff5ebc2","SubRule","4fe22bcc-34a6-4dc5-9531-114b59468684.exml",this.mClass.get("BusinessRule"),false,false,false,true);
        this.mClass.get("BusinessRule").getMDependencys().add(id_c731dd3f11cd46ce88b207e66ff5ebc2);

        // dependency BusinessRule.OwnerContainer
        MDependency id_efaa844e0ac94597b00e1b97049b7e9a = new MDependency("efaa844e-0ac9-4597-b00e-1b97049b7e9a","OwnerContainer","4fe22bcc-34a6-4dc5-9531-114b59468684.exml",this.mClass.get("BusinessRuleContainer"),true,false,false,false);
        this.mClass.get("BusinessRule").getMDependencys().add(id_efaa844e0ac94597b00e1b97049b7e9a);

        // dependency BusinessRule.ParentRule
        MDependency id_8f28965293fc4426901219a64546a693 = new MDependency("8f289652-93fc-4426-9012-19a64546a693","ParentRule","4fe22bcc-34a6-4dc5-9531-114b59468684.exml",this.mClass.get("BusinessRule"),true,false,false,false);
        this.mClass.get("BusinessRule").getMDependencys().add(id_8f28965293fc4426901219a64546a693);

        // dependency BusinessRule.LastRuleVersion
        MDependency id_002a97c45a8143a981bd84938220e492 = new MDependency("002a97c4-5a81-43a9-81bd-84938220e492","LastRuleVersion","4fe22bcc-34a6-4dc5-9531-114b59468684.exml",this.mClass.get("BusinessRule"),true,false,false,false);
        this.mClass.get("BusinessRule").getMDependencys().add(id_002a97c45a8143a981bd84938220e492);

        // dependency BusinessRule.ArchivedRuleVersion
        MDependency id_6e3b5cf96cc04a9b857af070c205034a = new MDependency("6e3b5cf9-6cc0-4a9b-857a-f070c205034a","ArchivedRuleVersion","4fe22bcc-34a6-4dc5-9531-114b59468684.exml",this.mClass.get("BusinessRule"),false,false,false,true);
        this.mClass.get("BusinessRule").getMDependencys().add(id_6e3b5cf96cc04a9b857af070c205034a);

        // dependency BusinessRuleContainer.OwnedRule
        MDependency id_0793f4154300425c9c77faa662100164 = new MDependency("0793f415-4300-425c-9c77-faa662100164","OwnedRule","57c3170a-72a7-4a95-9eaf-8e68716f7961.exml",this.mClass.get("BusinessRule"),false,false,false,true);
        this.mClass.get("BusinessRuleContainer").getMDependencys().add(id_0793f4154300425c9c77faa662100164);

        // dependency BusinessRuleContainer.OwnerContainer
        MDependency id_76a23d494c6d40559d946f7973be7214 = new MDependency("76a23d49-4c6d-4055-9d94-6f7973be7214","OwnerContainer","57c3170a-72a7-4a95-9eaf-8e68716f7961.exml",this.mClass.get("BusinessRuleContainer"),true,false,false,false);
        this.mClass.get("BusinessRuleContainer").getMDependencys().add(id_76a23d494c6d40559d946f7973be7214);

        // dependency BusinessRuleContainer.OwnedContainer
        MDependency id_1211dffd81884531b9921e9fdc47d2a6 = new MDependency("1211dffd-8188-4531-b992-1e9fdc47d2a6","OwnedContainer","57c3170a-72a7-4a95-9eaf-8e68716f7961.exml",this.mClass.get("BusinessRuleContainer"),false,false,false,true);
        this.mClass.get("BusinessRuleContainer").getMDependencys().add(id_1211dffd81884531b9921e9fdc47d2a6);

        // dependency BusinessRuleContainer.OwnerProject
        MDependency id_34fdf09fa8f011deade4001ec947ccaf = new MDependency("34fdf09f-a8f0-11de-ade4-001ec947ccaf","OwnerProject","57c3170a-72a7-4a95-9eaf-8e68716f7961.exml",this.mClass.get("AnalystProject"),true,false,false,false);
        this.mClass.get("BusinessRuleContainer").getMDependencys().add(id_34fdf09fa8f011deade4001ec947ccaf);

        // dependency Dictionary.OwnedDictionary
        MDependency id_00080b08000020750000000000000000 = new MDependency("00080b08-0000-2075-0000-000000000000","OwnedDictionary","00080b08-0000-1cb5-0000-000000000000.exml",this.mClass.get("Dictionary"),false,false,false,true);
        this.mClass.get("Dictionary").getMDependencys().add(id_00080b08000020750000000000000000);

        // dependency Dictionary.OwnerDictionary
        MDependency id_00080b080000207b0000000000000000 = new MDependency("00080b08-0000-207b-0000-000000000000","OwnerDictionary","00080b08-0000-1cb5-0000-000000000000.exml",this.mClass.get("Dictionary"),true,false,false,false);
        this.mClass.get("Dictionary").getMDependencys().add(id_00080b080000207b0000000000000000);

        // dependency Dictionary.OwnerProject
        MDependency id_00080b0800001cce0000000000000000 = new MDependency("00080b08-0000-1cce-0000-000000000000","OwnerProject","00080b08-0000-1cb5-0000-000000000000.exml",this.mClass.get("AnalystProject"),true,false,false,false);
        this.mClass.get("Dictionary").getMDependencys().add(id_00080b0800001cce0000000000000000);

        // dependency Dictionary.OwnedTerm
        MDependency id_57bee00b6d7a488dbaa7fd0743ff3b11 = new MDependency("57bee00b-6d7a-488d-baa7-fd0743ff3b11","OwnedTerm","00080b08-0000-1cb5-0000-000000000000.exml",this.mClass.get("Term"),false,false,false,true);
        this.mClass.get("Dictionary").getMDependencys().add(id_57bee00b6d7a488dbaa7fd0743ff3b11);

        // dependency Goal.SubGoal
        MDependency id_5d6bab4b9ea34730bf57ba3e0796cc66 = new MDependency("5d6bab4b-9ea3-4730-bf57-ba3e0796cc66","SubGoal","103091ba-9319-4bec-bb75-15a6498e406c.exml",this.mClass.get("Goal"),false,false,false,true);
        this.mClass.get("Goal").getMDependencys().add(id_5d6bab4b9ea34730bf57ba3e0796cc66);

        // dependency Goal.OwnerContainer
        MDependency id_0cac736744f64da1a130108280fff93f = new MDependency("0cac7367-44f6-4da1-a130-108280fff93f","OwnerContainer","103091ba-9319-4bec-bb75-15a6498e406c.exml",this.mClass.get("GoalContainer"),true,false,false,false);
        this.mClass.get("Goal").getMDependencys().add(id_0cac736744f64da1a130108280fff93f);

        // dependency Goal.ParentGoal
        MDependency id_916063a0e238461783756d5b828f84cd = new MDependency("916063a0-e238-4617-8375-6d5b828f84cd","ParentGoal","103091ba-9319-4bec-bb75-15a6498e406c.exml",this.mClass.get("Goal"),true,false,false,false);
        this.mClass.get("Goal").getMDependencys().add(id_916063a0e238461783756d5b828f84cd);

        // dependency Goal.LastGoalVersion
        MDependency id_64923aa6da0c497caa6841e6a1061f6d = new MDependency("64923aa6-da0c-497c-aa68-41e6a1061f6d","LastGoalVersion","103091ba-9319-4bec-bb75-15a6498e406c.exml",this.mClass.get("Goal"),true,false,false,false);
        this.mClass.get("Goal").getMDependencys().add(id_64923aa6da0c497caa6841e6a1061f6d);

        // dependency Goal.ArchivedGoalVersion
        MDependency id_0b6e528a427e44d7a019a6fc367cb82a = new MDependency("0b6e528a-427e-44d7-a019-a6fc367cb82a","ArchivedGoalVersion","103091ba-9319-4bec-bb75-15a6498e406c.exml",this.mClass.get("Goal"),false,false,false,true);
        this.mClass.get("Goal").getMDependencys().add(id_0b6e528a427e44d7a019a6fc367cb82a);

        // dependency GoalContainer.OwnedGoal
        MDependency id_17dbd5a381f841f28314d07b87de44eb = new MDependency("17dbd5a3-81f8-41f2-8314-d07b87de44eb","OwnedGoal","78858b2b-ea47-4da9-acef-a155df06e288.exml",this.mClass.get("Goal"),false,false,false,true);
        this.mClass.get("GoalContainer").getMDependencys().add(id_17dbd5a381f841f28314d07b87de44eb);

        // dependency GoalContainer.OwnerContainer
        MDependency id_2cbce7bf7f76443284b7aa1a29ff9974 = new MDependency("2cbce7bf-7f76-4432-84b7-aa1a29ff9974","OwnerContainer","78858b2b-ea47-4da9-acef-a155df06e288.exml",this.mClass.get("GoalContainer"),true,false,false,false);
        this.mClass.get("GoalContainer").getMDependencys().add(id_2cbce7bf7f76443284b7aa1a29ff9974);

        // dependency GoalContainer.OwnedContainer
        MDependency id_558aaa30ebc84f39be15111b49538c28 = new MDependency("558aaa30-ebc8-4f39-be15-111b49538c28","OwnedContainer","78858b2b-ea47-4da9-acef-a155df06e288.exml",this.mClass.get("GoalContainer"),false,false,false,true);
        this.mClass.get("GoalContainer").getMDependencys().add(id_558aaa30ebc84f39be15111b49538c28);

        // dependency GoalContainer.OwnerProject
        MDependency id_343cd2c7a8f011deade4001ec947ccaf = new MDependency("343cd2c7-a8f0-11de-ade4-001ec947ccaf","OwnerProject","78858b2b-ea47-4da9-acef-a155df06e288.exml",this.mClass.get("AnalystProject"),true,false,false,false);
        this.mClass.get("GoalContainer").getMDependencys().add(id_343cd2c7a8f011deade4001ec947ccaf);

        // dependency PropertyContainer.DefinedTable
        MDependency id_e5d49ec1a8ef11deade4001ec947ccaf = new MDependency("e5d49ec1-a8ef-11de-ade4-001ec947ccaf","DefinedTable","e5d49ec0-a8ef-11de-ade4-001ec947ccaf.exml",this.mClass.get("PropertyTableDefinition"),false,false,false,true);
        this.mClass.get("PropertyContainer").getMDependencys().add(id_e5d49ec1a8ef11deade4001ec947ccaf);

        // dependency PropertyContainer.OwnerProject
        MDependency id_e5d49ecca8ef11deade4001ec947ccaf = new MDependency("e5d49ecc-a8ef-11de-ade4-001ec947ccaf","OwnerProject","e5d49ec0-a8ef-11de-ade4-001ec947ccaf.exml",this.mClass.get("AnalystProject"),true,false,false,false);
        this.mClass.get("PropertyContainer").getMDependencys().add(id_e5d49ecca8ef11deade4001ec947ccaf);

        // dependency PropertyContainer.DefinedType
        MDependency id_e5d49ebfa8ef11deade4001ec947ccaf = new MDependency("e5d49ebf-a8ef-11de-ade4-001ec947ccaf","DefinedType","e5d49ec0-a8ef-11de-ade4-001ec947ccaf.exml",this.mClass.get("PropertyType"),false,false,false,true);
        this.mClass.get("PropertyContainer").getMDependencys().add(id_e5d49ebfa8ef11deade4001ec947ccaf);

        // dependency Requirement.SubRequirement
        MDependency id_6bf4e6e889d643d29eb84d2d3b01162f = new MDependency("6bf4e6e8-89d6-43d2-9eb8-4d2d3b01162f","SubRequirement","8269206e-2e22-430b-beba-f1d662083a42.exml",this.mClass.get("Requirement"),false,false,false,true);
        this.mClass.get("Requirement").getMDependencys().add(id_6bf4e6e889d643d29eb84d2d3b01162f);

        // dependency Requirement.OwnerContainer
        MDependency id_fbbb3e2ccc004ed3a6e5d1ec5c266ed7 = new MDependency("fbbb3e2c-cc00-4ed3-a6e5-d1ec5c266ed7","OwnerContainer","8269206e-2e22-430b-beba-f1d662083a42.exml",this.mClass.get("RequirementContainer"),true,false,false,false);
        this.mClass.get("Requirement").getMDependencys().add(id_fbbb3e2ccc004ed3a6e5d1ec5c266ed7);

        // dependency Requirement.ParentRequirement
        MDependency id_57d8057e448c4794ade5d22a80c9ced7 = new MDependency("57d8057e-448c-4794-ade5-d22a80c9ced7","ParentRequirement","8269206e-2e22-430b-beba-f1d662083a42.exml",this.mClass.get("Requirement"),true,false,false,false);
        this.mClass.get("Requirement").getMDependencys().add(id_57d8057e448c4794ade5d22a80c9ced7);

        // dependency Requirement.ArchivedRequirementVersion
        MDependency id_cc13e14d58b54ccbab3e40de3e748424 = new MDependency("cc13e14d-58b5-4ccb-ab3e-40de3e748424","ArchivedRequirementVersion","8269206e-2e22-430b-beba-f1d662083a42.exml",this.mClass.get("Requirement"),false,false,false,true);
        this.mClass.get("Requirement").getMDependencys().add(id_cc13e14d58b54ccbab3e40de3e748424);

        // dependency Requirement.LastRequirementVersion
        MDependency id_de7ff439ee3e4d31b25a21d86ec9cf1a = new MDependency("de7ff439-ee3e-4d31-b25a-21d86ec9cf1a","LastRequirementVersion","8269206e-2e22-430b-beba-f1d662083a42.exml",this.mClass.get("Requirement"),true,false,false,false);
        this.mClass.get("Requirement").getMDependencys().add(id_de7ff439ee3e4d31b25a21d86ec9cf1a);

        // dependency RequirementContainer.OwnedRequirement
        MDependency id_fcb279f73f7c4310b3308d5ca1f95408 = new MDependency("fcb279f7-3f7c-4310-b330-8d5ca1f95408","OwnedRequirement","8a1c8003-6a27-413f-9904-961ec118f445.exml",this.mClass.get("Requirement"),false,false,false,true);
        this.mClass.get("RequirementContainer").getMDependencys().add(id_fcb279f73f7c4310b3308d5ca1f95408);

        // dependency RequirementContainer.OwnerContainer
        MDependency id_e8b2ff9a03084fc19675ed407a204165 = new MDependency("e8b2ff9a-0308-4fc1-9675-ed407a204165","OwnerContainer","8a1c8003-6a27-413f-9904-961ec118f445.exml",this.mClass.get("RequirementContainer"),true,false,false,false);
        this.mClass.get("RequirementContainer").getMDependencys().add(id_e8b2ff9a03084fc19675ed407a204165);

        // dependency RequirementContainer.OwnedContainer
        MDependency id_dadcc19790f747dfb25bdad8728d810b = new MDependency("dadcc197-90f7-47df-b25b-dad8728d810b","OwnedContainer","8a1c8003-6a27-413f-9904-961ec118f445.exml",this.mClass.get("RequirementContainer"),false,false,false,true);
        this.mClass.get("RequirementContainer").getMDependencys().add(id_dadcc19790f747dfb25bdad8728d810b);

        // dependency RequirementContainer.OwnerProject
        MDependency id_00080b0800001a2c0000000000000000 = new MDependency("00080b08-0000-1a2c-0000-000000000000","OwnerProject","8a1c8003-6a27-413f-9904-961ec118f445.exml",this.mClass.get("AnalystProject"),true,false,false,false);
        this.mClass.get("RequirementContainer").getMDependencys().add(id_00080b0800001a2c0000000000000000);

        // dependency Term.OwnerDictionary
        MDependency id_288a4964e12e48c68e1b5bbc0c7f1c4d = new MDependency("288a4964-e12e-48c6-8e1b-5bbc0c7f1c4d","OwnerDictionary","00080b08-0000-1cb6-0000-000000000000.exml",this.mClass.get("Dictionary"),true,false,false,false);
        this.mClass.get("Term").getMDependencys().add(id_288a4964e12e48c68e1b5bbc0c7f1c4d);

        // dependency Term.ArchivedTermVersion
        MDependency id_bf149a36f8af43d981a93fcdc9334a4c = new MDependency("bf149a36-f8af-43d9-81a9-3fcdc9334a4c","ArchivedTermVersion","00080b08-0000-1cb6-0000-000000000000.exml",this.mClass.get("Term"),false,false,false,true);
        this.mClass.get("Term").getMDependencys().add(id_bf149a36f8af43d981a93fcdc9334a4c);

        // dependency Term.LastTermVersion
        MDependency id_fb5eb123934444878b5dd0ebc24bb172 = new MDependency("fb5eb123-9344-4487-8b5d-d0ebc24bb172","LastTermVersion","00080b08-0000-1cb6-0000-000000000000.exml",this.mClass.get("Term"),true,false,false,false);
        this.mClass.get("Term").getMDependencys().add(id_fb5eb123934444878b5dd0ebc24bb172);

        // dependency GenericAnalystContainer.OwnedElement
        MDependency id_aab2b19cbff349d099dc1b8634dc8a14 = new MDependency("aab2b19c-bff3-49d0-99dc-1b8634dc8a14","OwnedElement","f2b578c3-7b79-410a-835d-441abf35d4c4.exml",this.mClass.get("GenericAnalystElement"),false,false,false,true);
        this.mClass.get("GenericAnalystContainer").getMDependencys().add(id_aab2b19cbff349d099dc1b8634dc8a14);

        // dependency GenericAnalystContainer.OwnerContainer
        MDependency id_733fb7725f4548e4ae8dc1b7761f744d = new MDependency("733fb772-5f45-48e4-ae8d-c1b7761f744d","OwnerContainer","f2b578c3-7b79-410a-835d-441abf35d4c4.exml",this.mClass.get("GenericAnalystContainer"),true,false,false,false);
        this.mClass.get("GenericAnalystContainer").getMDependencys().add(id_733fb7725f4548e4ae8dc1b7761f744d);

        // dependency GenericAnalystContainer.OwnedContainer
        MDependency id_bda81dbf8fec4e56b792d217592900c2 = new MDependency("bda81dbf-8fec-4e56-b792-d217592900c2","OwnedContainer","f2b578c3-7b79-410a-835d-441abf35d4c4.exml",this.mClass.get("GenericAnalystContainer"),false,false,false,true);
        this.mClass.get("GenericAnalystContainer").getMDependencys().add(id_bda81dbf8fec4e56b792d217592900c2);

        // dependency GenericAnalystContainer.OwnerProject
        MDependency id_3db7cda3078f42f6ad969fa0e53c7253 = new MDependency("3db7cda3-078f-42f6-ad96-9fa0e53c7253","OwnerProject","f2b578c3-7b79-410a-835d-441abf35d4c4.exml",this.mClass.get("AnalystProject"),true,false,false,false);
        this.mClass.get("GenericAnalystContainer").getMDependencys().add(id_3db7cda3078f42f6ad969fa0e53c7253);

        // dependency GenericAnalystElement.SubElement
        MDependency id_5fb5b0579fd947dfb1f02128fd33f147 = new MDependency("5fb5b057-9fd9-47df-b1f0-2128fd33f147","SubElement","779a1593-6a1f-448e-a793-bf669f699add.exml",this.mClass.get("GenericAnalystElement"),false,false,false,true);
        this.mClass.get("GenericAnalystElement").getMDependencys().add(id_5fb5b0579fd947dfb1f02128fd33f147);

        // dependency GenericAnalystElement.OwnerContainer
        MDependency id_d664940624dc41ac8ebbae556e619f9a = new MDependency("d6649406-24dc-41ac-8ebb-ae556e619f9a","OwnerContainer","779a1593-6a1f-448e-a793-bf669f699add.exml",this.mClass.get("GenericAnalystContainer"),true,false,false,false);
        this.mClass.get("GenericAnalystElement").getMDependencys().add(id_d664940624dc41ac8ebbae556e619f9a);

        // dependency GenericAnalystElement.ParentElement
        MDependency id_315cc3fc25e945559cd370fc7b9d4cbc = new MDependency("315cc3fc-25e9-4555-9cd3-70fc7b9d4cbc","ParentElement","779a1593-6a1f-448e-a793-bf669f699add.exml",this.mClass.get("GenericAnalystElement"),true,false,false,false);
        this.mClass.get("GenericAnalystElement").getMDependencys().add(id_315cc3fc25e945559cd370fc7b9d4cbc);

        // dependency GenericAnalystElement.LastElementVersion
        MDependency id_2ce7d328869b45688a15cbce829cfd7b = new MDependency("2ce7d328-869b-4568-8a15-cbce829cfd7b","LastElementVersion","779a1593-6a1f-448e-a793-bf669f699add.exml",this.mClass.get("GenericAnalystElement"),true,false,false,false);
        this.mClass.get("GenericAnalystElement").getMDependencys().add(id_2ce7d328869b45688a15cbce829cfd7b);

        // dependency GenericAnalystElement.ArchivedElementVersion
        MDependency id_4b9b5c032b3345b8885308564b797ae3 = new MDependency("4b9b5c03-2b33-45b8-8853-08564b797ae3","ArchivedElementVersion","779a1593-6a1f-448e-a793-bf669f699add.exml",this.mClass.get("GenericAnalystElement"),false,false,false,true);
        this.mClass.get("GenericAnalystElement").getMDependencys().add(id_4b9b5c032b3345b8885308564b797ae3);

        // dependency RiskContainer.OwnedRisk
        MDependency id_eaf504c651e042e4af4c89480ef0dc97 = new MDependency("eaf504c6-51e0-42e4-af4c-89480ef0dc97","OwnedRisk","d613667b-471c-4317-beff-9379c7e04920.exml",this.mClass.get("Risk"),false,false,false,true);
        this.mClass.get("RiskContainer").getMDependencys().add(id_eaf504c651e042e4af4c89480ef0dc97);

        // dependency RiskContainer.OwnerContainer
        MDependency id_155a95c7abeb49ab9bb2255c747ff7ba = new MDependency("155a95c7-abeb-49ab-9bb2-255c747ff7ba","OwnerContainer","d613667b-471c-4317-beff-9379c7e04920.exml",this.mClass.get("RiskContainer"),true,false,false,false);
        this.mClass.get("RiskContainer").getMDependencys().add(id_155a95c7abeb49ab9bb2255c747ff7ba);

        // dependency RiskContainer.OwnedContainer
        MDependency id_ac1015cc476549d1abc56cc9528a0dd8 = new MDependency("ac1015cc-4765-49d1-abc5-6cc9528a0dd8","OwnedContainer","d613667b-471c-4317-beff-9379c7e04920.exml",this.mClass.get("RiskContainer"),false,false,false,true);
        this.mClass.get("RiskContainer").getMDependencys().add(id_ac1015cc476549d1abc56cc9528a0dd8);

        // dependency RiskContainer.OwnerProject
        MDependency id_906a5472b0564f5d91f3c7adc1c1f6f8 = new MDependency("906a5472-b056-4f5d-91f3-c7adc1c1f6f8","OwnerProject","d613667b-471c-4317-beff-9379c7e04920.exml",this.mClass.get("AnalystProject"),true,false,false,false);
        this.mClass.get("RiskContainer").getMDependencys().add(id_906a5472b0564f5d91f3c7adc1c1f6f8);

        // dependency Risk.SubRisk
        MDependency id_3a5d6a9ef88e4a52ad1f404e397b3311 = new MDependency("3a5d6a9e-f88e-4a52-ad1f-404e397b3311","SubRisk","f26541d4-f1f7-4e2c-af0e-b53375680953.exml",this.mClass.get("Risk"),false,false,false,true);
        this.mClass.get("Risk").getMDependencys().add(id_3a5d6a9ef88e4a52ad1f404e397b3311);

        // dependency Risk.OwnerContainer
        MDependency id_f07ead9a67844ad192000cafbf878e2f = new MDependency("f07ead9a-6784-4ad1-9200-0cafbf878e2f","OwnerContainer","f26541d4-f1f7-4e2c-af0e-b53375680953.exml",this.mClass.get("RiskContainer"),true,false,false,false);
        this.mClass.get("Risk").getMDependencys().add(id_f07ead9a67844ad192000cafbf878e2f);

        // dependency Risk.ParentRisk
        MDependency id_5def8463f0164583b391de9dc8018deb = new MDependency("5def8463-f016-4583-b391-de9dc8018deb","ParentRisk","f26541d4-f1f7-4e2c-af0e-b53375680953.exml",this.mClass.get("Risk"),true,false,false,false);
        this.mClass.get("Risk").getMDependencys().add(id_5def8463f0164583b391de9dc8018deb);

        // dependency Risk.ArchivedRiskVersion
        MDependency id_cbc0141990ca43d482cacffb216ce28d = new MDependency("cbc01419-90ca-43d4-82ca-cffb216ce28d","ArchivedRiskVersion","f26541d4-f1f7-4e2c-af0e-b53375680953.exml",this.mClass.get("Risk"),false,false,false,true);
        this.mClass.get("Risk").getMDependencys().add(id_cbc0141990ca43d482cacffb216ce28d);

        // dependency Risk.LastRiskVersion
        MDependency id_229626a96def41d4a216335ed641677c = new MDependency("229626a9-6def-41d4-a216-335ed641677c","LastRiskVersion","f26541d4-f1f7-4e2c-af0e-b53375680953.exml",this.mClass.get("Risk"),true,false,false,false);
        this.mClass.get("Risk").getMDependencys().add(id_229626a96def41d4a216335ed641677c);

        // dependency BpmnCollaboration.Artifact
        MDependency id_7f7654da18d611e09cf7001ec947ccaf = new MDependency("7f7654da-18d6-11e0-9cf7-001ec947ccaf","Artifact","7f765494-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnArtifact"),false,false,false,true);
        this.mClass.get("BpmnCollaboration").getMDependencys().add(id_7f7654da18d611e09cf7001ec947ccaf);

        // dependency BpmnCollaboration.MessageFlow
        MDependency id_7f7654ca18d611e09cf7001ec947ccaf = new MDependency("7f7654ca-18d6-11e0-9cf7-001ec947ccaf","MessageFlow","7f765494-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMessageFlow"),false,false,false,true);
        this.mClass.get("BpmnCollaboration").getMDependencys().add(id_7f7654ca18d611e09cf7001ec947ccaf);

        // dependency BpmnCollaboration.Participants
        MDependency id_7f7654db18d611e09cf7001ec947ccaf = new MDependency("7f7654db-18d6-11e0-9cf7-001ec947ccaf","Participants","7f765494-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnParticipant"),false,false,false,true);
        this.mClass.get("BpmnCollaboration").getMDependencys().add(id_7f7654db18d611e09cf7001ec947ccaf);

        // dependency BpmnLane.ChildLaneSet
        MDependency id_7f76548618d611e09cf7001ec947ccaf = new MDependency("7f765486-18d6-11e0-9cf7-001ec947ccaf","ChildLaneSet","7f76547b-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnLaneSet"),true,false,false,true);
        this.mClass.get("BpmnLane").getMDependencys().add(id_7f76548618d611e09cf7001ec947ccaf);

        // dependency BpmnLane.PartitionElement
        MDependency id_7f73f1d318d611e09cf7001ec947ccaf = new MDependency("7f73f1d3-18d6-11e0-9cf7-001ec947ccaf","PartitionElement","7f76547b-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("BpmnLane").getMDependencys().add(id_7f73f1d318d611e09cf7001ec947ccaf);

        // dependency BpmnLane.FlowElementRef
        MDependency id_7f76550518d611e09cf7001ec947ccaf = new MDependency("7f765505-18d6-11e0-9cf7-001ec947ccaf","FlowElementRef","7f76547b-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnFlowElement"),false,false,false,false);
        this.mClass.get("BpmnLane").getMDependencys().add(id_7f76550518d611e09cf7001ec947ccaf);

        // dependency BpmnLane.LaneSet
        MDependency id_7f76548518d611e09cf7001ec947ccaf = new MDependency("7f765485-18d6-11e0-9cf7-001ec947ccaf","LaneSet","7f76547b-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnLaneSet"),true,false,false,false);
        this.mClass.get("BpmnLane").getMDependencys().add(id_7f76548518d611e09cf7001ec947ccaf);

        // dependency BpmnLaneSet.Lane
        MDependency id_7f76550618d611e09cf7001ec947ccaf = new MDependency("7f765506-18d6-11e0-9cf7-001ec947ccaf","Lane","7f76547c-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnLane"),false,false,false,true);
        this.mClass.get("BpmnLaneSet").getMDependencys().add(id_7f76550618d611e09cf7001ec947ccaf);

        // dependency BpmnLaneSet.Process
        MDependency id_7f76550a18d611e09cf7001ec947ccaf = new MDependency("7f76550a-18d6-11e0-9cf7-001ec947ccaf","Process","7f76547c-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnProcess"),true,false,false,false);
        this.mClass.get("BpmnLaneSet").getMDependencys().add(id_7f76550a18d611e09cf7001ec947ccaf);

        // dependency BpmnLaneSet.ParentLane
        MDependency id_7f76550b18d611e09cf7001ec947ccaf = new MDependency("7f76550b-18d6-11e0-9cf7-001ec947ccaf","ParentLane","7f76547c-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnLane"),true,false,false,false);
        this.mClass.get("BpmnLaneSet").getMDependencys().add(id_7f76550b18d611e09cf7001ec947ccaf);

        // dependency BpmnLaneSet.SubProcess
        MDependency id_7f76550c18d611e09cf7001ec947ccaf = new MDependency("7f76550c-18d6-11e0-9cf7-001ec947ccaf","SubProcess","7f76547c-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnSubProcess"),true,false,false,false);
        this.mClass.get("BpmnLaneSet").getMDependencys().add(id_7f76550c18d611e09cf7001ec947ccaf);

        // dependency BpmnParticipant.Process
        MDependency id_7f7654fd18d611e09cf7001ec947ccaf = new MDependency("7f7654fd-18d6-11e0-9cf7-001ec947ccaf","Process","7f76547d-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnProcess"),true,false,false,false);
        this.mClass.get("BpmnParticipant").getMDependencys().add(id_7f7654fd18d611e09cf7001ec947ccaf);

        // dependency BpmnParticipant.Container
        MDependency id_7f7654fe18d611e09cf7001ec947ccaf = new MDependency("7f7654fe-18d6-11e0-9cf7-001ec947ccaf","Container","7f76547d-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnCollaboration"),true,false,false,false);
        this.mClass.get("BpmnParticipant").getMDependencys().add(id_7f7654fe18d611e09cf7001ec947ccaf);

        // dependency BpmnParticipant.Type
        MDependency id_7f73f1d818d611e09cf7001ec947ccaf = new MDependency("7f73f1d8-18d6-11e0-9cf7-001ec947ccaf","Type","7f76547d-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("Classifier"),true,false,false,false);
        this.mClass.get("BpmnParticipant").getMDependencys().add(id_7f73f1d818d611e09cf7001ec947ccaf);

        // dependency BpmnParticipant.EndPointRefs
        MDependency id_7f76550018d611e09cf7001ec947ccaf = new MDependency("7f765500-18d6-11e0-9cf7-001ec947ccaf","EndPointRefs","7f76547d-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnEndPoint"),false,false,false,false);
        this.mClass.get("BpmnParticipant").getMDependencys().add(id_7f76550018d611e09cf7001ec947ccaf);

        // dependency BpmnParticipant.InterfaceRefs
        MDependency id_7f7654ff18d611e09cf7001ec947ccaf = new MDependency("7f7654ff-18d6-11e0-9cf7-001ec947ccaf","InterfaceRefs","7f76547d-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnInterface"),false,false,false,false);
        this.mClass.get("BpmnParticipant").getMDependencys().add(id_7f7654ff18d611e09cf7001ec947ccaf);

        // dependency BpmnParticipant.PackageRef
        MDependency id_7f73f1dc18d611e09cf7001ec947ccaf = new MDependency("7f73f1dc-18d6-11e0-9cf7-001ec947ccaf","PackageRef","7f76547d-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("Package"),true,false,false,false);
        this.mClass.get("BpmnParticipant").getMDependencys().add(id_7f73f1dc18d611e09cf7001ec947ccaf);

        // dependency BpmnProcess.Caller
        MDependency id_7f76553d18d611e09cf7001ec947ccaf = new MDependency("7f76553d-18d6-11e0-9cf7-001ec947ccaf","Caller","7f76547e-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnCallActivity"),false,false,false,false);
        this.mClass.get("BpmnProcess").getMDependencys().add(id_7f76553d18d611e09cf7001ec947ccaf);

        // dependency BpmnProcess.Supports
        MDependency id_7f76550418d611e09cf7001ec947ccaf = new MDependency("7f765504-18d6-11e0-9cf7-001ec947ccaf","Supports","7f76547e-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnProcess"),false,false,false,false);
        this.mClass.get("BpmnProcess").getMDependencys().add(id_7f76550418d611e09cf7001ec947ccaf);

        // dependency BpmnProcess.Artifact
        MDependency id_7f76554018d611e09cf7001ec947ccaf = new MDependency("7f765540-18d6-11e0-9cf7-001ec947ccaf","Artifact","7f76547e-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnArtifact"),false,false,false,true);
        this.mClass.get("BpmnProcess").getMDependencys().add(id_7f76554018d611e09cf7001ec947ccaf);

        // dependency BpmnProcess.LaneSet
        MDependency id_7f76551818d611e09cf7001ec947ccaf = new MDependency("7f765518-18d6-11e0-9cf7-001ec947ccaf","LaneSet","7f76547e-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnLaneSet"),false,false,false,true);
        this.mClass.get("BpmnProcess").getMDependencys().add(id_7f76551818d611e09cf7001ec947ccaf);

        // dependency BpmnProcess.Supported
        MDependency id_7f76553a18d611e09cf7001ec947ccaf = new MDependency("7f76553a-18d6-11e0-9cf7-001ec947ccaf","Supported","7f76547e-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnProcess"),false,false,false,false);
        this.mClass.get("BpmnProcess").getMDependencys().add(id_7f76553a18d611e09cf7001ec947ccaf);

        // dependency BpmnProcess.Participant
        MDependency id_7f76553e18d611e09cf7001ec947ccaf = new MDependency("7f76553e-18d6-11e0-9cf7-001ec947ccaf","Participant","7f76547e-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnParticipant"),true,false,false,false);
        this.mClass.get("BpmnProcess").getMDependencys().add(id_7f76553e18d611e09cf7001ec947ccaf);

        // dependency BpmnProcess.FlowElement
        MDependency id_7f76554118d611e09cf7001ec947ccaf = new MDependency("7f765541-18d6-11e0-9cf7-001ec947ccaf","FlowElement","7f76547e-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnFlowElement"),false,false,false,true);
        this.mClass.get("BpmnProcess").getMDependencys().add(id_7f76554118d611e09cf7001ec947ccaf);

        // dependency BpmnProcess.Resource
        MDependency id_7f76553f18d611e09cf7001ec947ccaf = new MDependency("7f76553f-18d6-11e0-9cf7-001ec947ccaf","Resource","7f76547e-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnResourceRole"),false,false,false,true);
        this.mClass.get("BpmnProcess").getMDependencys().add(id_7f76553f18d611e09cf7001ec947ccaf);

        // dependency BpmnAssociation.TargetRef
        MDependency id_7f76552818d611e09cf7001ec947ccaf = new MDependency("7f765528-18d6-11e0-9cf7-001ec947ccaf","TargetRef","7f765470-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnBaseElement"),true,false,false,false);
        this.mClass.get("BpmnAssociation").getMDependencys().add(id_7f76552818d611e09cf7001ec947ccaf);

        // dependency BpmnAssociation.SourceRef
        MDependency id_7f76552718d611e09cf7001ec947ccaf = new MDependency("7f765527-18d6-11e0-9cf7-001ec947ccaf","SourceRef","7f765470-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnBaseElement"),true,false,false,false);
        this.mClass.get("BpmnAssociation").getMDependencys().add(id_7f76552718d611e09cf7001ec947ccaf);

        // dependency BpmnBaseElement.OutgoingAssoc
        MDependency id_7f7654ba18d611e09cf7001ec947ccaf = new MDependency("7f7654ba-18d6-11e0-9cf7-001ec947ccaf","OutgoingAssoc","7f765471-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnAssociation"),false,false,false,false);
        this.mClass.get("BpmnBaseElement").getMDependencys().add(id_7f7654ba18d611e09cf7001ec947ccaf);

        // dependency BpmnBaseElement.IncomingAssoc
        MDependency id_7f7654bb18d611e09cf7001ec947ccaf = new MDependency("7f7654bb-18d6-11e0-9cf7-001ec947ccaf","IncomingAssoc","7f765471-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnAssociation"),false,false,false,false);
        this.mClass.get("BpmnBaseElement").getMDependencys().add(id_7f7654bb18d611e09cf7001ec947ccaf);

        // dependency BpmnBaseElement.IncomingFlow
        MDependency id_7f7654bc18d611e09cf7001ec947ccaf = new MDependency("7f7654bc-18d6-11e0-9cf7-001ec947ccaf","IncomingFlow","7f765471-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMessageFlow"),false,false,false,false);
        this.mClass.get("BpmnBaseElement").getMDependencys().add(id_7f7654bc18d611e09cf7001ec947ccaf);

        // dependency BpmnBaseElement.OutgoingFlow
        MDependency id_7f7654bd18d611e09cf7001ec947ccaf = new MDependency("7f7654bd-18d6-11e0-9cf7-001ec947ccaf","OutgoingFlow","7f765471-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMessageFlow"),false,false,false,false);
        this.mClass.get("BpmnBaseElement").getMDependencys().add(id_7f7654bd18d611e09cf7001ec947ccaf);

        // dependency BpmnArtifact.SubProcess
        MDependency id_7f76554418d611e09cf7001ec947ccaf = new MDependency("7f765544-18d6-11e0-9cf7-001ec947ccaf","SubProcess","7f765472-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnSubProcess"),true,false,false,false);
        this.mClass.get("BpmnArtifact").getMDependencys().add(id_7f76554418d611e09cf7001ec947ccaf);

        // dependency BpmnArtifact.Collaboration
        MDependency id_7f7654f118d611e09cf7001ec947ccaf = new MDependency("7f7654f1-18d6-11e0-9cf7-001ec947ccaf","Collaboration","7f765472-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnCollaboration"),true,false,false,false);
        this.mClass.get("BpmnArtifact").getMDependencys().add(id_7f7654f118d611e09cf7001ec947ccaf);

        // dependency BpmnArtifact.Process
        MDependency id_7f78b71118d611e09cf7001ec947ccaf = new MDependency("7f78b711-18d6-11e0-9cf7-001ec947ccaf","Process","7f765472-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnProcess"),true,false,false,false);
        this.mClass.get("BpmnArtifact").getMDependencys().add(id_7f78b71118d611e09cf7001ec947ccaf);

        // dependency BpmnFlowElement.Groups
        MDependency id_7f7654f818d611e09cf7001ec947ccaf = new MDependency("7f7654f8-18d6-11e0-9cf7-001ec947ccaf","Groups","7f765498-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnGroup"),false,false,false,false);
        this.mClass.get("BpmnFlowElement").getMDependencys().add(id_7f7654f818d611e09cf7001ec947ccaf);

        // dependency BpmnFlowElement.SubProcess
        MDependency id_7f7654f918d611e09cf7001ec947ccaf = new MDependency("7f7654f9-18d6-11e0-9cf7-001ec947ccaf","SubProcess","7f765498-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnSubProcess"),true,false,false,false);
        this.mClass.get("BpmnFlowElement").getMDependencys().add(id_7f7654f918d611e09cf7001ec947ccaf);

        // dependency BpmnFlowElement.Lane
        MDependency id_7f7654fa18d611e09cf7001ec947ccaf = new MDependency("7f7654fa-18d6-11e0-9cf7-001ec947ccaf","Lane","7f765498-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnLane"),false,false,false,false);
        this.mClass.get("BpmnFlowElement").getMDependencys().add(id_7f7654fa18d611e09cf7001ec947ccaf);

        // dependency BpmnFlowElement.Container
        MDependency id_7f7654fb18d611e09cf7001ec947ccaf = new MDependency("7f7654fb-18d6-11e0-9cf7-001ec947ccaf","Container","7f765498-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnProcess"),true,false,false,false);
        this.mClass.get("BpmnFlowElement").getMDependencys().add(id_7f7654fb18d611e09cf7001ec947ccaf);

        // dependency BpmnFlowNode.Outgoing
        MDependency id_7f76553318d611e09cf7001ec947ccaf = new MDependency("7f765533-18d6-11e0-9cf7-001ec947ccaf","Outgoing","7f765499-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnSequenceFlow"),false,false,false,false);
        this.mClass.get("BpmnFlowNode").getMDependencys().add(id_7f76553318d611e09cf7001ec947ccaf);

        // dependency BpmnFlowNode.Resource
        MDependency id_7f76553518d611e09cf7001ec947ccaf = new MDependency("7f765535-18d6-11e0-9cf7-001ec947ccaf","Resource","7f765499-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnResourceRole"),false,false,false,true);
        this.mClass.get("BpmnFlowNode").getMDependencys().add(id_7f76553518d611e09cf7001ec947ccaf);

        // dependency BpmnFlowNode.Incoming
        MDependency id_7f76553418d611e09cf7001ec947ccaf = new MDependency("7f765534-18d6-11e0-9cf7-001ec947ccaf","Incoming","7f765499-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnSequenceFlow"),false,false,false,false);
        this.mClass.get("BpmnFlowNode").getMDependencys().add(id_7f76553418d611e09cf7001ec947ccaf);

        // dependency BpmnGroup.Categorized
        MDependency id_7f76552b18d611e09cf7001ec947ccaf = new MDependency("7f76552b-18d6-11e0-9cf7-001ec947ccaf","Categorized","7f76549a-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnFlowElement"),false,false,false,false);
        this.mClass.get("BpmnGroup").getMDependencys().add(id_7f76552b18d611e09cf7001ec947ccaf);

        // dependency BpmnRootElement.Owner
        MDependency id_7f78b74218d611e09cf7001ec947ccaf = new MDependency("7f78b742-18d6-11e0-9cf7-001ec947ccaf","Owner","7f76549b-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnBehavior"),true,false,false,false);
        this.mClass.get("BpmnRootElement").getMDependencys().add(id_7f78b74218d611e09cf7001ec947ccaf);

        // dependency BpmnBehavior.RootElement
        MDependency id_7f78b71218d611e09cf7001ec947ccaf = new MDependency("7f78b712-18d6-11e0-9cf7-001ec947ccaf","RootElement","7f76549c-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnRootElement"),false,false,false,true);
        this.mClass.get("BpmnBehavior").getMDependencys().add(id_7f78b71218d611e09cf7001ec947ccaf);

        // dependency BpmnMessage.Type
        MDependency id_24aa38b0fbc811e086b2001ec947ccaf = new MDependency("24aa38b0-fbc8-11e0-86b2-001ec947ccaf","Type","7f76548f-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("GeneralClass"),true,false,false,false);
        this.mClass.get("BpmnMessage").getMDependencys().add(id_24aa38b0fbc811e086b2001ec947ccaf);

        // dependency BpmnMessage.OutputMessage
        MDependency id_7f78b78f18d611e09cf7001ec947ccaf = new MDependency("7f78b78f-18d6-11e0-9cf7-001ec947ccaf","OutputMessage","7f76548f-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnOperation"),false,false,false,false);
        this.mClass.get("BpmnMessage").getMDependencys().add(id_7f78b78f18d611e09cf7001ec947ccaf);

        // dependency BpmnMessage.ItemRef
        MDependency id_7f78b75318d611e09cf7001ec947ccaf = new MDependency("7f78b753-18d6-11e0-9cf7-001ec947ccaf","ItemRef","7f76548f-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnItemDefinition"),true,false,false,false);
        this.mClass.get("BpmnMessage").getMDependencys().add(id_7f78b75318d611e09cf7001ec947ccaf);

        // dependency BpmnMessage.InState
        MDependency id_24aa38c1fbc811e086b2001ec947ccaf = new MDependency("24aa38c1-fbc8-11e0-86b2-001ec947ccaf","InState","7f76548f-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("State"),true,false,false,false);
        this.mClass.get("BpmnMessage").getMDependencys().add(id_24aa38c1fbc811e086b2001ec947ccaf);

        // dependency BpmnMessage.EventDefinition
        MDependency id_7f78b75218d611e09cf7001ec947ccaf = new MDependency("7f78b752-18d6-11e0-9cf7-001ec947ccaf","EventDefinition","7f76548f-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMessageEventDefinition"),false,false,false,false);
        this.mClass.get("BpmnMessage").getMDependencys().add(id_7f78b75218d611e09cf7001ec947ccaf);

        // dependency BpmnMessage.Sender
        MDependency id_7f78b75018d611e09cf7001ec947ccaf = new MDependency("7f78b750-18d6-11e0-9cf7-001ec947ccaf","Sender","7f76548f-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnSendTask"),false,false,false,false);
        this.mClass.get("BpmnMessage").getMDependencys().add(id_7f78b75018d611e09cf7001ec947ccaf);

        // dependency BpmnMessage.InputMessage
        MDependency id_7f78b78e18d611e09cf7001ec947ccaf = new MDependency("7f78b78e-18d6-11e0-9cf7-001ec947ccaf","InputMessage","7f76548f-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnOperation"),false,false,false,false);
        this.mClass.get("BpmnMessage").getMDependencys().add(id_7f78b78e18d611e09cf7001ec947ccaf);

        // dependency BpmnMessage.Receiver
        MDependency id_7f78b75118d611e09cf7001ec947ccaf = new MDependency("7f78b751-18d6-11e0-9cf7-001ec947ccaf","Receiver","7f76548f-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnReceiveTask"),false,false,false,false);
        this.mClass.get("BpmnMessage").getMDependencys().add(id_7f78b75118d611e09cf7001ec947ccaf);

        // dependency BpmnMessage.MessageFlow
        MDependency id_7f78b78d18d611e09cf7001ec947ccaf = new MDependency("7f78b78d-18d6-11e0-9cf7-001ec947ccaf","MessageFlow","7f76548f-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMessageFlow"),false,false,false,false);
        this.mClass.get("BpmnMessage").getMDependencys().add(id_7f78b78d18d611e09cf7001ec947ccaf);

        // dependency BpmnMessageFlow.MessageRef
        MDependency id_7f78b75618d611e09cf7001ec947ccaf = new MDependency("7f78b756-18d6-11e0-9cf7-001ec947ccaf","MessageRef","7f765490-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMessage"),true,false,false,false);
        this.mClass.get("BpmnMessageFlow").getMDependencys().add(id_7f78b75618d611e09cf7001ec947ccaf);

        // dependency BpmnMessageFlow.SourceRef
        MDependency id_7f7654ef18d611e09cf7001ec947ccaf = new MDependency("7f7654ef-18d6-11e0-9cf7-001ec947ccaf","SourceRef","7f765490-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnBaseElement"),true,false,false,false);
        this.mClass.get("BpmnMessageFlow").getMDependencys().add(id_7f7654ef18d611e09cf7001ec947ccaf);

        // dependency BpmnMessageFlow.TargetRef
        MDependency id_7f7654ed18d611e09cf7001ec947ccaf = new MDependency("7f7654ed-18d6-11e0-9cf7-001ec947ccaf","TargetRef","7f765490-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnBaseElement"),true,false,false,false);
        this.mClass.get("BpmnMessageFlow").getMDependencys().add(id_7f7654ed18d611e09cf7001ec947ccaf);

        // dependency BpmnMessageFlow.Collaboration
        MDependency id_7f78b72b18d611e09cf7001ec947ccaf = new MDependency("7f78b72b-18d6-11e0-9cf7-001ec947ccaf","Collaboration","7f765490-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnCollaboration"),true,false,false,false);
        this.mClass.get("BpmnMessageFlow").getMDependencys().add(id_7f78b72b18d611e09cf7001ec947ccaf);

        // dependency BpmnSequenceFlow.SourceRef
        MDependency id_7f76553718d611e09cf7001ec947ccaf = new MDependency("7f765537-18d6-11e0-9cf7-001ec947ccaf","SourceRef","7f765491-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnFlowNode"),true,false,false,false);
        this.mClass.get("BpmnSequenceFlow").getMDependencys().add(id_7f76553718d611e09cf7001ec947ccaf);

        // dependency BpmnSequenceFlow.TargetRef
        MDependency id_7f76553918d611e09cf7001ec947ccaf = new MDependency("7f765539-18d6-11e0-9cf7-001ec947ccaf","TargetRef","7f765491-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnFlowNode"),true,false,false,false);
        this.mClass.get("BpmnSequenceFlow").getMDependencys().add(id_7f76553918d611e09cf7001ec947ccaf);

        // dependency BpmnSequenceFlow.DefaultOfInclusive
        MDependency id_7f78b77e18d611e09cf7001ec947ccaf = new MDependency("7f78b77e-18d6-11e0-9cf7-001ec947ccaf","DefaultOfInclusive","7f765491-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnInclusiveGateway"),true,false,false,false);
        this.mClass.get("BpmnSequenceFlow").getMDependencys().add(id_7f78b77e18d611e09cf7001ec947ccaf);

        // dependency BpmnSequenceFlow.DefaultFrom
        MDependency id_7f78b73618d611e09cf7001ec947ccaf = new MDependency("7f78b736-18d6-11e0-9cf7-001ec947ccaf","DefaultFrom","7f765491-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnActivity"),true,false,false,false);
        this.mClass.get("BpmnSequenceFlow").getMDependencys().add(id_7f78b73618d611e09cf7001ec947ccaf);

        // dependency BpmnSequenceFlow.DefaultOfExclusive
        MDependency id_7f78b77d18d611e09cf7001ec947ccaf = new MDependency("7f78b77d-18d6-11e0-9cf7-001ec947ccaf","DefaultOfExclusive","7f765491-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnExclusiveGateway"),true,false,false,false);
        this.mClass.get("BpmnSequenceFlow").getMDependencys().add(id_7f78b77d18d611e09cf7001ec947ccaf);

        // dependency BpmnSequenceFlow.Connector
        MDependency id_7f78b73718d611e09cf7001ec947ccaf = new MDependency("7f78b737-18d6-11e0-9cf7-001ec947ccaf","Connector","7f765491-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnSequenceFlowDataAssociation"),false,false,false,true);
        this.mClass.get("BpmnSequenceFlow").getMDependencys().add(id_7f78b73718d611e09cf7001ec947ccaf);

        // dependency BpmnSequenceFlow.DefaultOfComplex
        MDependency id_7f78b77f18d611e09cf7001ec947ccaf = new MDependency("7f78b77f-18d6-11e0-9cf7-001ec947ccaf","DefaultOfComplex","7f765491-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnComplexGateway"),true,false,false,false);
        this.mClass.get("BpmnSequenceFlow").getMDependencys().add(id_7f78b77f18d611e09cf7001ec947ccaf);

        // dependency BpmnActivity.CompensateEventDefinitions
        MDependency id_7f78b78818d611e09cf7001ec947ccaf = new MDependency("7f78b788-18d6-11e0-9cf7-001ec947ccaf","CompensateEventDefinitions","7f765488-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnCompensateEventDefinition"),false,false,false,false);
        this.mClass.get("BpmnActivity").getMDependencys().add(id_7f78b78818d611e09cf7001ec947ccaf);

        // dependency BpmnActivity.InputSpecification
        MDependency id_7f78b78418d611e09cf7001ec947ccaf = new MDependency("7f78b784-18d6-11e0-9cf7-001ec947ccaf","InputSpecification","7f765488-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnDataInput"),false,false,false,true);
        this.mClass.get("BpmnActivity").getMDependencys().add(id_7f78b78418d611e09cf7001ec947ccaf);

        // dependency BpmnActivity.DataInputAssociation
        MDependency id_7f78b76918d611e09cf7001ec947ccaf = new MDependency("7f78b769-18d6-11e0-9cf7-001ec947ccaf","DataInputAssociation","7f765488-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnDataAssociation"),false,false,false,true);
        this.mClass.get("BpmnActivity").getMDependencys().add(id_7f78b76918d611e09cf7001ec947ccaf);

        // dependency BpmnActivity.OutputSpecification
        MDependency id_7f78b78518d611e09cf7001ec947ccaf = new MDependency("7f78b785-18d6-11e0-9cf7-001ec947ccaf","OutputSpecification","7f765488-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnDataOutput"),false,false,false,true);
        this.mClass.get("BpmnActivity").getMDependencys().add(id_7f78b78518d611e09cf7001ec947ccaf);

        // dependency BpmnActivity.LoopCharacteristics
        MDependency id_7f78b76b18d611e09cf7001ec947ccaf = new MDependency("7f78b76b-18d6-11e0-9cf7-001ec947ccaf","LoopCharacteristics","7f765488-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnLoopCharacteristics"),true,false,false,true);
        this.mClass.get("BpmnActivity").getMDependencys().add(id_7f78b76b18d611e09cf7001ec947ccaf);

        // dependency BpmnActivity.BoundaryEventRef
        MDependency id_7f78b78618d611e09cf7001ec947ccaf = new MDependency("7f78b786-18d6-11e0-9cf7-001ec947ccaf","BoundaryEventRef","7f765488-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnBoundaryEvent"),false,false,false,false);
        this.mClass.get("BpmnActivity").getMDependencys().add(id_7f78b78618d611e09cf7001ec947ccaf);

        // dependency BpmnActivity.DataOutputAssociation
        MDependency id_7f78b76a18d611e09cf7001ec947ccaf = new MDependency("7f78b76a-18d6-11e0-9cf7-001ec947ccaf","DataOutputAssociation","7f765488-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnDataAssociation"),false,false,false,true);
        this.mClass.get("BpmnActivity").getMDependencys().add(id_7f78b76a18d611e09cf7001ec947ccaf);

        // dependency BpmnActivity.DefaultFlow
        MDependency id_7f78b77018d611e09cf7001ec947ccaf = new MDependency("7f78b770-18d6-11e0-9cf7-001ec947ccaf","DefaultFlow","7f765488-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnSequenceFlow"),true,false,false,false);
        this.mClass.get("BpmnActivity").getMDependencys().add(id_7f78b77018d611e09cf7001ec947ccaf);

        // dependency BpmnCallActivity.CalledGlobalTask
        MDependency id_7f78b74d18d611e09cf7001ec947ccaf = new MDependency("7f78b74d-18d6-11e0-9cf7-001ec947ccaf","CalledGlobalTask","7f76548c-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnTask"),true,false,false,false);
        this.mClass.get("BpmnCallActivity").getMDependencys().add(id_7f78b74d18d611e09cf7001ec947ccaf);

        // dependency BpmnCallActivity.CalledProcess
        MDependency id_7f76551018d611e09cf7001ec947ccaf = new MDependency("7f765510-18d6-11e0-9cf7-001ec947ccaf","CalledProcess","7f76548c-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnProcess"),true,false,false,false);
        this.mClass.get("BpmnCallActivity").getMDependencys().add(id_7f76551018d611e09cf7001ec947ccaf);

        // dependency BpmnCallActivity.CalledOperation
        MDependency id_7f73f21b18d611e09cf7001ec947ccaf = new MDependency("7f73f21b-18d6-11e0-9cf7-001ec947ccaf","CalledOperation","7f76548c-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("BpmnCallActivity").getMDependencys().add(id_7f73f21b18d611e09cf7001ec947ccaf);

        // dependency BpmnCallActivity.CalledBehavior
        MDependency id_7f73f21518d611e09cf7001ec947ccaf = new MDependency("7f73f215-18d6-11e0-9cf7-001ec947ccaf","CalledBehavior","7f76548c-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("Behavior"),true,false,false,false);
        this.mClass.get("BpmnCallActivity").getMDependencys().add(id_7f73f21518d611e09cf7001ec947ccaf);

        // dependency BpmnComplexBehaviorDefinition.Owner
        MDependency id_7f78b79318d611e09cf7001ec947ccaf = new MDependency("7f78b793-18d6-11e0-9cf7-001ec947ccaf","Owner","7f76548d-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMultiInstanceLoopCharacteristics"),true,false,false,false);
        this.mClass.get("BpmnComplexBehaviorDefinition").getMDependencys().add(id_7f78b79318d611e09cf7001ec947ccaf);

        // dependency BpmnComplexBehaviorDefinition.Event
        MDependency id_7f78b7a518d611e09cf7001ec947ccaf = new MDependency("7f78b7a5-18d6-11e0-9cf7-001ec947ccaf","Event","7f76548d-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnImplicitThrowEvent"),true,false,false,true);
        this.mClass.get("BpmnComplexBehaviorDefinition").getMDependencys().add(id_7f78b7a518d611e09cf7001ec947ccaf);

        // dependency BpmnLoopCharacteristics.OwnerActivity
        MDependency id_7f78b7a618d611e09cf7001ec947ccaf = new MDependency("7f78b7a6-18d6-11e0-9cf7-001ec947ccaf","OwnerActivity","7f76548e-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnActivity"),true,false,false,false);
        this.mClass.get("BpmnLoopCharacteristics").getMDependencys().add(id_7f78b7a618d611e09cf7001ec947ccaf);

        // dependency BpmnMultiInstanceLoopCharacteristics.LoopDataInput
        MDependency id_7f78b7b118d611e09cf7001ec947ccaf = new MDependency("7f78b7b1-18d6-11e0-9cf7-001ec947ccaf","LoopDataInput","7f765476-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnDataInput"),true,false,false,true);
        this.mClass.get("BpmnMultiInstanceLoopCharacteristics").getMDependencys().add(id_7f78b7b118d611e09cf7001ec947ccaf);

        // dependency BpmnMultiInstanceLoopCharacteristics.LoopDataOutputRef
        MDependency id_7f78b7b218d611e09cf7001ec947ccaf = new MDependency("7f78b7b2-18d6-11e0-9cf7-001ec947ccaf","LoopDataOutputRef","7f765476-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnDataOutput"),true,false,false,true);
        this.mClass.get("BpmnMultiInstanceLoopCharacteristics").getMDependencys().add(id_7f78b7b218d611e09cf7001ec947ccaf);

        // dependency BpmnMultiInstanceLoopCharacteristics.CompletionEventRef
        MDependency id_7f78b7b518d611e09cf7001ec947ccaf = new MDependency("7f78b7b5-18d6-11e0-9cf7-001ec947ccaf","CompletionEventRef","7f765476-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnEventDefinition"),true,false,false,false);
        this.mClass.get("BpmnMultiInstanceLoopCharacteristics").getMDependencys().add(id_7f78b7b518d611e09cf7001ec947ccaf);

        // dependency BpmnMultiInstanceLoopCharacteristics.ComplexBehaviorDefinition
        MDependency id_7f78b79518d611e09cf7001ec947ccaf = new MDependency("7f78b795-18d6-11e0-9cf7-001ec947ccaf","ComplexBehaviorDefinition","7f765476-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnComplexBehaviorDefinition"),false,false,false,true);
        this.mClass.get("BpmnMultiInstanceLoopCharacteristics").getMDependencys().add(id_7f78b79518d611e09cf7001ec947ccaf);

        // dependency BpmnReceiveTask.MessageRef
        MDependency id_7f78b72818d611e09cf7001ec947ccaf = new MDependency("7f78b728-18d6-11e0-9cf7-001ec947ccaf","MessageRef","7f765477-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMessage"),true,false,false,false);
        this.mClass.get("BpmnReceiveTask").getMDependencys().add(id_7f78b72818d611e09cf7001ec947ccaf);

        // dependency BpmnReceiveTask.OperationRef
        MDependency id_7f78b7c218d611e09cf7001ec947ccaf = new MDependency("7f78b7c2-18d6-11e0-9cf7-001ec947ccaf","OperationRef","7f765477-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnOperation"),true,false,false,false);
        this.mClass.get("BpmnReceiveTask").getMDependencys().add(id_7f78b7c218d611e09cf7001ec947ccaf);

        // dependency BpmnReceiveTask.CalledOperation
        MDependency id_78d05412fe1811e086b2001ec947ccaf = new MDependency("78d05412-fe18-11e0-86b2-001ec947ccaf","CalledOperation","7f765477-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("BpmnReceiveTask").getMDependencys().add(id_78d05412fe1811e086b2001ec947ccaf);

        // dependency BpmnSendTask.MessageRef
        MDependency id_7f78b72618d611e09cf7001ec947ccaf = new MDependency("7f78b726-18d6-11e0-9cf7-001ec947ccaf","MessageRef","7f765479-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMessage"),true,false,false,false);
        this.mClass.get("BpmnSendTask").getMDependencys().add(id_7f78b72618d611e09cf7001ec947ccaf);

        // dependency BpmnSendTask.OperationRef
        MDependency id_7f76551218d611e09cf7001ec947ccaf = new MDependency("7f765512-18d6-11e0-9cf7-001ec947ccaf","OperationRef","7f765479-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnOperation"),true,false,false,false);
        this.mClass.get("BpmnSendTask").getMDependencys().add(id_7f76551218d611e09cf7001ec947ccaf);

        // dependency BpmnSendTask.CalledOperation
        MDependency id_d0362236fe1711e086b2001ec947ccaf = new MDependency("d0362236-fe17-11e0-86b2-001ec947ccaf","CalledOperation","7f765479-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("BpmnSendTask").getMDependencys().add(id_d0362236fe1711e086b2001ec947ccaf);

        // dependency BpmnServiceTask.CalledOperation
        MDependency id_92442430fe1811e086b2001ec947ccaf = new MDependency("92442430-fe18-11e0-86b2-001ec947ccaf","CalledOperation","7f76547a-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("BpmnServiceTask").getMDependencys().add(id_92442430fe1811e086b2001ec947ccaf);

        // dependency BpmnServiceTask.OperationRef
        MDependency id_7f78b7ba18d611e09cf7001ec947ccaf = new MDependency("7f78b7ba-18d6-11e0-9cf7-001ec947ccaf","OperationRef","7f76547a-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnOperation"),true,false,false,false);
        this.mClass.get("BpmnServiceTask").getMDependencys().add(id_7f78b7ba18d611e09cf7001ec947ccaf);

        // dependency BpmnSubProcess.Artifact
        MDependency id_7f7654f418d611e09cf7001ec947ccaf = new MDependency("7f7654f4-18d6-11e0-9cf7-001ec947ccaf","Artifact","7f73f220-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnArtifact"),false,false,false,true);
        this.mClass.get("BpmnSubProcess").getMDependencys().add(id_7f7654f418d611e09cf7001ec947ccaf);

        // dependency BpmnSubProcess.FlowElement
        MDependency id_7f76552d18d611e09cf7001ec947ccaf = new MDependency("7f76552d-18d6-11e0-9cf7-001ec947ccaf","FlowElement","7f73f220-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnFlowElement"),false,false,false,true);
        this.mClass.get("BpmnSubProcess").getMDependencys().add(id_7f76552d18d611e09cf7001ec947ccaf);

        // dependency BpmnSubProcess.LaneSet
        MDependency id_7f76551b18d611e09cf7001ec947ccaf = new MDependency("7f76551b-18d6-11e0-9cf7-001ec947ccaf","LaneSet","7f73f220-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnLaneSet"),false,false,false,true);
        this.mClass.get("BpmnSubProcess").getMDependencys().add(id_7f76551b18d611e09cf7001ec947ccaf);

        // dependency BpmnTask.Caller
        MDependency id_7f78b7f918d611e09cf7001ec947ccaf = new MDependency("7f78b7f9-18d6-11e0-9cf7-001ec947ccaf","Caller","7f73f221-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnCallActivity"),false,false,false,false);
        this.mClass.get("BpmnTask").getMDependencys().add(id_7f78b7f918d611e09cf7001ec947ccaf);

        // dependency BpmnBoundaryEvent.AttachedToRef
        MDependency id_7f78b7e118d611e09cf7001ec947ccaf = new MDependency("7f78b7e1-18d6-11e0-9cf7-001ec947ccaf","AttachedToRef","7f76546b-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnActivity"),true,false,false,false);
        this.mClass.get("BpmnBoundaryEvent").getMDependencys().add(id_7f78b7e118d611e09cf7001ec947ccaf);

        // dependency BpmnCatchEvent.DataOutputAssociation
        MDependency id_7f78b7cf18d611e09cf7001ec947ccaf = new MDependency("7f78b7cf-18d6-11e0-9cf7-001ec947ccaf","DataOutputAssociation","7f76546d-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnDataAssociation"),false,false,false,true);
        this.mClass.get("BpmnCatchEvent").getMDependencys().add(id_7f78b7cf18d611e09cf7001ec947ccaf);

        // dependency BpmnCatchEvent.DataOutput
        MDependency id_7f78b7e318d611e09cf7001ec947ccaf = new MDependency("7f78b7e3-18d6-11e0-9cf7-001ec947ccaf","DataOutput","7f76546d-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnDataOutput"),true,false,false,true);
        this.mClass.get("BpmnCatchEvent").getMDependencys().add(id_7f78b7e318d611e09cf7001ec947ccaf);

        // dependency BpmnCompensateEventDefinition.ActivityRef
        MDependency id_7f78b76c18d611e09cf7001ec947ccaf = new MDependency("7f78b76c-18d6-11e0-9cf7-001ec947ccaf","ActivityRef","7f76549f-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnActivity"),true,false,false,false);
        this.mClass.get("BpmnCompensateEventDefinition").getMDependencys().add(id_7f78b76c18d611e09cf7001ec947ccaf);

        // dependency BpmnEvent.EventDefinitions
        MDependency id_7f78b7f518d611e09cf7001ec947ccaf = new MDependency("7f78b7f5-18d6-11e0-9cf7-001ec947ccaf","EventDefinitions","7f7654a4-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnEventDefinition"),false,false,false,true);
        this.mClass.get("BpmnEvent").getMDependencys().add(id_7f78b7f518d611e09cf7001ec947ccaf);

        // dependency BpmnEventDefinition.Defined
        MDependency id_7f78b7f418d611e09cf7001ec947ccaf = new MDependency("7f78b7f4-18d6-11e0-9cf7-001ec947ccaf","Defined","7f7654a5-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnEvent"),true,false,false,false);
        this.mClass.get("BpmnEventDefinition").getMDependencys().add(id_7f78b7f418d611e09cf7001ec947ccaf);

        // dependency BpmnEventDefinition.LoopRef
        MDependency id_7f78b7ea18d611e09cf7001ec947ccaf = new MDependency("7f78b7ea-18d6-11e0-9cf7-001ec947ccaf","LoopRef","7f7654a5-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMultiInstanceLoopCharacteristics"),false,false,false,false);
        this.mClass.get("BpmnEventDefinition").getMDependencys().add(id_7f78b7ea18d611e09cf7001ec947ccaf);

        // dependency BpmnImplicitThrowEvent.Owner
        MDependency id_7f78b83318d611e09cf7001ec947ccaf = new MDependency("7f78b833-18d6-11e0-9cf7-001ec947ccaf","Owner","7f7654a6-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnComplexBehaviorDefinition"),true,false,false,false);
        this.mClass.get("BpmnImplicitThrowEvent").getMDependencys().add(id_7f78b83318d611e09cf7001ec947ccaf);

        // dependency BpmnLinkEventDefinition.Source
        MDependency id_7f78b81a18d611e09cf7001ec947ccaf = new MDependency("7f78b81a-18d6-11e0-9cf7-001ec947ccaf","Source","7f7654a9-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnLinkEventDefinition"),false,false,false,false);
        this.mClass.get("BpmnLinkEventDefinition").getMDependencys().add(id_7f78b81a18d611e09cf7001ec947ccaf);

        // dependency BpmnLinkEventDefinition.Target
        MDependency id_7f78b80118d611e09cf7001ec947ccaf = new MDependency("7f78b801-18d6-11e0-9cf7-001ec947ccaf","Target","7f7654a9-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnLinkEventDefinition"),true,false,false,false);
        this.mClass.get("BpmnLinkEventDefinition").getMDependencys().add(id_7f78b80118d611e09cf7001ec947ccaf);

        // dependency BpmnMessageEventDefinition.MessageRef
        MDependency id_7f78b72a18d611e09cf7001ec947ccaf = new MDependency("7f78b72a-18d6-11e0-9cf7-001ec947ccaf","MessageRef","7f7654aa-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMessage"),true,false,false,false);
        this.mClass.get("BpmnMessageEventDefinition").getMDependencys().add(id_7f78b72a18d611e09cf7001ec947ccaf);

        // dependency BpmnMessageEventDefinition.OperationRef
        MDependency id_7f78b7ed18d611e09cf7001ec947ccaf = new MDependency("7f78b7ed-18d6-11e0-9cf7-001ec947ccaf","OperationRef","7f7654aa-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnOperation"),true,false,false,false);
        this.mClass.get("BpmnMessageEventDefinition").getMDependencys().add(id_7f78b7ed18d611e09cf7001ec947ccaf);

        // dependency BpmnThrowEvent.DataInputAssociation
        MDependency id_7f78b80818d611e09cf7001ec947ccaf = new MDependency("7f78b808-18d6-11e0-9cf7-001ec947ccaf","DataInputAssociation","7f7654ae-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnDataAssociation"),false,false,false,true);
        this.mClass.get("BpmnThrowEvent").getMDependencys().add(id_7f78b80818d611e09cf7001ec947ccaf);

        // dependency BpmnThrowEvent.DataInput
        MDependency id_7f78b80718d611e09cf7001ec947ccaf = new MDependency("7f78b807-18d6-11e0-9cf7-001ec947ccaf","DataInput","7f7654ae-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnDataInput"),true,false,false,true);
        this.mClass.get("BpmnThrowEvent").getMDependencys().add(id_7f78b80718d611e09cf7001ec947ccaf);

        // dependency BpmnComplexGateway.DefaultFlow
        MDependency id_7f78b77618d611e09cf7001ec947ccaf = new MDependency("7f78b776-18d6-11e0-9cf7-001ec947ccaf","DefaultFlow","7f7654e3-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnSequenceFlow"),true,false,false,false);
        this.mClass.get("BpmnComplexGateway").getMDependencys().add(id_7f78b77618d611e09cf7001ec947ccaf);

        // dependency BpmnExclusiveGateway.DefaultFlow
        MDependency id_7f78b77218d611e09cf7001ec947ccaf = new MDependency("7f78b772-18d6-11e0-9cf7-001ec947ccaf","DefaultFlow","7f7654b2-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnSequenceFlow"),true,false,false,false);
        this.mClass.get("BpmnExclusiveGateway").getMDependencys().add(id_7f78b77218d611e09cf7001ec947ccaf);

        // dependency BpmnInclusiveGateway.DefaultFlow
        MDependency id_7f78b77418d611e09cf7001ec947ccaf = new MDependency("7f78b774-18d6-11e0-9cf7-001ec947ccaf","DefaultFlow","7f7654d0-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnSequenceFlow"),true,false,false,false);
        this.mClass.get("BpmnInclusiveGateway").getMDependencys().add(id_7f78b77418d611e09cf7001ec947ccaf);

        // dependency BpmnDataAssociation.SourceRef
        MDependency id_7f78b84718d611e09cf7001ec947ccaf = new MDependency("7f78b847-18d6-11e0-9cf7-001ec947ccaf","SourceRef","7f7654e1-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnItemAwareElement"),false,false,false,false);
        this.mClass.get("BpmnDataAssociation").getMDependencys().add(id_7f78b84718d611e09cf7001ec947ccaf);

        // dependency BpmnDataAssociation.TargetRef
        MDependency id_7f78b84818d611e09cf7001ec947ccaf = new MDependency("7f78b848-18d6-11e0-9cf7-001ec947ccaf","TargetRef","7f7654e1-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnItemAwareElement"),true,false,false,false);
        this.mClass.get("BpmnDataAssociation").getMDependencys().add(id_7f78b84818d611e09cf7001ec947ccaf);

        // dependency BpmnDataAssociation.EndingActivity
        MDependency id_7f78b83d18d611e09cf7001ec947ccaf = new MDependency("7f78b83d-18d6-11e0-9cf7-001ec947ccaf","EndingActivity","7f7654e1-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnActivity"),true,false,false,false);
        this.mClass.get("BpmnDataAssociation").getMDependencys().add(id_7f78b83d18d611e09cf7001ec947ccaf);

        // dependency BpmnDataAssociation.StartingActivity
        MDependency id_7f78b83b18d611e09cf7001ec947ccaf = new MDependency("7f78b83b-18d6-11e0-9cf7-001ec947ccaf","StartingActivity","7f7654e1-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnActivity"),true,false,false,false);
        this.mClass.get("BpmnDataAssociation").getMDependencys().add(id_7f78b83b18d611e09cf7001ec947ccaf);

        // dependency BpmnDataAssociation.StartingEvent
        MDependency id_7f78b83c18d611e09cf7001ec947ccaf = new MDependency("7f78b83c-18d6-11e0-9cf7-001ec947ccaf","StartingEvent","7f7654e1-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnThrowEvent"),true,false,false,false);
        this.mClass.get("BpmnDataAssociation").getMDependencys().add(id_7f78b83c18d611e09cf7001ec947ccaf);

        // dependency BpmnDataAssociation.VisualShortCut
        MDependency id_7f78b83a18d611e09cf7001ec947ccaf = new MDependency("7f78b83a-18d6-11e0-9cf7-001ec947ccaf","VisualShortCut","7f7654e1-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnSequenceFlowDataAssociation"),false,false,false,false);
        this.mClass.get("BpmnDataAssociation").getMDependencys().add(id_7f78b83a18d611e09cf7001ec947ccaf);

        // dependency BpmnDataAssociation.EndingEvent
        MDependency id_7f78b83e18d611e09cf7001ec947ccaf = new MDependency("7f78b83e-18d6-11e0-9cf7-001ec947ccaf","EndingEvent","7f7654e1-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnCatchEvent"),true,false,false,false);
        this.mClass.get("BpmnDataAssociation").getMDependencys().add(id_7f78b83e18d611e09cf7001ec947ccaf);

        // dependency BpmnSequenceFlowDataAssociation.Connected
        MDependency id_7f73f1cf18d611e09cf7001ec947ccaf = new MDependency("7f73f1cf-18d6-11e0-9cf7-001ec947ccaf","Connected","7f7654e2-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnSequenceFlow"),true,false,false,false);
        this.mClass.get("BpmnSequenceFlowDataAssociation").getMDependencys().add(id_7f73f1cf18d611e09cf7001ec947ccaf);

        // dependency BpmnSequenceFlowDataAssociation.DataAssociation
        MDependency id_7f78b84118d611e09cf7001ec947ccaf = new MDependency("7f78b841-18d6-11e0-9cf7-001ec947ccaf","DataAssociation","7f7654e2-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnDataAssociation"),false,false,false,false);
        this.mClass.get("BpmnSequenceFlowDataAssociation").getMDependencys().add(id_7f78b84118d611e09cf7001ec947ccaf);

        // dependency BpmnDataOutput.RepresentedParameter
        MDependency id_7f73f1f718d611e09cf7001ec947ccaf = new MDependency("7f73f1f7-18d6-11e0-9cf7-001ec947ccaf","RepresentedParameter","7f7654c2-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("Parameter"),true,false,false,false);
        this.mClass.get("BpmnDataOutput").getMDependencys().add(id_7f73f1f718d611e09cf7001ec947ccaf);

        // dependency BpmnDataOutput.OwnerActivity
        MDependency id_7f78b85418d611e09cf7001ec947ccaf = new MDependency("7f78b854-18d6-11e0-9cf7-001ec947ccaf","OwnerActivity","7f7654c2-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnActivity"),true,false,false,false);
        this.mClass.get("BpmnDataOutput").getMDependencys().add(id_7f78b85418d611e09cf7001ec947ccaf);

        // dependency BpmnDataOutput.Catched
        MDependency id_7f78b85518d611e09cf7001ec947ccaf = new MDependency("7f78b855-18d6-11e0-9cf7-001ec947ccaf","Catched","7f7654c2-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnCatchEvent"),true,false,false,false);
        this.mClass.get("BpmnDataOutput").getMDependencys().add(id_7f78b85518d611e09cf7001ec947ccaf);

        // dependency BpmnDataOutput.OwnerLoopCharacteristics
        MDependency id_7f78b85618d611e09cf7001ec947ccaf = new MDependency("7f78b856-18d6-11e0-9cf7-001ec947ccaf","OwnerLoopCharacteristics","7f7654c2-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMultiInstanceLoopCharacteristics"),true,false,false,false);
        this.mClass.get("BpmnDataOutput").getMDependencys().add(id_7f78b85618d611e09cf7001ec947ccaf);

        // dependency BpmnDataInput.RepresentedParameter
        MDependency id_7f73f1f918d611e09cf7001ec947ccaf = new MDependency("7f73f1f9-18d6-11e0-9cf7-001ec947ccaf","RepresentedParameter","7f7654c3-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("Parameter"),true,false,false,false);
        this.mClass.get("BpmnDataInput").getMDependencys().add(id_7f73f1f918d611e09cf7001ec947ccaf);

        // dependency BpmnDataInput.OwnerLoopCharacteristics
        MDependency id_7f78b71618d611e09cf7001ec947ccaf = new MDependency("7f78b716-18d6-11e0-9cf7-001ec947ccaf","OwnerLoopCharacteristics","7f7654c3-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMultiInstanceLoopCharacteristics"),true,false,false,false);
        this.mClass.get("BpmnDataInput").getMDependencys().add(id_7f78b71618d611e09cf7001ec947ccaf);

        // dependency BpmnDataInput.OwnerActivity
        MDependency id_7f78b87a18d611e09cf7001ec947ccaf = new MDependency("7f78b87a-18d6-11e0-9cf7-001ec947ccaf","OwnerActivity","7f7654c3-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnActivity"),true,false,false,false);
        this.mClass.get("BpmnDataInput").getMDependencys().add(id_7f78b87a18d611e09cf7001ec947ccaf);

        // dependency BpmnDataInput.OwnerThrowEvent
        MDependency id_7f78b87b18d611e09cf7001ec947ccaf = new MDependency("7f78b87b-18d6-11e0-9cf7-001ec947ccaf","OwnerThrowEvent","7f7654c3-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnThrowEvent"),true,false,false,false);
        this.mClass.get("BpmnDataInput").getMDependencys().add(id_7f78b87b18d611e09cf7001ec947ccaf);

        // dependency BpmnItemAwareElement.Type
        MDependency id_5fb6c049fbc711e086b2001ec947ccaf = new MDependency("5fb6c049-fbc7-11e0-86b2-001ec947ccaf","Type","7f7654c4-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("GeneralClass"),true,false,false,false);
        this.mClass.get("BpmnItemAwareElement").getMDependencys().add(id_5fb6c049fbc711e086b2001ec947ccaf);

        // dependency BpmnItemAwareElement.TargetOfDataAssociation
        MDependency id_7f78b86c18d611e09cf7001ec947ccaf = new MDependency("7f78b86c-18d6-11e0-9cf7-001ec947ccaf","TargetOfDataAssociation","7f7654c4-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnDataAssociation"),false,false,false,false);
        this.mClass.get("BpmnItemAwareElement").getMDependencys().add(id_7f78b86c18d611e09cf7001ec947ccaf);

        // dependency BpmnItemAwareElement.ItemSubjectRef
        MDependency id_7f78b71e18d611e09cf7001ec947ccaf = new MDependency("7f78b71e-18d6-11e0-9cf7-001ec947ccaf","ItemSubjectRef","7f7654c4-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnItemDefinition"),true,false,false,false);
        this.mClass.get("BpmnItemAwareElement").getMDependencys().add(id_7f78b71e18d611e09cf7001ec947ccaf);

        // dependency BpmnItemAwareElement.InState
        MDependency id_b45c0f9efbc711e086b2001ec947ccaf = new MDependency("b45c0f9e-fbc7-11e0-86b2-001ec947ccaf","InState","7f7654c4-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("State"),true,false,false,false);
        this.mClass.get("BpmnItemAwareElement").getMDependencys().add(id_b45c0f9efbc711e086b2001ec947ccaf);

        // dependency BpmnItemAwareElement.RepresentedAssociationEnd
        MDependency id_7f73f1ee18d611e09cf7001ec947ccaf = new MDependency("7f73f1ee-18d6-11e0-9cf7-001ec947ccaf","RepresentedAssociationEnd","7f7654c4-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("AssociationEnd"),true,false,false,false);
        this.mClass.get("BpmnItemAwareElement").getMDependencys().add(id_7f73f1ee18d611e09cf7001ec947ccaf);

        // dependency BpmnItemAwareElement.DataState
        MDependency id_7f78b86a18d611e09cf7001ec947ccaf = new MDependency("7f78b86a-18d6-11e0-9cf7-001ec947ccaf","DataState","7f7654c4-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnDataState"),true,false,false,true);
        this.mClass.get("BpmnItemAwareElement").getMDependencys().add(id_7f78b86a18d611e09cf7001ec947ccaf);

        // dependency BpmnItemAwareElement.SourceOfDataAssociation
        MDependency id_7f78b86b18d611e09cf7001ec947ccaf = new MDependency("7f78b86b-18d6-11e0-9cf7-001ec947ccaf","SourceOfDataAssociation","7f7654c4-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnDataAssociation"),false,false,false,false);
        this.mClass.get("BpmnItemAwareElement").getMDependencys().add(id_7f78b86b18d611e09cf7001ec947ccaf);

        // dependency BpmnItemAwareElement.RepresentedAttribute
        MDependency id_7f73f1e418d611e09cf7001ec947ccaf = new MDependency("7f73f1e4-18d6-11e0-9cf7-001ec947ccaf","RepresentedAttribute","7f7654c4-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("Attribute"),true,false,false,false);
        this.mClass.get("BpmnItemAwareElement").getMDependencys().add(id_7f73f1e418d611e09cf7001ec947ccaf);

        // dependency BpmnItemAwareElement.RepresentedInstance
        MDependency id_7f73f1f218d611e09cf7001ec947ccaf = new MDependency("7f73f1f2-18d6-11e0-9cf7-001ec947ccaf","RepresentedInstance","7f7654c4-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("Instance"),true,false,false,false);
        this.mClass.get("BpmnItemAwareElement").getMDependencys().add(id_7f73f1f218d611e09cf7001ec947ccaf);

        // dependency BpmnItemDefinition.StructureRef
        MDependency id_7f73f1de18d611e09cf7001ec947ccaf = new MDependency("7f73f1de-18d6-11e0-9cf7-001ec947ccaf","StructureRef","7f7654c5-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("GeneralClass"),true,false,false,false);
        this.mClass.get("BpmnItemDefinition").getMDependencys().add(id_7f73f1de18d611e09cf7001ec947ccaf);

        // dependency BpmnItemDefinition.TypedMessage
        MDependency id_7f78b88118d611e09cf7001ec947ccaf = new MDependency("7f78b881-18d6-11e0-9cf7-001ec947ccaf","TypedMessage","7f7654c5-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMessage"),false,false,false,false);
        this.mClass.get("BpmnItemDefinition").getMDependencys().add(id_7f78b88118d611e09cf7001ec947ccaf);

        // dependency BpmnItemDefinition.TypedItem
        MDependency id_7f78b88218d611e09cf7001ec947ccaf = new MDependency("7f78b882-18d6-11e0-9cf7-001ec947ccaf","TypedItem","7f7654c5-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnItemAwareElement"),false,false,false,false);
        this.mClass.get("BpmnItemDefinition").getMDependencys().add(id_7f78b88218d611e09cf7001ec947ccaf);

        // dependency BpmnItemDefinition.TypedResourceParameter
        MDependency id_7f78b88318d611e09cf7001ec947ccaf = new MDependency("7f78b883-18d6-11e0-9cf7-001ec947ccaf","TypedResourceParameter","7f7654c5-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnResourceParameter"),false,false,false,false);
        this.mClass.get("BpmnItemDefinition").getMDependencys().add(id_7f78b88318d611e09cf7001ec947ccaf);

        // dependency BpmnDataState.Item
        MDependency id_7f78b86f18d611e09cf7001ec947ccaf = new MDependency("7f78b86f-18d6-11e0-9cf7-001ec947ccaf","Item","7f7654c7-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnItemAwareElement"),true,false,false,false);
        this.mClass.get("BpmnDataState").getMDependencys().add(id_7f78b86f18d611e09cf7001ec947ccaf);

        // dependency BpmnDataState.UmlState
        MDependency id_7f73f21118d611e09cf7001ec947ccaf = new MDependency("7f73f211-18d6-11e0-9cf7-001ec947ccaf","UmlState","7f7654c7-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("State"),true,false,false,false);
        this.mClass.get("BpmnDataState").getMDependencys().add(id_7f73f21118d611e09cf7001ec947ccaf);

        // dependency BpmnResource.ResourceroleRefs
        MDependency id_7f7b19c018d611e09cf7001ec947ccaf = new MDependency("7f7b19c0-18d6-11e0-9cf7-001ec947ccaf","ResourceroleRefs","7f7654e9-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnResourceRole"),false,false,false,false);
        this.mClass.get("BpmnResource").getMDependencys().add(id_7f7b19c018d611e09cf7001ec947ccaf);

        // dependency BpmnResource.Parameter
        MDependency id_7f7b19bf18d611e09cf7001ec947ccaf = new MDependency("7f7b19bf-18d6-11e0-9cf7-001ec947ccaf","Parameter","7f7654e9-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnResourceParameter"),false,false,false,true);
        this.mClass.get("BpmnResource").getMDependencys().add(id_7f7b19bf18d611e09cf7001ec947ccaf);

        // dependency BpmnResourceParameter.Resource
        MDependency id_7f78b86518d611e09cf7001ec947ccaf = new MDependency("7f78b865-18d6-11e0-9cf7-001ec947ccaf","Resource","7f7654ea-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnResource"),true,false,false,false);
        this.mClass.get("BpmnResourceParameter").getMDependencys().add(id_7f78b86518d611e09cf7001ec947ccaf);

        // dependency BpmnResourceParameter.Type
        MDependency id_7f78b87318d611e09cf7001ec947ccaf = new MDependency("7f78b873-18d6-11e0-9cf7-001ec947ccaf","Type","7f7654ea-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnItemDefinition"),true,false,false,false);
        this.mClass.get("BpmnResourceParameter").getMDependencys().add(id_7f78b87318d611e09cf7001ec947ccaf);

        // dependency BpmnResourceParameter.ParameterBindingRefs
        MDependency id_7f7b19c518d611e09cf7001ec947ccaf = new MDependency("7f7b19c5-18d6-11e0-9cf7-001ec947ccaf","ParameterBindingRefs","7f7654ea-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnResourceParameterBinding"),false,false,false,false);
        this.mClass.get("BpmnResourceParameter").getMDependencys().add(id_7f7b19c518d611e09cf7001ec947ccaf);

        // dependency BpmnResourceRole.ResourceRef
        MDependency id_7f7b19c118d611e09cf7001ec947ccaf = new MDependency("7f7b19c1-18d6-11e0-9cf7-001ec947ccaf","ResourceRef","7f7654eb-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnResource"),true,false,false,false);
        this.mClass.get("BpmnResourceRole").getMDependencys().add(id_7f7b19c118d611e09cf7001ec947ccaf);

        // dependency BpmnResourceRole.Annotated
        MDependency id_7f78b89618d611e09cf7001ec947ccaf = new MDependency("7f78b896-18d6-11e0-9cf7-001ec947ccaf","Annotated","7f7654eb-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnFlowNode"),true,false,false,false);
        this.mClass.get("BpmnResourceRole").getMDependencys().add(id_7f78b89618d611e09cf7001ec947ccaf);

        // dependency BpmnResourceRole.ResourceParameterBinding
        MDependency id_7f78b89518d611e09cf7001ec947ccaf = new MDependency("7f78b895-18d6-11e0-9cf7-001ec947ccaf","ResourceParameterBinding","7f7654eb-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnResourceParameterBinding"),false,false,false,true);
        this.mClass.get("BpmnResourceRole").getMDependencys().add(id_7f78b89518d611e09cf7001ec947ccaf);

        // dependency BpmnResourceRole.Process
        MDependency id_7f78b88718d611e09cf7001ec947ccaf = new MDependency("7f78b887-18d6-11e0-9cf7-001ec947ccaf","Process","7f7654eb-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnProcess"),true,false,false,false);
        this.mClass.get("BpmnResourceRole").getMDependencys().add(id_7f78b88718d611e09cf7001ec947ccaf);

        // dependency BpmnResourceParameterBinding.ResourceRole
        MDependency id_7f78b88d18d611e09cf7001ec947ccaf = new MDependency("7f78b88d-18d6-11e0-9cf7-001ec947ccaf","ResourceRole","7f7654c9-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnResourceRole"),true,false,false,false);
        this.mClass.get("BpmnResourceParameterBinding").getMDependencys().add(id_7f78b88d18d611e09cf7001ec947ccaf);

        // dependency BpmnResourceParameterBinding.ParameterRef
        MDependency id_7f78b86418d611e09cf7001ec947ccaf = new MDependency("7f78b864-18d6-11e0-9cf7-001ec947ccaf","ParameterRef","7f7654c9-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnResourceParameter"),true,false,false,false);
        this.mClass.get("BpmnResourceParameterBinding").getMDependencys().add(id_7f78b86418d611e09cf7001ec947ccaf);

        // dependency BpmnOperation.Sender
        MDependency id_7f7b19e718d611e09cf7001ec947ccaf = new MDependency("7f7b19e7-18d6-11e0-9cf7-001ec947ccaf","Sender","7f7654cd-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnSendTask"),false,false,false,false);
        this.mClass.get("BpmnOperation").getMDependencys().add(id_7f7b19e718d611e09cf7001ec947ccaf);

        // dependency BpmnOperation.InMessageRef
        MDependency id_7f78b72218d611e09cf7001ec947ccaf = new MDependency("7f78b722-18d6-11e0-9cf7-001ec947ccaf","InMessageRef","7f7654cd-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMessage"),true,false,false,false);
        this.mClass.get("BpmnOperation").getMDependencys().add(id_7f78b72218d611e09cf7001ec947ccaf);

        // dependency BpmnOperation.Caller
        MDependency id_7f7b19ca18d611e09cf7001ec947ccaf = new MDependency("7f7b19ca-18d6-11e0-9cf7-001ec947ccaf","Caller","7f7654cd-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnServiceTask"),false,false,false,false);
        this.mClass.get("BpmnOperation").getMDependencys().add(id_7f7b19ca18d611e09cf7001ec947ccaf);

        // dependency BpmnOperation.OutMessageRef
        MDependency id_7f78b72418d611e09cf7001ec947ccaf = new MDependency("7f78b724-18d6-11e0-9cf7-001ec947ccaf","OutMessageRef","7f7654cd-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMessage"),true,false,false,false);
        this.mClass.get("BpmnOperation").getMDependencys().add(id_7f78b72418d611e09cf7001ec947ccaf);

        // dependency BpmnOperation.EventDefinition
        MDependency id_7f7b19e618d611e09cf7001ec947ccaf = new MDependency("7f7b19e6-18d6-11e0-9cf7-001ec947ccaf","EventDefinition","7f7654cd-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnMessageEventDefinition"),false,false,false,false);
        this.mClass.get("BpmnOperation").getMDependencys().add(id_7f7b19e618d611e09cf7001ec947ccaf);

        // dependency BpmnOperation.ImplementationRef
        MDependency id_7f73f1e918d611e09cf7001ec947ccaf = new MDependency("7f73f1e9-18d6-11e0-9cf7-001ec947ccaf","ImplementationRef","7f7654cd-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("BpmnOperation").getMDependencys().add(id_7f73f1e918d611e09cf7001ec947ccaf);

        // dependency BpmnOperation.BpmnInterfaceRef
        MDependency id_7f7b19e518d611e09cf7001ec947ccaf = new MDependency("7f7b19e5-18d6-11e0-9cf7-001ec947ccaf","BpmnInterfaceRef","7f7654cd-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnInterface"),true,false,false,false);
        this.mClass.get("BpmnOperation").getMDependencys().add(id_7f7b19e518d611e09cf7001ec947ccaf);

        // dependency BpmnOperation.Receiver
        MDependency id_7f7b19c918d611e09cf7001ec947ccaf = new MDependency("7f7b19c9-18d6-11e0-9cf7-001ec947ccaf","Receiver","7f7654cd-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnReceiveTask"),false,false,false,false);
        this.mClass.get("BpmnOperation").getMDependencys().add(id_7f7b19c918d611e09cf7001ec947ccaf);

        // dependency BpmnInterface.ImplementationRef
        MDependency id_7f73f1e018d611e09cf7001ec947ccaf = new MDependency("7f73f1e0-18d6-11e0-9cf7-001ec947ccaf","ImplementationRef","7f7654e5-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("GeneralClass"),true,false,false,false);
        this.mClass.get("BpmnInterface").getMDependencys().add(id_7f73f1e018d611e09cf7001ec947ccaf);

        // dependency BpmnInterface.Operation
        MDependency id_7f7b19e418d611e09cf7001ec947ccaf = new MDependency("7f7b19e4-18d6-11e0-9cf7-001ec947ccaf","Operation","7f7654e5-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnOperation"),false,false,false,true);
        this.mClass.get("BpmnInterface").getMDependencys().add(id_7f7b19e418d611e09cf7001ec947ccaf);

        // dependency BpmnInterface.ParticipantRef
        MDependency id_7f78b89118d611e09cf7001ec947ccaf = new MDependency("7f78b891-18d6-11e0-9cf7-001ec947ccaf","ParticipantRef","7f7654e5-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnParticipant"),false,false,false,false);
        this.mClass.get("BpmnInterface").getMDependencys().add(id_7f78b89118d611e09cf7001ec947ccaf);

        // dependency BpmnEndPoint.ParticipantRefs
        MDependency id_7f78b89418d611e09cf7001ec947ccaf = new MDependency("7f78b894-18d6-11e0-9cf7-001ec947ccaf","ParticipantRefs","7f7654e6-18d6-11e0-9cf7-001ec947ccaf.exml",this.mClass.get("BpmnParticipant"),false,false,false,false);
        this.mClass.get("BpmnEndPoint").getMDependencys().add(id_7f78b89418d611e09cf7001ec947ccaf);

        // dependency AbstractDiagram.Origin
        MDependency id_0148033c0001a26c0000000000000000 = new MDependency("0148033c-0001-a26c-0000-000000000000","Origin","000c0248-0000-5917-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("AbstractDiagram").getMDependencys().add(id_0148033c0001a26c0000000000000000);

        // dependency AbstractDiagram.Represented
        MDependency id_000c02480000598c0000000000000000 = new MDependency("000c0248-0000-598c-0000-000000000000","Represented","000c0248-0000-5917-0000-000000000000.exml",this.mClass.get("Element"),false,false,false,false);
        this.mClass.get("AbstractDiagram").getMDependencys().add(id_000c02480000598c0000000000000000);

        // dependency AbstractDiagram.ReferencingSet
        MDependency id_1ecb7ac72af311e080c5001ec947ccaf = new MDependency("1ecb7ac7-2af3-11e0-80c5-001ec947ccaf","ReferencingSet","000c0248-0000-5917-0000-000000000000.exml",this.mClass.get("DiagramSet"),false,false,false,false);
        this.mClass.get("AbstractDiagram").getMDependencys().add(id_1ecb7ac72af311e080c5001ec947ccaf);

        // dependency DiagramSet.Sub
        MDependency id_0c01db202ae811e080c5001ec947ccaf = new MDependency("0c01db20-2ae8-11e0-80c5-001ec947ccaf","Sub","41bd9c24-2ae6-11e0-80c5-001ec947ccaf.exml",this.mClass.get("DiagramSet"),false,false,false,true);
        this.mClass.get("DiagramSet").getMDependencys().add(id_0c01db202ae811e080c5001ec947ccaf);

        // dependency DiagramSet.Parent
        MDependency id_0c01db212ae811e080c5001ec947ccaf = new MDependency("0c01db21-2ae8-11e0-80c5-001ec947ccaf","Parent","41bd9c24-2ae6-11e0-80c5-001ec947ccaf.exml",this.mClass.get("DiagramSet"),true,false,false,false);
        this.mClass.get("DiagramSet").getMDependencys().add(id_0c01db212ae811e080c5001ec947ccaf);

        // dependency DiagramSet.ReferencedDiagram
        MDependency id_1ecb7ac62af311e080c5001ec947ccaf = new MDependency("1ecb7ac6-2af3-11e0-80c5-001ec947ccaf","ReferencedDiagram","41bd9c24-2ae6-11e0-80c5-001ec947ccaf.exml",this.mClass.get("AbstractDiagram"),false,false,false,false);
        this.mClass.get("DiagramSet").getMDependencys().add(id_1ecb7ac62af311e080c5001ec947ccaf);

        // dependency DiagramSet.Owner
        MDependency id_c1f9f68f2ae711e080c5001ec947ccaf = new MDependency("c1f9f68f-2ae7-11e0-80c5-001ec947ccaf","Owner","41bd9c24-2ae6-11e0-80c5-001ec947ccaf.exml",this.mClass.get("Project"),true,false,false,false);
        this.mClass.get("DiagramSet").getMDependencys().add(id_c1f9f68f2ae711e080c5001ec947ccaf);

        // dependency ModuleParameter.Owner
        MDependency id_8f6471f4416011dea777001ec947ccaf = new MDependency("8f6471f4-4160-11de-a777-001ec947ccaf","Owner","0148033c-0000-0d3e-0000-000000000000.exml",this.mClass.get("ModuleComponent"),true,false,false,false);
        this.mClass.get("ModuleParameter").getMDependencys().add(id_8f6471f4416011dea777001ec947ccaf);

        // dependency ModuleParameter.EnumType
        MDependency id_1e6293cb43a511deb107001ec947ccaf = new MDependency("1e6293cb-43a5-11de-b107-001ec947ccaf","EnumType","0148033c-0000-0d3e-0000-000000000000.exml",this.mClass.get("Enumeration"),true,false,false,false);
        this.mClass.get("ModuleParameter").getMDependencys().add(id_1e6293cb43a511deb107001ec947ccaf);

        // dependency ModuleComponent.DefinedPropertyType
        MDependency id_7649df2227f711e2b500001ec947ccaf = new MDependency("7649df22-27f7-11e2-b500-001ec947ccaf","DefinedPropertyType","0148033c-0000-0d35-0000-000000000000.exml",this.mClass.get("PropertyType"),false,false,false,true);
        this.mClass.get("ModuleComponent").getMDependencys().add(id_7649df2227f711e2b500001ec947ccaf);

        // dependency ModuleComponent.OwnedProfile
        MDependency id_ef5d5b6c413d11dea777001ec947ccaf = new MDependency("ef5d5b6c-413d-11de-a777-001ec947ccaf","OwnedProfile","0148033c-0000-0d35-0000-000000000000.exml",this.mClass.get("Profile"),false,false,false,true);
        this.mClass.get("ModuleComponent").getMDependencys().add(id_ef5d5b6c413d11dea777001ec947ccaf);

        // dependency ModuleComponent.ModuleParameter
        MDependency id_8f6471f3416011dea777001ec947ccaf = new MDependency("8f6471f3-4160-11de-a777-001ec947ccaf","ModuleParameter","0148033c-0000-0d35-0000-000000000000.exml",this.mClass.get("ModuleParameter"),false,false,false,true);
        this.mClass.get("ModuleComponent").getMDependencys().add(id_8f6471f3416011dea777001ec947ccaf);

        // dependency ModuleComponent.DependsOn
        MDependency id_00d001240000385e0000000000000000 = new MDependency("00d00124-0000-385e-0000-000000000000","DependsOn","0148033c-0000-0d35-0000-000000000000.exml",this.mClass.get("ModuleComponent"),false,false,false,false);
        this.mClass.get("ModuleComponent").getMDependencys().add(id_00d001240000385e0000000000000000);

        // dependency ModuleComponent.Impacted
        MDependency id_00d00124000038600000000000000000 = new MDependency("00d00124-0000-3860-0000-000000000000","Impacted","0148033c-0000-0d35-0000-000000000000.exml",this.mClass.get("ModuleComponent"),false,false,false,false);
        this.mClass.get("ModuleComponent").getMDependencys().add(id_00d00124000038600000000000000000);

        // dependency Project.DiagramRoot
        MDependency id_c1f9f68e2ae711e080c5001ec947ccaf = new MDependency("c1f9f68e-2ae7-11e0-80c5-001ec947ccaf","DiagramRoot","0148033c-0000-0ce0-0000-000000000000.exml",this.mClass.get("DiagramSet"),true,false,false,true);
        this.mClass.get("Project").getMDependencys().add(id_c1f9f68e2ae711e080c5001ec947ccaf);

        // dependency Project.Model
        MDependency id_0148033c0001b0650000000000000000 = new MDependency("0148033c-0001-b065-0000-000000000000","Model","0148033c-0000-0ce0-0000-000000000000.exml",this.mClass.get("Package"),true,false,false,true);
        this.mClass.get("Project").getMDependencys().add(id_0148033c0001b0650000000000000000);

        // dependency Constraint.ConstrainedElement
        MDependency id_0148033c000199130000000000000000 = new MDependency("0148033c-0001-9913-0000-000000000000","ConstrainedElement","0148033c-0000-0cdd-0000-000000000000.exml",this.mClass.get("ModelElement"),false,false,false,false);
        this.mClass.get("Constraint").getMDependencys().add(id_0148033c000199130000000000000000);

        // dependency Dependency.DependsOn
        MDependency id_0148033c00019b5b0000000000000000 = new MDependency("0148033c-0001-9b5b-0000-000000000000","DependsOn","0148033c-0000-0cf3-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("Dependency").getMDependencys().add(id_0148033c00019b5b0000000000000000);

        // dependency Dependency.Impacted
        MDependency id_0148033c00019b280000000000000000 = new MDependency("0148033c-0001-9b28-0000-000000000000","Impacted","0148033c-0000-0cf3-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("Dependency").getMDependencys().add(id_0148033c00019b280000000000000000);

        // dependency Element.DiagramElement
        MDependency id_000c02480000598e0000000000000000 = new MDependency("000c0248-0000-598e-0000-000000000000","DiagramElement","0148033c-0000-0ca7-0000-000000000000.exml",this.mClass.get("AbstractDiagram"),false,false,false,false);
        this.mClass.get("Element").getMDependencys().add(id_000c02480000598e0000000000000000);

        // dependency Element.Causing
        MDependency id_002818540000049c0000000000000000 = new MDependency("00281854-0000-049c-0000-000000000000","Causing","0148033c-0000-0ca7-0000-000000000000.exml",this.mClass.get("NamespaceUse"),false,false,false,false);
        this.mClass.get("Element").getMDependencys().add(id_002818540000049c0000000000000000);

        // dependency Element.AddedToQuery
        MDependency id_3ab0eca6987e44dea0e0203dba5c11dc = new MDependency("3ab0eca6-987e-44de-a0e0-203dba5c11dc","AddedToQuery","0148033c-0000-0ca7-0000-000000000000.exml",this.mClass.get("QueryDefinition"),false,false,false,false);
        this.mClass.get("Element").getMDependencys().add(id_3ab0eca6987e44dea0e0203dba5c11dc);

        // dependency ModelElement.LocalProperties
        MDependency id_7f176fe4275911e2b500001ec947ccaf = new MDependency("7f176fe4-2759-11e2-b500-001ec947ccaf","LocalProperties","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("LocalPropertyTable"),true,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_7f176fe4275911e2b500001ec947ccaf);

        // dependency ModelElement.TemplateSubstitution
        MDependency id_0008152c00001e030000000000000000 = new MDependency("0008152c-0000-1e03-0000-000000000000","TemplateSubstitution","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("TemplateParameterSubstitution"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_0008152c00001e030000000000000000);

        // dependency ModelElement.BpmnLaneRefs
        MDependency id_7f73f1ca18d611e09cf7001ec947ccaf = new MDependency("7f73f1ca-18d6-11e0-9cf7-001ec947ccaf","BpmnLaneRefs","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("BpmnLane"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_7f73f1ca18d611e09cf7001ec947ccaf);

        // dependency ModelElement.Extension
        MDependency id_0148033c0001a7290000000000000000 = new MDependency("0148033c-0001-a729-0000-000000000000","Extension","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("Stereotype"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_0148033c0001a7290000000000000000);

        // dependency ModelElement.DependsOnDependency
        MDependency id_0148033c00019b290000000000000000 = new MDependency("0148033c-0001-9b29-0000-000000000000","DependsOnDependency","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("Dependency"),false,false,false,true);
        this.mClass.get("ModelElement").getMDependencys().add(id_0148033c00019b290000000000000000);

        // dependency ModelElement.DefaultParametering
        MDependency id_0008152c00001fa80000000000000000 = new MDependency("0008152c-0000-1fa8-0000-000000000000","DefaultParametering","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("TemplateParameter"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_0008152c00001fa80000000000000000);

        // dependency ModelElement.Represents
        MDependency id_0008152c00001c030000000000000000 = new MDependency("0008152c-0000-1c03-0000-000000000000","Represents","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("Binding"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_0008152c00001c030000000000000000);

        // dependency ModelElement.Document
        MDependency id_a90d0267fbfd11e086b2001ec947ccaf = new MDependency("a90d0267-fbfd-11e0-86b2-001ec947ccaf","Document","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("ExternDocument"),false,false,false,true);
        this.mClass.get("ModelElement").getMDependencys().add(id_a90d0267fbfd11e086b2001ec947ccaf);

        // dependency ModelElement.Tag
        MDependency id_0148033c0001a7700000000000000000 = new MDependency("0148033c-0001-a770-0000-000000000000","Tag","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("TaggedValue"),false,false,false,true);
        this.mClass.get("ModelElement").getMDependencys().add(id_0148033c0001a7700000000000000000);

        // dependency ModelElement.OwnerTemplateParameter
        MDependency id_0008152c00001f730000000000000000 = new MDependency("0008152c-0000-1f73-0000-000000000000","OwnerTemplateParameter","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("TemplateParameter"),true,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_0008152c00001f730000000000000000);

        // dependency ModelElement.ImpactedDependency
        MDependency id_0148033c00019b5c0000000000000000 = new MDependency("0148033c-0001-9b5c-0000-000000000000","ImpactedDependency","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("Dependency"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_0148033c00019b5c0000000000000000);

        // dependency ModelElement.RepresentingEnd
        MDependency id_00281854000017d00000000000000000 = new MDependency("00281854-0000-17d0-0000-000000000000","RepresentingEnd","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("ConnectorEnd"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_00281854000017d00000000000000000);

        // dependency ModelElement.RepresentingPartition
        MDependency id_00d00f2400000a860000000000000000 = new MDependency("00d00f24-0000-0a86-0000-000000000000","RepresentingPartition","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("ActivityPartition"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_00d00f2400000a860000000000000000);

        // dependency ModelElement.ConstraintDefinition
        MDependency id_0148033c000199140000000000000000 = new MDependency("0148033c-0001-9914-0000-000000000000","ConstraintDefinition","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("Constraint"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_0148033c000199140000000000000000);

        // dependency ModelElement.TypingParameter
        MDependency id_002818540000172d0000000000000000 = new MDependency("00281854-0000-172d-0000-000000000000","TypingParameter","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("TemplateParameter"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_002818540000172d0000000000000000);

        // dependency ModelElement.Manifesting
        MDependency id_0008152c00001c7f0000000000000000 = new MDependency("0008152c-0000-1c7f-0000-000000000000","Manifesting","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("Manifestation"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_0008152c00001c7f0000000000000000);

        // dependency ModelElement.Properties
        MDependency id_6589587d275511e2b500001ec947ccaf = new MDependency("6589587d-2755-11e2-b500-001ec947ccaf","Properties","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("PropertyTable"),false,false,false,true);
        this.mClass.get("ModelElement").getMDependencys().add(id_6589587d275511e2b500001ec947ccaf);

        // dependency ModelElement.Product
        MDependency id_0148033c0001a26d0000000000000000 = new MDependency("0148033c-0001-a26d-0000-000000000000","Product","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("AbstractDiagram"),false,false,false,true);
        this.mClass.get("ModelElement").getMDependencys().add(id_0148033c0001a26d0000000000000000);

        // dependency ModelElement.RepresentingInstance
        MDependency id_002818540000177a0000000000000000 = new MDependency("00281854-0000-177a-0000-000000000000","RepresentingInstance","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("BindableInstance"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_002818540000177a0000000000000000);

        // dependency ModelElement.ReceivedInfo
        MDependency id_00d00f24000012de0000000000000000 = new MDependency("00d00f24-0000-12de-0000-000000000000","ReceivedInfo","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("InformationFlow"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_00d00f24000012de0000000000000000);

        // dependency ModelElement.SentInfo
        MDependency id_00d00f24000012e90000000000000000 = new MDependency("00d00f24-0000-12e9-0000-000000000000","SentInfo","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("InformationFlow"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_00d00f24000012e90000000000000000);

        // dependency ModelElement.Descriptor
        MDependency id_0148033c0001a7600000000000000000 = new MDependency("0148033c-0001-a760-0000-000000000000","Descriptor","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("Note"),false,false,false,true);
        this.mClass.get("ModelElement").getMDependencys().add(id_0148033c0001a7600000000000000000);

        // dependency ModelElement.RepresentingConnector
        MDependency id_00281854000017850000000000000000 = new MDependency("00281854-0000-1785-0000-000000000000","RepresentingConnector","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("NaryConnector"),false,false,false,false);
        this.mClass.get("ModelElement").getMDependencys().add(id_00281854000017850000000000000000);

        // dependency ModelElement.Matrix
        MDependency id_f0bf7d0eb8974856a7b438ec3f06e9d9 = new MDependency("f0bf7d0e-b897-4856-a7b4-38ec3f06e9d9","Matrix","0148033c-0000-0ca8-0000-000000000000.exml",this.mClass.get("MatrixDefinition"),false,false,false,true);
        this.mClass.get("ModelElement").getMDependencys().add(id_f0bf7d0eb8974856a7b438ec3f06e9d9);

        // dependency ModelTree.Owner
        MDependency id_0148033c0001a83e0000000000000000 = new MDependency("0148033c-0001-a83e-0000-000000000000","Owner","0148033c-0000-0ca9-0000-000000000000.exml",this.mClass.get("ModelTree"),true,false,false,false);
        this.mClass.get("ModelTree").getMDependencys().add(id_0148033c0001a83e0000000000000000);

        // dependency ModelTree.OwnedElement
        MDependency id_0148033c0001a83f0000000000000000 = new MDependency("0148033c-0001-a83f-0000-000000000000","OwnedElement","0148033c-0000-0ca9-0000-000000000000.exml",this.mClass.get("ModelTree"),false,false,false,true);
        this.mClass.get("ModelTree").getMDependencys().add(id_0148033c0001a83f0000000000000000);

        // dependency Note.Model
        MDependency id_0148033c0001ad380000000000000000 = new MDependency("0148033c-0001-ad38-0000-000000000000","Model","0148033c-0000-0cda-0000-000000000000.exml",this.mClass.get("NoteType"),true,false,false,false);
        this.mClass.get("Note").getMDependencys().add(id_0148033c0001ad380000000000000000);

        // dependency Note.Subject
        MDependency id_0148033c0001a7610000000000000000 = new MDependency("0148033c-0001-a761-0000-000000000000","Subject","0148033c-0000-0cda-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("Note").getMDependencys().add(id_0148033c0001a7610000000000000000);

        // dependency NoteType.Element
        MDependency id_0148033c0001ad390000000000000000 = new MDependency("0148033c-0001-ad39-0000-000000000000","Element","0148033c-0000-0cdb-0000-000000000000.exml",this.mClass.get("Note"),false,false,false,false);
        this.mClass.get("NoteType").getMDependencys().add(id_0148033c0001ad390000000000000000);

        // dependency NoteType.OwnerStereotype
        MDependency id_608bcf8c413e11dea777001ec947ccaf = new MDependency("608bcf8c-413e-11de-a777-001ec947ccaf","OwnerStereotype","0148033c-0000-0cdb-0000-000000000000.exml",this.mClass.get("Stereotype"),true,false,false,false);
        this.mClass.get("NoteType").getMDependencys().add(id_608bcf8c413e11dea777001ec947ccaf);

        // dependency NoteType.OwnerReference
        MDependency id_64077aa6413e11dea777001ec947ccaf = new MDependency("64077aa6-413e-11de-a777-001ec947ccaf","OwnerReference","0148033c-0000-0cdb-0000-000000000000.exml",this.mClass.get("MetaclassReference"),true,false,false,false);
        this.mClass.get("NoteType").getMDependencys().add(id_64077aa6413e11dea777001ec947ccaf);

        // dependency Profile.DefinedStereotype
        MDependency id_f3c9d2d9413d11dea777001ec947ccaf = new MDependency("f3c9d2d9-413d-11de-a777-001ec947ccaf","DefinedStereotype","0148033c-0000-0cbc-0000-000000000000.exml",this.mClass.get("Stereotype"),false,false,false,true);
        this.mClass.get("Profile").getMDependencys().add(id_f3c9d2d9413d11dea777001ec947ccaf);

        // dependency Profile.OwnerModule
        MDependency id_ef5d5b6d413d11dea777001ec947ccaf = new MDependency("ef5d5b6d-413d-11de-a777-001ec947ccaf","OwnerModule","0148033c-0000-0cbc-0000-000000000000.exml",this.mClass.get("ModuleComponent"),true,false,false,false);
        this.mClass.get("Profile").getMDependencys().add(id_ef5d5b6d413d11dea777001ec947ccaf);

        // dependency Profile.OwnedReference
        MDependency id_5a6b0bed413e11dea777001ec947ccaf = new MDependency("5a6b0bed-413e-11de-a777-001ec947ccaf","OwnedReference","0148033c-0000-0cbc-0000-000000000000.exml",this.mClass.get("MetaclassReference"),false,false,false,true);
        this.mClass.get("Profile").getMDependencys().add(id_5a6b0bed413e11dea777001ec947ccaf);

        // dependency Stereotype.DefinedTable
        MDependency id_3d17176d275511e2b500001ec947ccaf = new MDependency("3d17176d-2755-11e2-b500-001ec947ccaf","DefinedTable","0148033c-0000-0cdc-0000-000000000000.exml",this.mClass.get("PropertyTableDefinition"),true,false,false,true);
        this.mClass.get("Stereotype").getMDependencys().add(id_3d17176d275511e2b500001ec947ccaf);

        // dependency Stereotype.ExtendedElement
        MDependency id_0148033c0001a72a0000000000000000 = new MDependency("0148033c-0001-a72a-0000-000000000000","ExtendedElement","0148033c-0000-0cdc-0000-000000000000.exml",this.mClass.get("ModelElement"),false,false,false,false);
        this.mClass.get("Stereotype").getMDependencys().add(id_0148033c0001a72a0000000000000000);

        // dependency Stereotype.DefinedExternDocumentType
        MDependency id_213cb239057111e18525001ec947ccaf = new MDependency("213cb239-0571-11e1-8525-001ec947ccaf","DefinedExternDocumentType","0148033c-0000-0cdc-0000-000000000000.exml",this.mClass.get("ExternDocumentType"),false,false,false,true);
        this.mClass.get("Stereotype").getMDependencys().add(id_213cb239057111e18525001ec947ccaf);

        // dependency Stereotype.Owner
        MDependency id_f3c9d2da413d11dea777001ec947ccaf = new MDependency("f3c9d2da-413d-11de-a777-001ec947ccaf","Owner","0148033c-0000-0cdc-0000-000000000000.exml",this.mClass.get("Profile"),true,false,false,false);
        this.mClass.get("Stereotype").getMDependencys().add(id_f3c9d2da413d11dea777001ec947ccaf);

        // dependency Stereotype.Parent
        MDependency id_e4a568d3415911dea777001ec947ccaf = new MDependency("e4a568d3-4159-11de-a777-001ec947ccaf","Parent","0148033c-0000-0cdc-0000-000000000000.exml",this.mClass.get("Stereotype"),true,false,false,false);
        this.mClass.get("Stereotype").getMDependencys().add(id_e4a568d3415911dea777001ec947ccaf);

        // dependency Stereotype.DefinedTagType
        MDependency id_5f0bf6d4413e11dea777001ec947ccaf = new MDependency("5f0bf6d4-413e-11de-a777-001ec947ccaf","DefinedTagType","0148033c-0000-0cdc-0000-000000000000.exml",this.mClass.get("TagType"),false,false,false,true);
        this.mClass.get("Stereotype").getMDependencys().add(id_5f0bf6d4413e11dea777001ec947ccaf);

        // dependency Stereotype.Child
        MDependency id_e4a568d2415911dea777001ec947ccaf = new MDependency("e4a568d2-4159-11de-a777-001ec947ccaf","Child","0148033c-0000-0cdc-0000-000000000000.exml",this.mClass.get("Stereotype"),false,false,false,false);
        this.mClass.get("Stereotype").getMDependencys().add(id_e4a568d2415911dea777001ec947ccaf);

        // dependency Stereotype.DefinedNoteType
        MDependency id_608bcf8b413e11dea777001ec947ccaf = new MDependency("608bcf8b-413e-11de-a777-001ec947ccaf","DefinedNoteType","0148033c-0000-0cdc-0000-000000000000.exml",this.mClass.get("NoteType"),false,false,false,true);
        this.mClass.get("Stereotype").getMDependencys().add(id_608bcf8b413e11dea777001ec947ccaf);

        // dependency Substitution.Contract
        MDependency id_0008152c00001da70000000000000000 = new MDependency("0008152c-0000-1da7-0000-000000000000","Contract","0008152c-0000-1bb3-0000-000000000000.exml",this.mClass.get("Classifier"),true,false,false,false);
        this.mClass.get("Substitution").getMDependencys().add(id_0008152c00001da70000000000000000);

        // dependency Substitution.SubstitutingClassifier
        MDependency id_0008152c00001d9f0000000000000000 = new MDependency("0008152c-0000-1d9f-0000-000000000000","SubstitutingClassifier","0008152c-0000-1bb3-0000-000000000000.exml",this.mClass.get("Classifier"),true,false,false,false);
        this.mClass.get("Substitution").getMDependencys().add(id_0008152c00001d9f0000000000000000);

        // dependency TagParameter.Annoted
        MDependency id_0148033c0001bd750000000000000000 = new MDependency("0148033c-0001-bd75-0000-000000000000","Annoted","0148033c-0000-0cd7-0000-000000000000.exml",this.mClass.get("TaggedValue"),true,false,false,false);
        this.mClass.get("TagParameter").getMDependencys().add(id_0148033c0001bd750000000000000000);

        // dependency TagParameter.Qualified
        MDependency id_0148033c0001bd790000000000000000 = new MDependency("0148033c-0001-bd79-0000-000000000000","Qualified","0148033c-0000-0cd7-0000-000000000000.exml",this.mClass.get("TaggedValue"),true,false,false,false);
        this.mClass.get("TagParameter").getMDependencys().add(id_0148033c0001bd790000000000000000);

        // dependency TagType.TagOccurence
        MDependency id_0148033c0001bdb80000000000000000 = new MDependency("0148033c-0001-bdb8-0000-000000000000","TagOccurence","0148033c-0000-0cd8-0000-000000000000.exml",this.mClass.get("TaggedValue"),false,false,false,false);
        this.mClass.get("TagType").getMDependencys().add(id_0148033c0001bdb80000000000000000);

        // dependency TagType.OwnerStereotype
        MDependency id_5f0bf6d5413e11dea777001ec947ccaf = new MDependency("5f0bf6d5-413e-11de-a777-001ec947ccaf","OwnerStereotype","0148033c-0000-0cd8-0000-000000000000.exml",this.mClass.get("Stereotype"),true,false,false,false);
        this.mClass.get("TagType").getMDependencys().add(id_5f0bf6d5413e11dea777001ec947ccaf);

        // dependency TagType.OwnerReference
        MDependency id_62532e75413e11dea777001ec947ccaf = new MDependency("62532e75-413e-11de-a777-001ec947ccaf","OwnerReference","0148033c-0000-0cd8-0000-000000000000.exml",this.mClass.get("MetaclassReference"),true,false,false,false);
        this.mClass.get("TagType").getMDependencys().add(id_62532e75413e11dea777001ec947ccaf);

        // dependency TaggedValue.Annoted
        MDependency id_0148033c0001a7710000000000000000 = new MDependency("0148033c-0001-a771-0000-000000000000","Annoted","0148033c-0000-0cd5-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("TaggedValue").getMDependencys().add(id_0148033c0001a7710000000000000000);

        // dependency TaggedValue.Actual
        MDependency id_0148033c0001bd760000000000000000 = new MDependency("0148033c-0001-bd76-0000-000000000000","Actual","0148033c-0000-0cd5-0000-000000000000.exml",this.mClass.get("TagParameter"),false,false,false,true);
        this.mClass.get("TaggedValue").getMDependencys().add(id_0148033c0001bd760000000000000000);

        // dependency TaggedValue.Qualifier
        MDependency id_0148033c0001bd7a0000000000000000 = new MDependency("0148033c-0001-bd7a-0000-000000000000","Qualifier","0148033c-0000-0cd5-0000-000000000000.exml",this.mClass.get("TagParameter"),true,false,false,true);
        this.mClass.get("TaggedValue").getMDependencys().add(id_0148033c0001bd7a0000000000000000);

        // dependency TaggedValue.Definition
        MDependency id_0148033c0001bdb90000000000000000 = new MDependency("0148033c-0001-bdb9-0000-000000000000","Definition","0148033c-0000-0cd5-0000-000000000000.exml",this.mClass.get("TagType"),true,false,false,false);
        this.mClass.get("TaggedValue").getMDependencys().add(id_0148033c0001bdb90000000000000000);

        // dependency MetaclassReference.DefinedTable
        MDependency id_3d171770275511e2b500001ec947ccaf = new MDependency("3d171770-2755-11e2-b500-001ec947ccaf","DefinedTable","0319598d-413e-11de-a777-001ec947ccaf.exml",this.mClass.get("PropertyTableDefinition"),true,false,false,true);
        this.mClass.get("MetaclassReference").getMDependencys().add(id_3d171770275511e2b500001ec947ccaf);

        // dependency MetaclassReference.DefinedNoteType
        MDependency id_64077aa5413e11dea777001ec947ccaf = new MDependency("64077aa5-413e-11de-a777-001ec947ccaf","DefinedNoteType","0319598d-413e-11de-a777-001ec947ccaf.exml",this.mClass.get("NoteType"),false,false,false,true);
        this.mClass.get("MetaclassReference").getMDependencys().add(id_64077aa5413e11dea777001ec947ccaf);

        // dependency MetaclassReference.DefinedExternDocumentType
        MDependency id_213cb236057111e18525001ec947ccaf = new MDependency("213cb236-0571-11e1-8525-001ec947ccaf","DefinedExternDocumentType","0319598d-413e-11de-a777-001ec947ccaf.exml",this.mClass.get("ExternDocumentType"),false,false,false,true);
        this.mClass.get("MetaclassReference").getMDependencys().add(id_213cb236057111e18525001ec947ccaf);

        // dependency MetaclassReference.OwnerProfile
        MDependency id_5a6b0bee413e11dea777001ec947ccaf = new MDependency("5a6b0bee-413e-11de-a777-001ec947ccaf","OwnerProfile","0319598d-413e-11de-a777-001ec947ccaf.exml",this.mClass.get("Profile"),true,false,false,false);
        this.mClass.get("MetaclassReference").getMDependencys().add(id_5a6b0bee413e11dea777001ec947ccaf);

        // dependency MetaclassReference.DefinedTagType
        MDependency id_62532e74413e11dea777001ec947ccaf = new MDependency("62532e74-413e-11de-a777-001ec947ccaf","DefinedTagType","0319598d-413e-11de-a777-001ec947ccaf.exml",this.mClass.get("TagType"),false,false,false,true);
        this.mClass.get("MetaclassReference").getMDependencys().add(id_62532e74413e11dea777001ec947ccaf);

        // dependency ExternDocument.Type
        MDependency id_b9cce666053911e18525001ec947ccaf = new MDependency("b9cce666-0539-11e1-8525-001ec947ccaf","Type","62e2c6f7-faef-11e0-8de7-001ec947ccaf.exml",this.mClass.get("ExternDocumentType"),true,false,false,false);
        this.mClass.get("ExternDocument").getMDependencys().add(id_b9cce666053911e18525001ec947ccaf);

        // dependency ExternDocument.Subject
        MDependency id_a90d0265fbfd11e086b2001ec947ccaf = new MDependency("a90d0265-fbfd-11e0-86b2-001ec947ccaf","Subject","62e2c6f7-faef-11e0-8de7-001ec947ccaf.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("ExternDocument").getMDependencys().add(id_a90d0265fbfd11e086b2001ec947ccaf);

        // dependency ExternDocumentType.OwnerStereotype
        MDependency id_213cb237057111e18525001ec947ccaf = new MDependency("213cb237-0571-11e1-8525-001ec947ccaf","OwnerStereotype","623fb2f8-056f-11e1-8525-001ec947ccaf.exml",this.mClass.get("Stereotype"),true,false,false,false);
        this.mClass.get("ExternDocumentType").getMDependencys().add(id_213cb237057111e18525001ec947ccaf);

        // dependency ExternDocumentType.TypedDoc
        MDependency id_b9cce667053911e18525001ec947ccaf = new MDependency("b9cce667-0539-11e1-8525-001ec947ccaf","TypedDoc","623fb2f8-056f-11e1-8525-001ec947ccaf.exml",this.mClass.get("ExternDocument"),false,false,false,false);
        this.mClass.get("ExternDocumentType").getMDependencys().add(id_b9cce667053911e18525001ec947ccaf);

        // dependency ExternDocumentType.OwnerReference
        MDependency id_213cb238057111e18525001ec947ccaf = new MDependency("213cb238-0571-11e1-8525-001ec947ccaf","OwnerReference","623fb2f8-056f-11e1-8525-001ec947ccaf.exml",this.mClass.get("MetaclassReference"),true,false,false,false);
        this.mClass.get("ExternDocumentType").getMDependencys().add(id_213cb238057111e18525001ec947ccaf);

        // dependency ExternProcessor.OwnerQuery
        MDependency id_528d8490a2524a009476d3f0e8a7ca6e = new MDependency("528d8490-a252-4a00-9476-d3f0e8a7ca6e","OwnerQuery","b6c3f997-48ef-4252-9a47-70ecbe642cb3.exml",this.mClass.get("QueryDefinition"),true,false,false,false);
        this.mClass.get("ExternProcessor").getMDependencys().add(id_528d8490a2524a009476d3f0e8a7ca6e);

        // dependency ExternProcessor.OwnerValDef
        MDependency id_57d91b047bcf472cbb34c7b0c8a6935c = new MDependency("57d91b04-7bcf-472c-bb34-c7b0c8a6935c","OwnerValDef","b6c3f997-48ef-4252-9a47-70ecbe642cb3.exml",this.mClass.get("MatrixValueDefinition"),true,false,false,false);
        this.mClass.get("ExternProcessor").getMDependencys().add(id_57d91b047bcf472cbb34c7b0c8a6935c);

        // dependency EnumeratedPropertyType.Litteral
        MDependency id_00080b0800001a6f0000000000000000 = new MDependency("00080b08-0000-1a6f-0000-000000000000","Litteral","00080b08-0000-1a68-0000-000000000000.exml",this.mClass.get("PropertyEnumerationLitteral"),false,false,false,true);
        this.mClass.get("EnumeratedPropertyType").getMDependencys().add(id_00080b0800001a6f0000000000000000);

        // dependency LocalPropertyTable.LocalAnnoted
        MDependency id_7f176fe5275911e2b500001ec947ccaf = new MDependency("7f176fe5-2759-11e2-b500-001ec947ccaf","LocalAnnoted","c5ab835f-2758-11e2-b500-001ec947ccaf.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("LocalPropertyTable").getMDependencys().add(id_7f176fe5275911e2b500001ec947ccaf);

        // dependency PropertyDefinition.Type
        MDependency id_00080b0800001aba0000000000000000 = new MDependency("00080b08-0000-1aba-0000-000000000000","Type","00080b08-0000-1889-0000-000000000000.exml",this.mClass.get("PropertyType"),true,false,false,false);
        this.mClass.get("PropertyDefinition").getMDependencys().add(id_00080b0800001aba0000000000000000);

        // dependency PropertyDefinition.Owner
        MDependency id_00080b08000018960000000000000000 = new MDependency("00080b08-0000-1896-0000-000000000000","Owner","00080b08-0000-1889-0000-000000000000.exml",this.mClass.get("PropertyTableDefinition"),true,false,false,false);
        this.mClass.get("PropertyDefinition").getMDependencys().add(id_00080b08000018960000000000000000);

        // dependency PropertyEnumerationLitteral.Owner
        MDependency id_00080b0800001a700000000000000000 = new MDependency("00080b08-0000-1a70-0000-000000000000","Owner","00080b08-0000-1a6a-0000-000000000000.exml",this.mClass.get("EnumeratedPropertyType"),true,false,false,false);
        this.mClass.get("PropertyEnumerationLitteral").getMDependencys().add(id_00080b0800001a700000000000000000);

        // dependency PropertyTable.Owner
        MDependency id_6589587b275511e2b500001ec947ccaf = new MDependency("6589587b-2755-11e2-b500-001ec947ccaf","Owner","65895868-2755-11e2-b500-001ec947ccaf.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("PropertyTable").getMDependencys().add(id_6589587b275511e2b500001ec947ccaf);

        // dependency PropertyTable.OwnerValDef
        MDependency id_2da3106e7d4b45f7b6afdb2b8f7ba913 = new MDependency("2da3106e-7d4b-45f7-b6af-db2b8f7ba913","OwnerValDef","65895868-2755-11e2-b500-001ec947ccaf.exml",this.mClass.get("MatrixValueDefinition"),true,false,false,false);
        this.mClass.get("PropertyTable").getMDependencys().add(id_2da3106e7d4b45f7b6afdb2b8f7ba913);

        // dependency PropertyTable.OwnerQuery
        MDependency id_7cd0bb66d69b4e5a88c16ec393d7f843 = new MDependency("7cd0bb66-d69b-4e5a-88c1-6ec393d7f843","OwnerQuery","65895868-2755-11e2-b500-001ec947ccaf.exml",this.mClass.get("QueryDefinition"),true,false,false,false);
        this.mClass.get("PropertyTable").getMDependencys().add(id_7cd0bb66d69b4e5a88c16ec393d7f843);

        // dependency PropertyTableDefinition.Owner
        MDependency id_e5d49ec5a8ef11deade4001ec947ccaf = new MDependency("e5d49ec5-a8ef-11de-ade4-001ec947ccaf","Owner","00080b08-0000-187e-0000-000000000000.exml",this.mClass.get("PropertyContainer"),true,false,false,false);
        this.mClass.get("PropertyTableDefinition").getMDependencys().add(id_e5d49ec5a8ef11deade4001ec947ccaf);

        // dependency PropertyTableDefinition.TypedTable
        MDependency id_33915d39275811e2b500001ec947ccaf = new MDependency("33915d39-2758-11e2-b500-001ec947ccaf","TypedTable","00080b08-0000-187e-0000-000000000000.exml",this.mClass.get("TypedPropertyTable"),false,false,false,false);
        this.mClass.get("PropertyTableDefinition").getMDependencys().add(id_33915d39275811e2b500001ec947ccaf);

        // dependency PropertyTableDefinition.OwnerReference
        MDependency id_3d17176f275511e2b500001ec947ccaf = new MDependency("3d17176f-2755-11e2-b500-001ec947ccaf","OwnerReference","00080b08-0000-187e-0000-000000000000.exml",this.mClass.get("MetaclassReference"),true,false,false,false);
        this.mClass.get("PropertyTableDefinition").getMDependencys().add(id_3d17176f275511e2b500001ec947ccaf);

        // dependency PropertyTableDefinition.OwnerStereotype
        MDependency id_3d17176e275511e2b500001ec947ccaf = new MDependency("3d17176e-2755-11e2-b500-001ec947ccaf","OwnerStereotype","00080b08-0000-187e-0000-000000000000.exml",this.mClass.get("Stereotype"),true,false,false,false);
        this.mClass.get("PropertyTableDefinition").getMDependencys().add(id_3d17176e275511e2b500001ec947ccaf);

        // dependency PropertyTableDefinition.Owned
        MDependency id_00080b08000018950000000000000000 = new MDependency("00080b08-0000-1895-0000-000000000000","Owned","00080b08-0000-187e-0000-000000000000.exml",this.mClass.get("PropertyDefinition"),false,false,false,true);
        this.mClass.get("PropertyTableDefinition").getMDependencys().add(id_00080b08000018950000000000000000);

        // dependency PropertyType.AnalystOwner
        MDependency id_e5d49ec2a8ef11deade4001ec947ccaf = new MDependency("e5d49ec2-a8ef-11de-ade4-001ec947ccaf","AnalystOwner","00080b08-0000-1aae-0000-000000000000.exml",this.mClass.get("PropertyContainer"),true,false,false,false);
        this.mClass.get("PropertyType").getMDependencys().add(id_e5d49ec2a8ef11deade4001ec947ccaf);

        // dependency PropertyType.Typed
        MDependency id_00080b0800001ab80000000000000000 = new MDependency("00080b08-0000-1ab8-0000-000000000000","Typed","00080b08-0000-1aae-0000-000000000000.exml",this.mClass.get("PropertyDefinition"),false,false,false,false);
        this.mClass.get("PropertyType").getMDependencys().add(id_00080b0800001ab80000000000000000);

        // dependency PropertyType.ModuleOwner
        MDependency id_7649df2127f711e2b500001ec947ccaf = new MDependency("7649df21-27f7-11e2-b500-001ec947ccaf","ModuleOwner","00080b08-0000-1aae-0000-000000000000.exml",this.mClass.get("ModuleComponent"),true,false,false,false);
        this.mClass.get("PropertyType").getMDependencys().add(id_7649df2127f711e2b500001ec947ccaf);

        // dependency TypedPropertyTable.Type
        MDependency id_33915d34275811e2b500001ec947ccaf = new MDependency("33915d34-2758-11e2-b500-001ec947ccaf","Type","33915d38-2758-11e2-b500-001ec947ccaf.exml",this.mClass.get("PropertyTableDefinition"),true,false,false,false);
        this.mClass.get("TypedPropertyTable").getMDependencys().add(id_33915d34275811e2b500001ec947ccaf);

        // dependency MatrixDefinition.LinesDefinition
        MDependency id_1629bcf0dbc84d37b46d7b1572d1db88 = new MDependency("1629bcf0-dbc8-4d37-b46d-7b1572d1db88","LinesDefinition","ab9e51db-3809-4565-8a6e-358a513131b3.exml",this.mClass.get("QueryDefinition"),true,false,false,true);
        this.mClass.get("MatrixDefinition").getMDependencys().add(id_1629bcf0dbc84d37b46d7b1572d1db88);

        // dependency MatrixDefinition.ColumnsDefinition
        MDependency id_5596a0bb63f448259817f5eededc1b04 = new MDependency("5596a0bb-63f4-4825-9817-f5eededc1b04","ColumnsDefinition","ab9e51db-3809-4565-8a6e-358a513131b3.exml",this.mClass.get("QueryDefinition"),true,false,false,true);
        this.mClass.get("MatrixDefinition").getMDependencys().add(id_5596a0bb63f448259817f5eededc1b04);

        // dependency MatrixDefinition.ValuesDefinition
        MDependency id_62796268351744b9952db6dbce2eb726 = new MDependency("62796268-3517-44b9-952d-b6dbce2eb726","ValuesDefinition","ab9e51db-3809-4565-8a6e-358a513131b3.exml",this.mClass.get("MatrixValueDefinition"),true,false,false,true);
        this.mClass.get("MatrixDefinition").getMDependencys().add(id_62796268351744b9952db6dbce2eb726);

        // dependency MatrixDefinition.DepthDefinition
        MDependency id_04766632ed4a44b8a3ac03e991e27fbf = new MDependency("04766632-ed4a-44b8-a3ac-03e991e27fbf","DepthDefinition","ab9e51db-3809-4565-8a6e-358a513131b3.exml",this.mClass.get("QueryDefinition"),true,false,false,true);
        this.mClass.get("MatrixDefinition").getMDependencys().add(id_04766632ed4a44b8a3ac03e991e27fbf);

        // dependency MatrixDefinition.Owner
        MDependency id_49c42fb4231340b694a770918e83025f = new MDependency("49c42fb4-2313-40b6-94a7-70918e83025f","Owner","ab9e51db-3809-4565-8a6e-358a513131b3.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("MatrixDefinition").getMDependencys().add(id_49c42fb4231340b694a770918e83025f);

        // dependency QueryDefinition.Added
        MDependency id_803dfe2717a140d58e3ced3dd3a59210 = new MDependency("803dfe27-17a1-40d5-8e3c-ed3dd3a59210","Added","b4912da9-3315-4ac6-bd4a-4605abd30f4e.exml",this.mClass.get("Element"),false,false,false,false);
        this.mClass.get("QueryDefinition").getMDependencys().add(id_803dfe2717a140d58e3ced3dd3a59210);

        // dependency QueryDefinition.Processor
        MDependency id_09c74d3b4b7745f591c0187e5ab6dffd = new MDependency("09c74d3b-4b77-45f5-91c0-187e5ab6dffd","Processor","b4912da9-3315-4ac6-bd4a-4605abd30f4e.exml",this.mClass.get("ExternProcessor"),true,false,false,true);
        this.mClass.get("QueryDefinition").getMDependencys().add(id_09c74d3b4b7745f591c0187e5ab6dffd);

        // dependency QueryDefinition.Parameters
        MDependency id_730bd5889f334318ad1450e2712baf2b = new MDependency("730bd588-9f33-4318-ad14-50e2712baf2b","Parameters","b4912da9-3315-4ac6-bd4a-4605abd30f4e.exml",this.mClass.get("PropertyTable"),true,false,false,true);
        this.mClass.get("QueryDefinition").getMDependencys().add(id_730bd5889f334318ad1450e2712baf2b);

        // dependency QueryDefinition.OwnerAsLine
        MDependency id_f004c2c8a884423c81a6ab8cd9e0ee74 = new MDependency("f004c2c8-a884-423c-81a6-ab8cd9e0ee74","OwnerAsLine","b4912da9-3315-4ac6-bd4a-4605abd30f4e.exml",this.mClass.get("MatrixDefinition"),true,false,false,false);
        this.mClass.get("QueryDefinition").getMDependencys().add(id_f004c2c8a884423c81a6ab8cd9e0ee74);

        // dependency QueryDefinition.OwnerAsCol
        MDependency id_e684c4d001ce49238fbc67b755b63deb = new MDependency("e684c4d0-01ce-4923-8fbc-67b755b63deb","OwnerAsCol","b4912da9-3315-4ac6-bd4a-4605abd30f4e.exml",this.mClass.get("MatrixDefinition"),true,false,false,false);
        this.mClass.get("QueryDefinition").getMDependencys().add(id_e684c4d001ce49238fbc67b755b63deb);

        // dependency QueryDefinition.OwnerAsDepth
        MDependency id_563f26c2d59e4d70a7ffc732cfc1fa7b = new MDependency("563f26c2-d59e-4d70-a7ff-c732cfc1fa7b","OwnerAsDepth","b4912da9-3315-4ac6-bd4a-4605abd30f4e.exml",this.mClass.get("MatrixDefinition"),true,false,false,false);
        this.mClass.get("QueryDefinition").getMDependencys().add(id_563f26c2d59e4d70a7ffc732cfc1fa7b);

        // dependency MatrixValueDefinition.Processor
        MDependency id_6a0e6e5eb80f4f93b3f9d2231c838c60 = new MDependency("6a0e6e5e-b80f-4f93-b3f9-d2231c838c60","Processor","f6234e2d-afe8-4b42-8f26-87e416230908.exml",this.mClass.get("ExternProcessor"),true,false,false,true);
        this.mClass.get("MatrixValueDefinition").getMDependencys().add(id_6a0e6e5eb80f4f93b3f9d2231c838c60);

        // dependency MatrixValueDefinition.Parameters
        MDependency id_80ba83ca2a184dca9c13e44570e6ac65 = new MDependency("80ba83ca-2a18-4dca-9c13-e44570e6ac65","Parameters","f6234e2d-afe8-4b42-8f26-87e416230908.exml",this.mClass.get("PropertyTable"),true,false,false,true);
        this.mClass.get("MatrixValueDefinition").getMDependencys().add(id_80ba83ca2a184dca9c13e44570e6ac65);

        // dependency MatrixValueDefinition.Matrix
        MDependency id_a5b5b78a3af24f4fb08b4a9ff8f0030e = new MDependency("a5b5b78a-3af2-4f4f-b08b-4a9ff8f0030e","Matrix","f6234e2d-afe8-4b42-8f26-87e416230908.exml",this.mClass.get("MatrixDefinition"),true,false,false,false);
        this.mClass.get("MatrixValueDefinition").getMDependencys().add(id_a5b5b78a3af24f4fb08b4a9ff8f0030e);

        // dependency Artifact.Utilized
        MDependency id_0008152c00001c750000000000000000 = new MDependency("0008152c-0000-1c75-0000-000000000000","Utilized","0148033c-0000-0cea-0000-000000000000.exml",this.mClass.get("Manifestation"),false,false,false,true);
        this.mClass.get("Artifact").getMDependencys().add(id_0008152c00001c750000000000000000);

        // dependency Artifact.DeploymentLocation
        MDependency id_0148033c000197880000000000000000 = new MDependency("0148033c-0001-9788-0000-000000000000","DeploymentLocation","0148033c-0000-0cea-0000-000000000000.exml",this.mClass.get("Node"),false,false,false,false);
        this.mClass.get("Artifact").getMDependencys().add(id_0148033c000197880000000000000000);

        // dependency Association.Occurence
        MDependency id_ecd11d5243f54132a5731ef4de993b13 = new MDependency("ecd11d52-43f5-4132-a573-1ef4de993b13","Occurence","959e3d6c-c0ae-4ff8-a452-e5a33f0ca7f7.exml",this.mClass.get("Link"),false,false,false,false);
        this.mClass.get("Association").getMDependencys().add(id_ecd11d5243f54132a5731ef4de993b13);

        // dependency Association.End
        MDependency id_428df4dd80ce49b9ba9ddf8d4805968a = new MDependency("428df4dd-80ce-49b9-ba9d-df8d4805968a","End","959e3d6c-c0ae-4ff8-a452-e5a33f0ca7f7.exml",this.mClass.get("AssociationEnd"),false,false,false,false);
        this.mClass.get("Association").getMDependencys().add(id_428df4dd80ce49b9ba9ddf8d4805968a);

        // dependency Association.LinkToClass
        MDependency id_d1e166bf65d04b03a85af9ed483d0e36 = new MDependency("d1e166bf-65d0-4b03-a85a-f9ed483d0e36","LinkToClass","959e3d6c-c0ae-4ff8-a452-e5a33f0ca7f7.exml",this.mClass.get("ClassAssociation"),true,false,false,true);
        this.mClass.get("Association").getMDependencys().add(id_d1e166bf65d04b03a85af9ed483d0e36);

        // dependency AssociationEnd.Target
        MDependency id_0065c8ead1e01f43b54d001ec947cd2a = new MDependency("0065c8ea-d1e0-1f43-b54d-001ec947cd2a","Target","0148033c-0000-0cb6-0000-000000000000.exml",this.mClass.get("Classifier"),true,false,false,false);
        this.mClass.get("AssociationEnd").getMDependencys().add(id_0065c8ead1e01f43b54d001ec947cd2a);

        // dependency AssociationEnd.OppositeOwner
        MDependency id_0062208cd0e11f43b54d001ec947cd2a = new MDependency("0062208c-d0e1-1f43-b54d-001ec947cd2a","OppositeOwner","0148033c-0000-0cb6-0000-000000000000.exml",this.mClass.get("AssociationEnd"),true,false,false,false);
        this.mClass.get("AssociationEnd").getMDependencys().add(id_0062208cd0e11f43b54d001ec947cd2a);

        // dependency AssociationEnd.Source
        MDependency id_0007dc9ecd091f43b54d001ec947cd2a = new MDependency("0007dc9e-cd09-1f43-b54d-001ec947cd2a","Source","0148033c-0000-0cb6-0000-000000000000.exml",this.mClass.get("Classifier"),true,false,false,false);
        this.mClass.get("AssociationEnd").getMDependencys().add(id_0007dc9ecd091f43b54d001ec947cd2a);

        // dependency AssociationEnd.Occurence
        MDependency id_0008152c000020910000000000000000 = new MDependency("0008152c-0000-2091-0000-000000000000","Occurence","0148033c-0000-0cb6-0000-000000000000.exml",this.mClass.get("LinkEnd"),false,false,false,false);
        this.mClass.get("AssociationEnd").getMDependencys().add(id_0008152c000020910000000000000000);

        // dependency AssociationEnd.Sent
        MDependency id_0075a8dcd1911f43b54d001ec947cd2a = new MDependency("0075a8dc-d191-1f43-b54d-001ec947cd2a","Sent","0148033c-0000-0cb6-0000-000000000000.exml",this.mClass.get("InformationFlow"),false,false,false,false);
        this.mClass.get("AssociationEnd").getMDependencys().add(id_0075a8dcd1911f43b54d001ec947cd2a);

        // dependency AssociationEnd.Qualifier
        MDependency id_0148033c00018ac40000000000000000 = new MDependency("0148033c-0001-8ac4-0000-000000000000","Qualifier","0148033c-0000-0cb6-0000-000000000000.exml",this.mClass.get("Attribute"),false,false,false,true);
        this.mClass.get("AssociationEnd").getMDependencys().add(id_0148033c00018ac40000000000000000);

        // dependency AssociationEnd.Opposite
        MDependency id_00621b82d0e11f43b54d001ec947cd2a = new MDependency("00621b82-d0e1-1f43-b54d-001ec947cd2a","Opposite","0148033c-0000-0cb6-0000-000000000000.exml",this.mClass.get("AssociationEnd"),true,false,false,false);
        this.mClass.get("AssociationEnd").getMDependencys().add(id_00621b82d0e11f43b54d001ec947cd2a);

        // dependency AssociationEnd.RepresentingObjectNode
        MDependency id_00d012d80002eac40000000000000000 = new MDependency("00d012d8-0002-eac4-0000-000000000000","RepresentingObjectNode","0148033c-0000-0cb6-0000-000000000000.exml",this.mClass.get("ObjectNode"),false,false,false,false);
        this.mClass.get("AssociationEnd").getMDependencys().add(id_00d012d80002eac40000000000000000);

        // dependency AssociationEnd.Association
        MDependency id_e8d433a6e8a541a6a04db4b1d4e450e1 = new MDependency("e8d433a6-e8a5-41a6-a04d-b4b1d4e450e1","Association","0148033c-0000-0cb6-0000-000000000000.exml",this.mClass.get("Association"),true,false,false,false);
        this.mClass.get("AssociationEnd").getMDependencys().add(id_e8d433a6e8a541a6a04db4b1d4e450e1);

        // dependency AssociationEnd.RepresentingItem
        MDependency id_7f73f1e618d611e09cf7001ec947ccaf = new MDependency("7f73f1e6-18d6-11e0-9cf7-001ec947ccaf","RepresentingItem","0148033c-0000-0cb6-0000-000000000000.exml",this.mClass.get("BpmnItemAwareElement"),false,false,false,false);
        this.mClass.get("AssociationEnd").getMDependencys().add(id_7f73f1e618d611e09cf7001ec947ccaf);

        // dependency Attribute.Type
        MDependency id_0148033c00018e9e0000000000000000 = new MDependency("0148033c-0001-8e9e-0000-000000000000","Type","0148033c-0000-0cb2-0000-000000000000.exml",this.mClass.get("GeneralClass"),true,false,false,false);
        this.mClass.get("Attribute").getMDependencys().add(id_0148033c00018e9e0000000000000000);

        // dependency Attribute.Owner
        MDependency id_006e4e84cd3c1f43b54d001ec947cd2a = new MDependency("006e4e84-cd3c-1f43-b54d-001ec947cd2a","Owner","0148033c-0000-0cb2-0000-000000000000.exml",this.mClass.get("Classifier"),true,false,false,false);
        this.mClass.get("Attribute").getMDependencys().add(id_006e4e84cd3c1f43b54d001ec947cd2a);

        // dependency Attribute.Occurence
        MDependency id_0148033c00018e4a0000000000000000 = new MDependency("0148033c-0001-8e4a-0000-000000000000","Occurence","0148033c-0000-0cb2-0000-000000000000.exml",this.mClass.get("AttributeLink"),false,false,false,false);
        this.mClass.get("Attribute").getMDependencys().add(id_0148033c00018e4a0000000000000000);

        // dependency Attribute.RepresentingItem
        MDependency id_7f73f1e218d611e09cf7001ec947ccaf = new MDependency("7f73f1e2-18d6-11e0-9cf7-001ec947ccaf","RepresentingItem","0148033c-0000-0cb2-0000-000000000000.exml",this.mClass.get("BpmnItemAwareElement"),false,false,false,false);
        this.mClass.get("Attribute").getMDependencys().add(id_7f73f1e218d611e09cf7001ec947ccaf);

        // dependency Attribute.RepresentingObjectNode
        MDependency id_00d012d80002eab00000000000000000 = new MDependency("00d012d8-0002-eab0-0000-000000000000","RepresentingObjectNode","0148033c-0000-0cb2-0000-000000000000.exml",this.mClass.get("ObjectNode"),false,false,false,false);
        this.mClass.get("Attribute").getMDependencys().add(id_00d012d80002eab00000000000000000);

        // dependency Attribute.Qualified
        MDependency id_0148033c00018ac50000000000000000 = new MDependency("0148033c-0001-8ac5-0000-000000000000","Qualified","0148033c-0000-0cb2-0000-000000000000.exml",this.mClass.get("AssociationEnd"),true,false,false,false);
        this.mClass.get("Attribute").getMDependencys().add(id_0148033c00018ac50000000000000000);

        // dependency AttributeLink.Attributed
        MDependency id_0008152c000021550000000000000000 = new MDependency("0008152c-0000-2155-0000-000000000000","Attributed","0148033c-0000-0cc5-0000-000000000000.exml",this.mClass.get("Instance"),true,false,false,false);
        this.mClass.get("AttributeLink").getMDependencys().add(id_0008152c000021550000000000000000);

        // dependency AttributeLink.Base
        MDependency id_0148033c00018e4b0000000000000000 = new MDependency("0148033c-0001-8e4b-0000-000000000000","Base","0148033c-0000-0cc5-0000-000000000000.exml",this.mClass.get("Attribute"),true,false,false,false);
        this.mClass.get("AttributeLink").getMDependencys().add(id_0148033c00018e4b0000000000000000);

        // dependency BindableInstance.Cluster
        MDependency id_00281854000017610000000000000000 = new MDependency("00281854-0000-1761-0000-000000000000","Cluster","00281854-0000-175f-0000-000000000000.exml",this.mClass.get("Instance"),true,false,false,false);
        this.mClass.get("BindableInstance").getMDependencys().add(id_00281854000017610000000000000000);

        // dependency BindableInstance.InternalOwner
        MDependency id_002818540000176a0000000000000000 = new MDependency("00281854-0000-176a-0000-000000000000","InternalOwner","00281854-0000-175f-0000-000000000000.exml",this.mClass.get("Classifier"),true,false,false,false);
        this.mClass.get("BindableInstance").getMDependencys().add(id_002818540000176a0000000000000000);

        // dependency BindableInstance.Representation
        MDependency id_00281854000017a00000000000000000 = new MDependency("00281854-0000-17a0-0000-000000000000","Representation","00281854-0000-175f-0000-000000000000.exml",this.mClass.get("Binding"),false,false,false,false);
        this.mClass.get("BindableInstance").getMDependencys().add(id_00281854000017a00000000000000000);

        // dependency BindableInstance.RepresentedFeature
        MDependency id_00281854000017720000000000000000 = new MDependency("00281854-0000-1772-0000-000000000000","RepresentedFeature","00281854-0000-175f-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("BindableInstance").getMDependencys().add(id_00281854000017720000000000000000);

        // dependency Binding.ConnectorEndRole
        MDependency id_00281854000017d40000000000000000 = new MDependency("00281854-0000-17d4-0000-000000000000","ConnectorEndRole","0008152c-0000-1bad-0000-000000000000.exml",this.mClass.get("ConnectorEnd"),true,false,false,false);
        this.mClass.get("Binding").getMDependencys().add(id_00281854000017d40000000000000000);

        // dependency Binding.ConnectorRole
        MDependency id_00281854000017940000000000000000 = new MDependency("00281854-0000-1794-0000-000000000000","ConnectorRole","0008152c-0000-1bad-0000-000000000000.exml",this.mClass.get("NaryConnector"),true,false,false,false);
        this.mClass.get("Binding").getMDependencys().add(id_00281854000017940000000000000000);

        // dependency Binding.Role
        MDependency id_00281854000017a10000000000000000 = new MDependency("00281854-0000-17a1-0000-000000000000","Role","0008152c-0000-1bad-0000-000000000000.exml",this.mClass.get("BindableInstance"),true,false,false,false);
        this.mClass.get("Binding").getMDependencys().add(id_00281854000017a10000000000000000);

        // dependency Binding.RepresentedFeature
        MDependency id_0008152c00001c020000000000000000 = new MDependency("0008152c-0000-1c02-0000-000000000000","RepresentedFeature","0008152c-0000-1bad-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("Binding").getMDependencys().add(id_0008152c00001c020000000000000000);

        // dependency Binding.Owner
        MDependency id_0008152c00001c0f0000000000000000 = new MDependency("0008152c-0000-1c0f-0000-000000000000","Owner","0008152c-0000-1bad-0000-000000000000.exml",this.mClass.get("CollaborationUse"),true,false,false,false);
        this.mClass.get("Binding").getMDependencys().add(id_0008152c00001c0f0000000000000000);

        // dependency Class.LinkToAssociation
        MDependency id_0148033c000190290000000000000000 = new MDependency("0148033c-0001-9029-0000-000000000000","LinkToAssociation","0148033c-0000-0cae-0000-000000000000.exml",this.mClass.get("ClassAssociation"),true,false,false,false);
        this.mClass.get("Class").getMDependencys().add(id_0148033c000190290000000000000000);

        // dependency ClassAssociation.NaryAssociationPart
        MDependency id_c7953d92848311e1bccb001ec947ccaf = new MDependency("c7953d92-8483-11e1-bccb-001ec947ccaf","NaryAssociationPart","0148033c-0000-0cb7-0000-000000000000.exml",this.mClass.get("NaryAssociation"),true,false,false,false);
        this.mClass.get("ClassAssociation").getMDependencys().add(id_c7953d92848311e1bccb001ec947ccaf);

        // dependency ClassAssociation.ClassPart
        MDependency id_0148033c0001902a0000000000000000 = new MDependency("0148033c-0001-902a-0000-000000000000","ClassPart","0148033c-0000-0cb7-0000-000000000000.exml",this.mClass.get("Class"),true,false,false,false);
        this.mClass.get("ClassAssociation").getMDependencys().add(id_0148033c0001902a0000000000000000);

        // dependency ClassAssociation.AssociationPart
        MDependency id_f66271b6474c4d7db0bbc70de70d1905 = new MDependency("f66271b6-474c-4d7d-b0bb-c70de70d1905","AssociationPart","0148033c-0000-0cb7-0000-000000000000.exml",this.mClass.get("Association"),true,false,false,false);
        this.mClass.get("ClassAssociation").getMDependencys().add(id_f66271b6474c4d7db0bbc70de70d1905);

        // dependency Classifier.OwnedOperation
        MDependency id_006f857eccc21f43b54d001ec947cd2a = new MDependency("006f857e-ccc2-1f43-b54d-001ec947cd2a","OwnedOperation","0148033c-0000-0cac-0000-000000000000.exml",this.mClass.get("Operation"),false,false,false,true);
        this.mClass.get("Classifier").getMDependencys().add(id_006f857eccc21f43b54d001ec947cd2a);

        // dependency Classifier.Representation
        MDependency id_00d00f24000012d40000000000000000 = new MDependency("00d00f24-0000-12d4-0000-000000000000","Representation","0148033c-0000-0cac-0000-000000000000.exml",this.mClass.get("InformationItem"),false,false,false,false);
        this.mClass.get("Classifier").getMDependencys().add(id_00d00f24000012d40000000000000000);

        // dependency Classifier.Substitued
        MDependency id_0008152c00001d9e0000000000000000 = new MDependency("0008152c-0000-1d9e-0000-000000000000","Substitued","0148033c-0000-0cac-0000-000000000000.exml",this.mClass.get("Substitution"),false,false,false,true);
        this.mClass.get("Classifier").getMDependencys().add(id_0008152c00001d9e0000000000000000);

        // dependency Classifier.OwnedAttribute
        MDependency id_006e49accd3c1f43b54d001ec947cd2a = new MDependency("006e49ac-cd3c-1f43-b54d-001ec947cd2a","OwnedAttribute","0148033c-0000-0cac-0000-000000000000.exml",this.mClass.get("Attribute"),false,false,false,true);
        this.mClass.get("Classifier").getMDependencys().add(id_006e49accd3c1f43b54d001ec947cd2a);

        // dependency Classifier.OwnedNaryEnd
        MDependency id_00068632cdba1f43b54d001ec947cd2a = new MDependency("00068632-cdba-1f43-b54d-001ec947cd2a","OwnedNaryEnd","0148033c-0000-0cac-0000-000000000000.exml",this.mClass.get("NaryAssociationEnd"),false,false,false,true);
        this.mClass.get("Classifier").getMDependencys().add(id_00068632cdba1f43b54d001ec947cd2a);

        // dependency Classifier.Conveyer
        MDependency id_00d00f24000012cb0000000000000000 = new MDependency("00d00f24-0000-12cb-0000-000000000000","Conveyer","0148033c-0000-0cac-0000-000000000000.exml",this.mClass.get("InformationFlow"),false,false,false,false);
        this.mClass.get("Classifier").getMDependencys().add(id_00d00f24000012cb0000000000000000);

        // dependency Classifier.SubstitutingSubstitution
        MDependency id_0008152c00001da80000000000000000 = new MDependency("0008152c-0000-1da8-0000-000000000000","SubstitutingSubstitution","0148033c-0000-0cac-0000-000000000000.exml",this.mClass.get("Substitution"),false,false,false,false);
        this.mClass.get("Classifier").getMDependencys().add(id_0008152c00001da80000000000000000);

        // dependency Classifier.TargetingEnd
        MDependency id_0065c458d1e01f43b54d001ec947cd2a = new MDependency("0065c458-d1e0-1f43-b54d-001ec947cd2a","TargetingEnd","0148033c-0000-0cac-0000-000000000000.exml",this.mClass.get("AssociationEnd"),false,false,false,false);
        this.mClass.get("Classifier").getMDependencys().add(id_0065c458d1e01f43b54d001ec947cd2a);

        // dependency Classifier.OwnedEnd
        MDependency id_0007d80ccd091f43b54d001ec947cd2a = new MDependency("0007d80c-cd09-1f43-b54d-001ec947cd2a","OwnedEnd","0148033c-0000-0cac-0000-000000000000.exml",this.mClass.get("AssociationEnd"),false,false,false,true);
        this.mClass.get("Classifier").getMDependencys().add(id_0007d80ccd091f43b54d001ec947cd2a);

        // dependency Classifier.BpmnRepresents
        MDependency id_7f73f1d518d611e09cf7001ec947ccaf = new MDependency("7f73f1d5-18d6-11e0-9cf7-001ec947ccaf","BpmnRepresents","0148033c-0000-0cac-0000-000000000000.exml",this.mClass.get("BpmnParticipant"),false,false,false,false);
        this.mClass.get("Classifier").getMDependencys().add(id_7f73f1d518d611e09cf7001ec947ccaf);

        // dependency Classifier.Throwing
        MDependency id_0014116000000cbf0000000000000000 = new MDependency("00141160-0000-0cbf-0000-000000000000","Throwing","0148033c-0000-0cac-0000-000000000000.exml",this.mClass.get("RaisedException"),false,false,false,false);
        this.mClass.get("Classifier").getMDependencys().add(id_0014116000000cbf0000000000000000);

        // dependency Classifier.InternalStructure
        MDependency id_002818540000176c0000000000000000 = new MDependency("00281854-0000-176c-0000-000000000000","InternalStructure","0148033c-0000-0cac-0000-000000000000.exml",this.mClass.get("BindableInstance"),false,false,false,true);
        this.mClass.get("Classifier").getMDependencys().add(id_002818540000176c0000000000000000);

        // dependency Classifier.RealizedComponent
        MDependency id_0493ae3b38084c94a443e1b2961ffde1 = new MDependency("0493ae3b-3808-4c94-a443-e1b2961ffde1","RealizedComponent","0148033c-0000-0cac-0000-000000000000.exml",this.mClass.get("ComponentRealization"),false,false,false,false);
        this.mClass.get("Classifier").getMDependencys().add(id_0493ae3b38084c94a443e1b2961ffde1);

        // dependency Collaboration.ORepresented
        MDependency id_0148033c000195e10000000000000000 = new MDependency("0148033c-0001-95e1-0000-000000000000","ORepresented","0148033c-0000-0cc0-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("Collaboration").getMDependencys().add(id_0148033c000195e10000000000000000);

        // dependency Collaboration.BRepresented
        MDependency id_00d012d80002f7aa0000000000000000 = new MDependency("00d012d8-0002-f7aa-0000-000000000000","BRepresented","0148033c-0000-0cc0-0000-000000000000.exml",this.mClass.get("Behavior"),true,false,false,false);
        this.mClass.get("Collaboration").getMDependencys().add(id_00d012d80002f7aa0000000000000000);

        // dependency Collaboration.Occurrence
        MDependency id_0008152c00001cfe0000000000000000 = new MDependency("0008152c-0000-1cfe-0000-000000000000","Occurrence","0148033c-0000-0cc0-0000-000000000000.exml",this.mClass.get("CollaborationUse"),false,false,false,false);
        this.mClass.get("Collaboration").getMDependencys().add(id_0008152c00001cfe0000000000000000);

        // dependency CollaborationUse.Type
        MDependency id_0008152c00001cfd0000000000000000 = new MDependency("0008152c-0000-1cfd-0000-000000000000","Type","0008152c-0000-1bae-0000-000000000000.exml",this.mClass.get("Collaboration"),true,false,false,false);
        this.mClass.get("CollaborationUse").getMDependencys().add(id_0008152c00001cfd0000000000000000);

        // dependency CollaborationUse.NRepresented
        MDependency id_0008152c00001d100000000000000000 = new MDependency("0008152c-0000-1d10-0000-000000000000","NRepresented","0008152c-0000-1bae-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("CollaborationUse").getMDependencys().add(id_0008152c00001d100000000000000000);

        // dependency CollaborationUse.ORepresented
        MDependency id_0008152c00001d070000000000000000 = new MDependency("0008152c-0000-1d07-0000-000000000000","ORepresented","0008152c-0000-1bae-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("CollaborationUse").getMDependencys().add(id_0008152c00001d070000000000000000);

        // dependency CollaborationUse.RoleBinding
        MDependency id_0008152c00001c0e0000000000000000 = new MDependency("0008152c-0000-1c0e-0000-000000000000","RoleBinding","0008152c-0000-1bae-0000-000000000000.exml",this.mClass.get("Binding"),false,false,false,true);
        this.mClass.get("CollaborationUse").getMDependencys().add(id_0008152c00001c0e0000000000000000);

        // dependency Component.Realization
        MDependency id_0d18c6f5032d448182b8dde2259b570d = new MDependency("0d18c6f5-032d-4481-82b8-dde2259b570d","Realization","0008152c-0000-1baf-0000-000000000000.exml",this.mClass.get("ComponentRealization"),false,false,false,true);
        this.mClass.get("Component").getMDependencys().add(id_0d18c6f5032d448182b8dde2259b570d);

        // dependency ComponentRealization.RealizingClassifier
        MDependency id_6a9cfa801ccf4170b8042345910888ee = new MDependency("6a9cfa80-1ccf-4170-b804-2345910888ee","RealizingClassifier","813e41d6-6d96-4965-8e07-5d93eddfc0e8.exml",this.mClass.get("Classifier"),true,false,false,false);
        this.mClass.get("ComponentRealization").getMDependencys().add(id_6a9cfa801ccf4170b8042345910888ee);

        // dependency ComponentRealization.Abstraction
        MDependency id_9bf09eb2b3394186beaba41bde2a7d23 = new MDependency("9bf09eb2-b339-4186-beab-a41bde2a7d23","Abstraction","813e41d6-6d96-4965-8e07-5d93eddfc0e8.exml",this.mClass.get("Component"),true,false,false,false);
        this.mClass.get("ComponentRealization").getMDependencys().add(id_9bf09eb2b3394186beaba41bde2a7d23);

        // dependency ConnectorEnd.Representation
        MDependency id_00281854000017d30000000000000000 = new MDependency("00281854-0000-17d3-0000-000000000000","Representation","00281854-0000-17c6-0000-000000000000.exml",this.mClass.get("Binding"),false,false,false,false);
        this.mClass.get("ConnectorEnd").getMDependencys().add(id_00281854000017d30000000000000000);

        // dependency ConnectorEnd.RepresentedFeature
        MDependency id_00281854000017c80000000000000000 = new MDependency("00281854-0000-17c8-0000-000000000000","RepresentedFeature","00281854-0000-17c6-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("ConnectorEnd").getMDependencys().add(id_00281854000017c80000000000000000);

        // dependency ElementImport.ImportingNameSpace
        MDependency id_0008152c00001d370000000000000000 = new MDependency("0008152c-0000-1d37-0000-000000000000","ImportingNameSpace","0008152c-0000-1bb0-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("ElementImport").getMDependencys().add(id_0008152c00001d370000000000000000);

        // dependency ElementImport.ImportedElement
        MDependency id_0008152c00001d2d0000000000000000 = new MDependency("0008152c-0000-1d2d-0000-000000000000","ImportedElement","0008152c-0000-1bb0-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("ElementImport").getMDependencys().add(id_0008152c00001d2d0000000000000000);

        // dependency ElementImport.ImportingOperation
        MDependency id_0008152c00001fc40000000000000000 = new MDependency("0008152c-0000-1fc4-0000-000000000000","ImportingOperation","0008152c-0000-1bb0-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("ElementImport").getMDependencys().add(id_0008152c00001fc40000000000000000);

        // dependency Enumeration.Value
        MDependency id_0148033c00019ca90000000000000000 = new MDependency("0148033c-0001-9ca9-0000-000000000000","Value","0148033c-0000-0cb0-0000-000000000000.exml",this.mClass.get("EnumerationLiteral"),false,false,false,true);
        this.mClass.get("Enumeration").getMDependencys().add(id_0148033c00019ca90000000000000000);

        // dependency Enumeration.OccurenceConfigParam
        MDependency id_1e6293cd43a511deb107001ec947ccaf = new MDependency("1e6293cd-43a5-11de-b107-001ec947ccaf","OccurenceConfigParam","0148033c-0000-0cb0-0000-000000000000.exml",this.mClass.get("ModuleParameter"),false,false,false,false);
        this.mClass.get("Enumeration").getMDependencys().add(id_1e6293cd43a511deb107001ec947ccaf);

        // dependency EnumerationLiteral.Valuated
        MDependency id_0148033c00019caa0000000000000000 = new MDependency("0148033c-0001-9caa-0000-000000000000","Valuated","0148033c-0000-0cbb-0000-000000000000.exml",this.mClass.get("Enumeration"),true,false,false,false);
        this.mClass.get("EnumerationLiteral").getMDependencys().add(id_0148033c00019caa0000000000000000);

        // dependency GeneralClass.BpmnInterfaceRefs
        MDependency id_7f73f21818d611e09cf7001ec947ccaf = new MDependency("7f73f218-18d6-11e0-9cf7-001ec947ccaf","BpmnInterfaceRefs","0148033c-0000-0cad-0000-000000000000.exml",this.mClass.get("BpmnInterface"),false,false,false,false);
        this.mClass.get("GeneralClass").getMDependencys().add(id_7f73f21818d611e09cf7001ec947ccaf);

        // dependency GeneralClass.Occurence
        MDependency id_0148033c00019f3c0000000000000000 = new MDependency("0148033c-0001-9f3c-0000-000000000000","Occurence","0148033c-0000-0cad-0000-000000000000.exml",this.mClass.get("Parameter"),false,false,false,false);
        this.mClass.get("GeneralClass").getMDependencys().add(id_0148033c00019f3c0000000000000000);

        // dependency GeneralClass.ExceptionInput
        MDependency id_af42d492f87e11dfa2c5001ec947ccaf = new MDependency("af42d492-f87e-11df-a2c5-001ec947ccaf","ExceptionInput","0148033c-0000-0cad-0000-000000000000.exml",this.mClass.get("ExceptionHandler"),true,false,false,false);
        this.mClass.get("GeneralClass").getMDependencys().add(id_af42d492f87e11dfa2c5001ec947ccaf);

        // dependency GeneralClass.Object
        MDependency id_0148033c00018e9f0000000000000000 = new MDependency("0148033c-0001-8e9f-0000-000000000000","Object","0148033c-0000-0cad-0000-000000000000.exml",this.mClass.get("Attribute"),false,false,false,false);
        this.mClass.get("GeneralClass").getMDependencys().add(id_0148033c00018e9f0000000000000000);

        // dependency GeneralClass.BpmnMessageRefs
        MDependency id_24aa38affbc811e086b2001ec947ccaf = new MDependency("24aa38af-fbc8-11e0-86b2-001ec947ccaf","BpmnMessageRefs","0148033c-0000-0cad-0000-000000000000.exml",this.mClass.get("BpmnMessage"),false,false,false,false);
        this.mClass.get("GeneralClass").getMDependencys().add(id_24aa38affbc811e086b2001ec947ccaf);

        // dependency GeneralClass.SRepresentation
        MDependency id_0148033c00019f420000000000000000 = new MDependency("0148033c-0001-9f42-0000-000000000000","SRepresentation","0148033c-0000-0cad-0000-000000000000.exml",this.mClass.get("Signal"),false,false,false,false);
        this.mClass.get("GeneralClass").getMDependencys().add(id_0148033c00019f420000000000000000);

        // dependency GeneralClass.BpmnItemDefinitionRefs
        MDependency id_7f73f21718d611e09cf7001ec947ccaf = new MDependency("7f73f217-18d6-11e0-9cf7-001ec947ccaf","BpmnItemDefinitionRefs","0148033c-0000-0cad-0000-000000000000.exml",this.mClass.get("BpmnItemDefinition"),false,false,false,false);
        this.mClass.get("GeneralClass").getMDependencys().add(id_7f73f21718d611e09cf7001ec947ccaf);

        // dependency GeneralClass.OccurenceObjectNode
        MDependency id_00d00f2400000c900000000000000000 = new MDependency("00d00f24-0000-0c90-0000-000000000000","OccurenceObjectNode","0148033c-0000-0cad-0000-000000000000.exml",this.mClass.get("ObjectNode"),false,false,false,false);
        this.mClass.get("GeneralClass").getMDependencys().add(id_00d00f2400000c900000000000000000);

        // dependency GeneralClass.BpmnItemAwareRefs
        MDependency id_5fb6c047fbc711e086b2001ec947ccaf = new MDependency("5fb6c047-fbc7-11e0-86b2-001ec947ccaf","BpmnItemAwareRefs","0148033c-0000-0cad-0000-000000000000.exml",this.mClass.get("BpmnItemAwareElement"),false,false,false,false);
        this.mClass.get("GeneralClass").getMDependencys().add(id_5fb6c047fbc711e086b2001ec947ccaf);

        // dependency Generalization.SuperType
        MDependency id_0148033c0001a0860000000000000000 = new MDependency("0148033c-0001-a086-0000-000000000000","SuperType","0148033c-0000-0cb8-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("Generalization").getMDependencys().add(id_0148033c0001a0860000000000000000);

        // dependency Generalization.SubType
        MDependency id_0148033c0001a08a0000000000000000 = new MDependency("0148033c-0001-a08a-0000-000000000000","SubType","0148033c-0000-0cb8-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("Generalization").getMDependencys().add(id_0148033c0001a08a0000000000000000);

        // dependency Instance.RepresentedCommunicationNode
        MDependency id_01ec00cc00172b790000000000000000 = new MDependency("01ec00cc-0017-2b79-0000-000000000000","RepresentedCommunicationNode","0148033c-0000-0cc3-0000-000000000000.exml",this.mClass.get("CommunicationNode"),false,false,false,false);
        this.mClass.get("Instance").getMDependencys().add(id_01ec00cc00172b790000000000000000);

        // dependency Instance.RepresentingItem
        MDependency id_7f73f1f018d611e09cf7001ec947ccaf = new MDependency("7f73f1f0-18d6-11e0-9cf7-001ec947ccaf","RepresentingItem","0148033c-0000-0cc3-0000-000000000000.exml",this.mClass.get("BpmnItemAwareElement"),false,false,false,false);
        this.mClass.get("Instance").getMDependencys().add(id_7f73f1f018d611e09cf7001ec947ccaf);

        // dependency Instance.OwnedEnd
        MDependency id_0008152c000020a30000000000000000 = new MDependency("0008152c-0000-20a3-0000-000000000000","OwnedEnd","0148033c-0000-0cc3-0000-000000000000.exml",this.mClass.get("LinkEnd"),false,false,false,true);
        this.mClass.get("Instance").getMDependencys().add(id_0008152c000020a30000000000000000);

        // dependency Instance.Base
        MDependency id_0008152c000021360000000000000000 = new MDependency("0008152c-0000-2136-0000-000000000000","Base","0148033c-0000-0cc3-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("Instance").getMDependencys().add(id_0008152c000021360000000000000000);

        // dependency Instance.RepresentingObjectNode
        MDependency id_00d0113800035f2b0000000000000000 = new MDependency("00d01138-0003-5f2b-0000-000000000000","RepresentingObjectNode","0148033c-0000-0cc3-0000-000000000000.exml",this.mClass.get("ObjectNode"),false,false,false,false);
        this.mClass.get("Instance").getMDependencys().add(id_00d0113800035f2b0000000000000000);

        // dependency Instance.Owner
        MDependency id_0148033c0001a1290000000000000000 = new MDependency("0148033c-0001-a129-0000-000000000000","Owner","0148033c-0000-0cc3-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("Instance").getMDependencys().add(id_0148033c0001a1290000000000000000);

        // dependency Instance.OwnedNaryEnd
        MDependency id_0013a0c4131a10a188a0001ec947cd2a = new MDependency("0013a0c4-131a-10a1-88a0-001ec947cd2a","OwnedNaryEnd","0148033c-0000-0cc3-0000-000000000000.exml",this.mClass.get("NaryLinkEnd"),false,false,false,true);
        this.mClass.get("Instance").getMDependencys().add(id_0013a0c4131a10a188a0001ec947cd2a);

        // dependency Instance.RepresentedLifeLine
        MDependency id_00d00f24000010980000000000000000 = new MDependency("00d00f24-0000-1098-0000-000000000000","RepresentedLifeLine","0148033c-0000-0cc3-0000-000000000000.exml",this.mClass.get("Lifeline"),false,false,false,false);
        this.mClass.get("Instance").getMDependencys().add(id_00d00f24000010980000000000000000);

        // dependency Instance.Slot
        MDependency id_0008152c0000214f0000000000000000 = new MDependency("0008152c-0000-214f-0000-000000000000","Slot","0148033c-0000-0cc3-0000-000000000000.exml",this.mClass.get("AttributeLink"),false,false,false,true);
        this.mClass.get("Instance").getMDependencys().add(id_0008152c0000214f0000000000000000);

        // dependency Instance.Part
        MDependency id_00281854000017630000000000000000 = new MDependency("00281854-0000-1763-0000-000000000000","Part","0148033c-0000-0cc3-0000-000000000000.exml",this.mClass.get("BindableInstance"),false,false,false,true);
        this.mClass.get("Instance").getMDependencys().add(id_00281854000017630000000000000000);

        // dependency Instance.TargetingEnd
        MDependency id_0097e582d4ed1f43b54d001ec947cd2a = new MDependency("0097e582-d4ed-1f43-b54d-001ec947cd2a","TargetingEnd","0148033c-0000-0cc3-0000-000000000000.exml",this.mClass.get("LinkEnd"),false,false,false,false);
        this.mClass.get("Instance").getMDependencys().add(id_0097e582d4ed1f43b54d001ec947cd2a);

        // dependency Interface.Requiring
        MDependency id_0014116000000c840000000000000000 = new MDependency("00141160-0000-0c84-0000-000000000000","Requiring","0008152c-0000-1bba-0000-000000000000.exml",this.mClass.get("RequiredInterface"),false,false,false,false);
        this.mClass.get("Interface").getMDependencys().add(id_0014116000000c840000000000000000);

        // dependency Interface.ImplementedLink
        MDependency id_0014116000000d5e0000000000000000 = new MDependency("00141160-0000-0d5e-0000-000000000000","ImplementedLink","0008152c-0000-1bba-0000-000000000000.exml",this.mClass.get("InterfaceRealization"),false,false,false,false);
        this.mClass.get("Interface").getMDependencys().add(id_0014116000000d5e0000000000000000);

        // dependency Interface.Providing
        MDependency id_0014116000000c8e0000000000000000 = new MDependency("00141160-0000-0c8e-0000-000000000000","Providing","0008152c-0000-1bba-0000-000000000000.exml",this.mClass.get("ProvidedInterface"),false,false,false,false);
        this.mClass.get("Interface").getMDependencys().add(id_0014116000000c8e0000000000000000);

        // dependency InterfaceRealization.Implemented
        MDependency id_0014116000000d620000000000000000 = new MDependency("00141160-0000-0d62-0000-000000000000","Implemented","0148033c-0000-0cbd-0000-000000000000.exml",this.mClass.get("Interface"),true,false,false,false);
        this.mClass.get("InterfaceRealization").getMDependencys().add(id_0014116000000d620000000000000000);

        // dependency InterfaceRealization.Implementer
        MDependency id_0148033c0001aa670000000000000000 = new MDependency("0148033c-0001-aa67-0000-000000000000","Implementer","0148033c-0000-0cbd-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("InterfaceRealization").getMDependencys().add(id_0148033c0001aa670000000000000000);

        // dependency Link.Model
        MDependency id_b38d4cfada584c78877d8efe97b13bf1 = new MDependency("b38d4cfa-da58-4c78-877d-8efe97b13bf1","Model","98d3241e-2d38-40dd-bbcb-3c1e7c513035.exml",this.mClass.get("Association"),true,false,false,false);
        this.mClass.get("Link").getMDependencys().add(id_b38d4cfada584c78877d8efe97b13bf1);

        // dependency Link.LinkEnd
        MDependency id_72cf334c0c9c43b7b54eb4128b1af901 = new MDependency("72cf334c-0c9c-43b7-b54e-b4128b1af901","LinkEnd","98d3241e-2d38-40dd-bbcb-3c1e7c513035.exml",this.mClass.get("LinkEnd"),false,false,false,false);
        this.mClass.get("Link").getMDependencys().add(id_72cf334c0c9c43b7b54eb4128b1af901);

        // dependency Link.Sent
        MDependency id_ce0347f79fd74941a6dfab9ba5775d7d = new MDependency("ce0347f7-9fd7-4941-a6df-ab9ba5775d7d","Sent","98d3241e-2d38-40dd-bbcb-3c1e7c513035.exml",this.mClass.get("CommunicationChannel"),true,false,false,false);
        this.mClass.get("Link").getMDependencys().add(id_ce0347f79fd74941a6dfab9ba5775d7d);

        // dependency LinkEnd.Link
        MDependency id_dfcf451f19724d19bed15f860912c5c9 = new MDependency("dfcf451f-1972-4d19-bed1-5f860912c5c9","Link","0148033c-0000-0ccc-0000-000000000000.exml",this.mClass.get("Link"),true,false,false,false);
        this.mClass.get("LinkEnd").getMDependencys().add(id_dfcf451f19724d19bed15f860912c5c9);

        // dependency LinkEnd.Target
        MDependency id_0097df4cd4ed1f43b54d001ec947cd2a = new MDependency("0097df4c-d4ed-1f43-b54d-001ec947cd2a","Target","0148033c-0000-0ccc-0000-000000000000.exml",this.mClass.get("Instance"),true,false,false,false);
        this.mClass.get("LinkEnd").getMDependencys().add(id_0097df4cd4ed1f43b54d001ec947cd2a);

        // dependency LinkEnd.OppositeOwner
        MDependency id_0055f938d4b41f43b54d001ec947cd2a = new MDependency("0055f938-d4b4-1f43-b54d-001ec947cd2a","OppositeOwner","0148033c-0000-0ccc-0000-000000000000.exml",this.mClass.get("LinkEnd"),true,false,false,false);
        this.mClass.get("LinkEnd").getMDependencys().add(id_0055f938d4b41f43b54d001ec947cd2a);

        // dependency LinkEnd.RealizedInformationFlow
        MDependency id_00d00f24000012a10000000000000000 = new MDependency("00d00f24-0000-12a1-0000-000000000000","RealizedInformationFlow","0148033c-0000-0ccc-0000-000000000000.exml",this.mClass.get("InformationFlow"),false,false,false,false);
        this.mClass.get("LinkEnd").getMDependencys().add(id_00d00f24000012a10000000000000000);

        // dependency LinkEnd.Model
        MDependency id_0008152c0000208f0000000000000000 = new MDependency("0008152c-0000-208f-0000-000000000000","Model","0148033c-0000-0ccc-0000-000000000000.exml",this.mClass.get("AssociationEnd"),true,false,false,false);
        this.mClass.get("LinkEnd").getMDependencys().add(id_0008152c0000208f0000000000000000);

        // dependency LinkEnd.Consumer
        MDependency id_00281324000000560000000000000000 = new MDependency("00281324-0000-0056-0000-000000000000","Consumer","0148033c-0000-0ccc-0000-000000000000.exml",this.mClass.get("RequiredInterface"),true,false,false,false);
        this.mClass.get("LinkEnd").getMDependencys().add(id_00281324000000560000000000000000);

        // dependency LinkEnd.Opposite
        MDependency id_0055f2e4d4b41f43b54d001ec947cd2a = new MDependency("0055f2e4-d4b4-1f43-b54d-001ec947cd2a","Opposite","0148033c-0000-0ccc-0000-000000000000.exml",this.mClass.get("LinkEnd"),true,false,false,false);
        this.mClass.get("LinkEnd").getMDependencys().add(id_0055f2e4d4b41f43b54d001ec947cd2a);

        // dependency LinkEnd.Source
        MDependency id_0008152c000020ae0000000000000000 = new MDependency("0008152c-0000-20ae-0000-000000000000","Source","0148033c-0000-0ccc-0000-000000000000.exml",this.mClass.get("Instance"),true,false,false,false);
        this.mClass.get("LinkEnd").getMDependencys().add(id_0008152c000020ae0000000000000000);

        // dependency LinkEnd.Provider
        MDependency id_00281324000000250000000000000000 = new MDependency("00281324-0000-0025-0000-000000000000","Provider","0148033c-0000-0ccc-0000-000000000000.exml",this.mClass.get("ProvidedInterface"),true,false,false,false);
        this.mClass.get("LinkEnd").getMDependencys().add(id_00281324000000250000000000000000);

        // dependency Manifestation.UtilizedElement
        MDependency id_0008152c00001c7e0000000000000000 = new MDependency("0008152c-0000-1c7e-0000-000000000000","UtilizedElement","0008152c-0000-1bb6-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("Manifestation").getMDependencys().add(id_0008152c00001c7e0000000000000000);

        // dependency Manifestation.Owner
        MDependency id_0008152c00001c760000000000000000 = new MDependency("0008152c-0000-1c76-0000-000000000000","Owner","0008152c-0000-1bb6-0000-000000000000.exml",this.mClass.get("Artifact"),true,false,false,false);
        this.mClass.get("Manifestation").getMDependencys().add(id_0008152c00001c760000000000000000);

        // dependency NameSpace.Parent
        MDependency id_0148033c0001a08b0000000000000000 = new MDependency("0148033c-0001-a08b-0000-000000000000","Parent","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("Generalization"),false,false,false,true);
        this.mClass.get("NameSpace").getMDependencys().add(id_0148033c0001a08b0000000000000000);

        // dependency NameSpace.TemplateInstanciation
        MDependency id_0008152c00001dd00000000000000000 = new MDependency("0008152c-0000-1dd0-0000-000000000000","TemplateInstanciation","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("TemplateBinding"),false,false,false,true);
        this.mClass.get("NameSpace").getMDependencys().add(id_0008152c00001dd00000000000000000);

        // dependency NameSpace.Representing
        MDependency id_0008152c000021400000000000000000 = new MDependency("0008152c-0000-2140-0000-000000000000","Representing","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("Instance"),false,false,false,false);
        this.mClass.get("NameSpace").getMDependencys().add(id_0008152c000021400000000000000000);

        // dependency NameSpace.OwnedBehavior
        MDependency id_0148033c0001a1fc0000000000000000 = new MDependency("0148033c-0001-a1fc-0000-000000000000","OwnedBehavior","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("Behavior"),false,false,false,true);
        this.mClass.get("NameSpace").getMDependencys().add(id_0148033c0001a1fc0000000000000000);

        // dependency NameSpace.Received
        MDependency id_0148033c00019a0f0000000000000000 = new MDependency("0148033c-0001-9a0f-0000-000000000000","Received","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("DataFlow"),false,false,false,false);
        this.mClass.get("NameSpace").getMDependencys().add(id_0148033c00019a0f0000000000000000);

        // dependency NameSpace.UsedNsu
        MDependency id_002818540000043a0000000000000000 = new MDependency("00281854-0000-043a-0000-000000000000","UsedNsu","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("NamespaceUse"),false,false,false,false);
        this.mClass.get("NameSpace").getMDependencys().add(id_002818540000043a0000000000000000);

        // dependency NameSpace.OwnedInformationFlow
        MDependency id_00d00f24000012f40000000000000000 = new MDependency("00d00f24-0000-12f4-0000-000000000000","OwnedInformationFlow","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("InformationFlow"),false,false,false,true);
        this.mClass.get("NameSpace").getMDependencys().add(id_00d00f24000012f40000000000000000);

        // dependency NameSpace.Importing
        MDependency id_0008152c00001d2e0000000000000000 = new MDependency("0008152c-0000-1d2e-0000-000000000000","Importing","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("ElementImport"),false,false,false,false);
        this.mClass.get("NameSpace").getMDependencys().add(id_0008152c00001d2e0000000000000000);

        // dependency NameSpace.Sent
        MDependency id_0148033c000199b30000000000000000 = new MDependency("0148033c-0001-99b3-0000-000000000000","Sent","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("DataFlow"),false,false,false,false);
        this.mClass.get("NameSpace").getMDependencys().add(id_0148033c000199b30000000000000000);

        // dependency NameSpace.OwnedDataFlow
        MDependency id_0148033c000199af0000000000000000 = new MDependency("0148033c-0001-99af-0000-000000000000","OwnedDataFlow","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("DataFlow"),false,false,false,true);
        this.mClass.get("NameSpace").getMDependencys().add(id_0148033c000199af0000000000000000);

        // dependency NameSpace.OwnedCollaborationUse
        MDependency id_0008152c00001d0f0000000000000000 = new MDependency("0008152c-0000-1d0f-0000-000000000000","OwnedCollaborationUse","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("CollaborationUse"),false,false,false,true);
        this.mClass.get("NameSpace").getMDependencys().add(id_0008152c00001d0f0000000000000000);

        // dependency NameSpace.OwnedPackageImport
        MDependency id_0008152c00001d450000000000000000 = new MDependency("0008152c-0000-1d45-0000-000000000000","OwnedPackageImport","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("PackageImport"),false,false,false,true);
        this.mClass.get("NameSpace").getMDependencys().add(id_0008152c00001d450000000000000000);

        // dependency NameSpace.Template
        MDependency id_0008152c00001f9b0000000000000000 = new MDependency("0008152c-0000-1f9b-0000-000000000000","Template","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("TemplateParameter"),false,false,false,true);
        this.mClass.get("NameSpace").getMDependencys().add(id_0008152c00001f9b0000000000000000);

        // dependency NameSpace.Specialization
        MDependency id_0148033c0001a0870000000000000000 = new MDependency("0148033c-0001-a087-0000-000000000000","Specialization","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("Generalization"),false,false,false,false);
        this.mClass.get("NameSpace").getMDependencys().add(id_0148033c0001a0870000000000000000);

        // dependency NameSpace.Realized
        MDependency id_0148033c0001aa660000000000000000 = new MDependency("0148033c-0001-aa66-0000-000000000000","Realized","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("InterfaceRealization"),false,false,false,true);
        this.mClass.get("NameSpace").getMDependencys().add(id_0148033c0001aa660000000000000000);

        // dependency NameSpace.Declared
        MDependency id_0148033c0001a12a0000000000000000 = new MDependency("0148033c-0001-a12a-0000-000000000000","Declared","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("Instance"),false,false,false,true);
        this.mClass.get("NameSpace").getMDependencys().add(id_0148033c0001a12a0000000000000000);

        // dependency NameSpace.InstanciatingBinding
        MDependency id_0008152c00001dda0000000000000000 = new MDependency("0008152c-0000-1dda-0000-000000000000","InstanciatingBinding","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("TemplateBinding"),false,false,false,false);
        this.mClass.get("NameSpace").getMDependencys().add(id_0008152c00001dda0000000000000000);

        // dependency NameSpace.OwnedImport
        MDependency id_0008152c00001d360000000000000000 = new MDependency("0008152c-0000-1d36-0000-000000000000","OwnedImport","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("ElementImport"),false,false,false,true);
        this.mClass.get("NameSpace").getMDependencys().add(id_0008152c00001d360000000000000000);

        // dependency NameSpace.UserNsu
        MDependency id_00281854000004340000000000000000 = new MDependency("00281854-0000-0434-0000-000000000000","UserNsu","0148033c-0000-0caa-0000-000000000000.exml",this.mClass.get("NamespaceUse"),false,false,false,false);
        this.mClass.get("NameSpace").getMDependencys().add(id_00281854000004340000000000000000);

        // dependency NamespaceUse.User
        MDependency id_00281854000004380000000000000000 = new MDependency("00281854-0000-0438-0000-000000000000","User","00281854-0000-040b-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("NamespaceUse").getMDependencys().add(id_00281854000004380000000000000000);

        // dependency NamespaceUse.Used
        MDependency id_002818540000042d0000000000000000 = new MDependency("00281854-0000-042d-0000-000000000000","Used","00281854-0000-040b-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("NamespaceUse").getMDependencys().add(id_002818540000042d0000000000000000);

        // dependency NamespaceUse.Cause
        MDependency id_00281854000004a40000000000000000 = new MDependency("00281854-0000-04a4-0000-000000000000","Cause","00281854-0000-040b-0000-000000000000.exml",this.mClass.get("Element"),false,false,false,false);
        this.mClass.get("NamespaceUse").getMDependencys().add(id_00281854000004a40000000000000000);

        // dependency NaryAssociationEnd.NaryAssociation
        MDependency id_007bbb6ed08c1f43b54d001ec947cd2a = new MDependency("007bbb6e-d08c-1f43-b54d-001ec947cd2a","NaryAssociation","0006801a-cc2c-1f43-b54d-001ec947cd2a.exml",this.mClass.get("NaryAssociation"),true,false,false,false);
        this.mClass.get("NaryAssociationEnd").getMDependencys().add(id_007bbb6ed08c1f43b54d001ec947cd2a);

        // dependency NaryAssociationEnd.Owner
        MDependency id_00068b0acdba1f43b54d001ec947cd2a = new MDependency("00068b0a-cdba-1f43-b54d-001ec947cd2a","Owner","0006801a-cc2c-1f43-b54d-001ec947cd2a.exml",this.mClass.get("Classifier"),true,false,false,false);
        this.mClass.get("NaryAssociationEnd").getMDependencys().add(id_00068b0acdba1f43b54d001ec947cd2a);

        // dependency NaryAssociation.Occurence
        MDependency id_d9facb455e3211e180f3001ec947ccaf = new MDependency("d9facb45-5e32-11e1-80f3-001ec947ccaf","Occurence","006bd1b8-cc38-1f43-b54d-001ec947cd2a.exml",this.mClass.get("NaryLink"),false,false,false,false);
        this.mClass.get("NaryAssociation").getMDependencys().add(id_d9facb455e3211e180f3001ec947ccaf);

        // dependency NaryAssociation.NaryEnd
        MDependency id_007bc000d08c1f43b54d001ec947cd2a = new MDependency("007bc000-d08c-1f43-b54d-001ec947cd2a","NaryEnd","006bd1b8-cc38-1f43-b54d-001ec947cd2a.exml",this.mClass.get("NaryAssociationEnd"),false,false,false,false);
        this.mClass.get("NaryAssociation").getMDependencys().add(id_007bc000d08c1f43b54d001ec947cd2a);

        // dependency NaryAssociation.LinkToClass
        MDependency id_c7953d90848311e1bccb001ec947ccaf = new MDependency("c7953d90-8483-11e1-bccb-001ec947ccaf","LinkToClass","006bd1b8-cc38-1f43-b54d-001ec947cd2a.exml",this.mClass.get("ClassAssociation"),true,false,false,true);
        this.mClass.get("NaryAssociation").getMDependencys().add(id_c7953d90848311e1bccb001ec947ccaf);

        // dependency NaryConnector.Representation
        MDependency id_00281854000017960000000000000000 = new MDependency("00281854-0000-1796-0000-000000000000","Representation","00281854-0000-175e-0000-000000000000.exml",this.mClass.get("Binding"),false,false,false,false);
        this.mClass.get("NaryConnector").getMDependencys().add(id_00281854000017960000000000000000);

        // dependency NaryConnector.RepresentedFeature
        MDependency id_002818540000177d0000000000000000 = new MDependency("00281854-0000-177d-0000-000000000000","RepresentedFeature","00281854-0000-175e-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("NaryConnector").getMDependencys().add(id_002818540000177d0000000000000000);

        // dependency NaryLink.NaryLinkEnd
        MDependency id_002a6f7a127a1f46b1d2001ec947cd2a = new MDependency("002a6f7a-127a-1f46-b1d2-001ec947cd2a","NaryLinkEnd","003da3e2-123f-1f46-b1d2-001ec947cd2a.exml",this.mClass.get("NaryLinkEnd"),false,false,false,false);
        this.mClass.get("NaryLink").getMDependencys().add(id_002a6f7a127a1f46b1d2001ec947cd2a);

        // dependency NaryLink.Model
        MDependency id_d9f868ee5e3211e180f3001ec947ccaf = new MDependency("d9f868ee-5e32-11e1-80f3-001ec947ccaf","Model","003da3e2-123f-1f46-b1d2-001ec947cd2a.exml",this.mClass.get("NaryAssociation"),true,false,false,false);
        this.mClass.get("NaryLink").getMDependencys().add(id_d9f868ee5e3211e180f3001ec947ccaf);

        // dependency NaryLink.RealizedInformationFlow
        MDependency id_0013b08c131a10a188a0001ec947cd2a = new MDependency("0013b08c-131a-10a1-88a0-001ec947cd2a","RealizedInformationFlow","003da3e2-123f-1f46-b1d2-001ec947cd2a.exml",this.mClass.get("InformationFlow"),false,false,false,false);
        this.mClass.get("NaryLink").getMDependencys().add(id_0013b08c131a10a188a0001ec947cd2a);

        // dependency NaryLink.Sent
        MDependency id_0013af4c131a10a188a0001ec947cd2a = new MDependency("0013af4c-131a-10a1-88a0-001ec947cd2a","Sent","003da3e2-123f-1f46-b1d2-001ec947cd2a.exml",this.mClass.get("CommunicationChannel"),false,false,false,false);
        this.mClass.get("NaryLink").getMDependencys().add(id_0013af4c131a10a188a0001ec947cd2a);

        // dependency NaryLinkEnd.Source
        MDependency id_0013a98e131a10a188a0001ec947cd2a = new MDependency("0013a98e-131a-10a1-88a0-001ec947cd2a","Source","00139d9a-131a-10a1-88a0-001ec947cd2a.exml",this.mClass.get("Instance"),true,false,false,false);
        this.mClass.get("NaryLinkEnd").getMDependencys().add(id_0013a98e131a10a188a0001ec947cd2a);

        // dependency NaryLinkEnd.NaryLink
        MDependency id_002a2b8c127a1f46b1d2001ec947cd2a = new MDependency("002a2b8c-127a-1f46-b1d2-001ec947cd2a","NaryLink","00139d9a-131a-10a1-88a0-001ec947cd2a.exml",this.mClass.get("NaryLink"),true,false,false,false);
        this.mClass.get("NaryLinkEnd").getMDependencys().add(id_002a2b8c127a1f46b1d2001ec947cd2a);

        // dependency NaryLinkEnd.Consumer
        MDependency id_0013a52e131a10a188a0001ec947cd2a = new MDependency("0013a52e-131a-10a1-88a0-001ec947cd2a","Consumer","00139d9a-131a-10a1-88a0-001ec947cd2a.exml",this.mClass.get("RequiredInterface"),true,false,false,false);
        this.mClass.get("NaryLinkEnd").getMDependencys().add(id_0013a52e131a10a188a0001ec947cd2a);

        // dependency NaryLinkEnd.Provider
        MDependency id_0013adf8131a10a188a0001ec947cd2a = new MDependency("0013adf8-131a-10a1-88a0-001ec947cd2a","Provider","00139d9a-131a-10a1-88a0-001ec947cd2a.exml",this.mClass.get("ProvidedInterface"),true,false,false,false);
        this.mClass.get("NaryLinkEnd").getMDependencys().add(id_0013adf8131a10a188a0001ec947cd2a);

        // dependency Node.Resident
        MDependency id_0148033c000197890000000000000000 = new MDependency("0148033c-0001-9789-0000-000000000000","Resident","0148033c-0000-0ce9-0000-000000000000.exml",this.mClass.get("Artifact"),false,false,false,false);
        this.mClass.get("Node").getMDependencys().add(id_0148033c000197890000000000000000);

        // dependency Operation.OwnedImport
        MDependency id_0008152c00001fc30000000000000000 = new MDependency("0008152c-0000-1fc3-0000-000000000000","OwnedImport","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("ElementImport"),false,false,false,true);
        this.mClass.get("Operation").getMDependencys().add(id_0008152c00001fc30000000000000000);

        // dependency Operation.Thrown
        MDependency id_0014116000000cc20000000000000000 = new MDependency("00141160-0000-0cc2-0000-000000000000","Thrown","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("RaisedException"),false,false,false,true);
        this.mClass.get("Operation").getMDependencys().add(id_0014116000000cc20000000000000000);

        // dependency Operation.CallerReceiveTask
        MDependency id_78d05413fe1811e086b2001ec947ccaf = new MDependency("78d05413-fe18-11e0-86b2-001ec947ccaf","CallerReceiveTask","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("BpmnReceiveTask"),false,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_78d05413fe1811e086b2001ec947ccaf);

        // dependency Operation.Redefinition
        MDependency id_0148033c0001ae850000000000000000 = new MDependency("0148033c-0001-ae85-0000-000000000000","Redefinition","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("Operation"),false,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_0148033c0001ae850000000000000000);

        // dependency Operation.Example
        MDependency id_0148033c000195e20000000000000000 = new MDependency("0148033c-0001-95e2-0000-000000000000","Example","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("Collaboration"),false,false,false,true);
        this.mClass.get("Operation").getMDependencys().add(id_0148033c000195e20000000000000000);

        // dependency Operation.SRepresentation
        MDependency id_0148033c0001ae810000000000000000 = new MDependency("0148033c-0001-ae81-0000-000000000000","SRepresentation","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("Signal"),false,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_0148033c0001ae810000000000000000);

        // dependency Operation.OwnedBehavior
        MDependency id_0148033c0001af3d0000000000000000 = new MDependency("0148033c-0001-af3d-0000-000000000000","OwnedBehavior","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("Behavior"),false,false,false,true);
        this.mClass.get("Operation").getMDependencys().add(id_0148033c0001af3d0000000000000000);

        // dependency Operation.BpmnOperationRef
        MDependency id_7f73f21918d611e09cf7001ec947ccaf = new MDependency("7f73f219-18d6-11e0-9cf7-001ec947ccaf","BpmnOperationRef","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("BpmnOperation"),false,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_7f73f21918d611e09cf7001ec947ccaf);

        // dependency Operation.CallerSendTask
        MDependency id_d0362238fe1711e086b2001ec947ccaf = new MDependency("d0362238-fe17-11e0-86b2-001ec947ccaf","CallerSendTask","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("BpmnSendTask"),false,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_d0362238fe1711e086b2001ec947ccaf);

        // dependency Operation.IO
        MDependency id_0148033c0001af280000000000000000 = new MDependency("0148033c-0001-af28-0000-000000000000","IO","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("Parameter"),false,false,false,true);
        this.mClass.get("Operation").getMDependencys().add(id_0148033c0001af280000000000000000);

        // dependency Operation.TemplateInstanciation
        MDependency id_0008152c00001dbe0000000000000000 = new MDependency("0008152c-0000-1dbe-0000-000000000000","TemplateInstanciation","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("TemplateBinding"),false,false,false,true);
        this.mClass.get("Operation").getMDependencys().add(id_0008152c00001dbe0000000000000000);

        // dependency Operation.Owner
        MDependency id_006fcbe2ccc21f43b54d001ec947cd2a = new MDependency("006fcbe2-ccc2-1f43-b54d-001ec947cd2a","Owner","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("Classifier"),true,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_006fcbe2ccc21f43b54d001ec947cd2a);

        // dependency Operation.OwnedPackageImport
        MDependency id_0008152c00001ff80000000000000000 = new MDependency("0008152c-0000-1ff8-0000-000000000000","OwnedPackageImport","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("PackageImport"),false,false,false,true);
        this.mClass.get("Operation").getMDependencys().add(id_0008152c00001ff80000000000000000);

        // dependency Operation.Return
        MDependency id_0148033c0001af330000000000000000 = new MDependency("0148033c-0001-af33-0000-000000000000","Return","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("Parameter"),true,false,false,true);
        this.mClass.get("Operation").getMDependencys().add(id_0148033c0001af330000000000000000);

        // dependency Operation.InstanciatingBinding
        MDependency id_0008152c00001dc80000000000000000 = new MDependency("0008152c-0000-1dc8-0000-000000000000","InstanciatingBinding","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("TemplateBinding"),false,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_0008152c00001dc80000000000000000);

        // dependency Operation.Usage
        MDependency id_0148033c0001a6040000000000000000 = new MDependency("0148033c-0001-a604-0000-000000000000","Usage","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("Message"),false,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_0148033c0001a6040000000000000000);

        // dependency Operation.Template
        MDependency id_0008152c000020180000000000000000 = new MDependency("0008152c-0000-2018-0000-000000000000","Template","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("TemplateParameter"),false,false,false,true);
        this.mClass.get("Operation").getMDependencys().add(id_0008152c000020180000000000000000);

        // dependency Operation.CallerServiceTask
        MDependency id_92442431fe1811e086b2001ec947ccaf = new MDependency("92442431-fe18-11e0-86b2-001ec947ccaf","CallerServiceTask","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("BpmnServiceTask"),false,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_92442431fe1811e086b2001ec947ccaf);

        // dependency Operation.Occurence
        MDependency id_0148033c00019dd40000000000000000 = new MDependency("0148033c-0001-9dd4-0000-000000000000","Occurence","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("Event"),false,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_0148033c00019dd40000000000000000);

        // dependency Operation.Invoker
        MDependency id_0148033c0001ae910000000000000000 = new MDependency("0148033c-0001-ae91-0000-000000000000","Invoker","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("Transition"),false,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_0148033c0001ae910000000000000000);

        // dependency Operation.CommunicationUsage
        MDependency id_01ec00cc00172dcf0000000000000000 = new MDependency("01ec00cc-0017-2dcf-0000-000000000000","CommunicationUsage","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("CommunicationMessage"),false,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_01ec00cc00172dcf0000000000000000);

        // dependency Operation.OwnedCollaborationUse
        MDependency id_0008152c00001d060000000000000000 = new MDependency("0008152c-0000-1d06-0000-000000000000","OwnedCollaborationUse","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("CollaborationUse"),false,false,false,true);
        this.mClass.get("Operation").getMDependencys().add(id_0008152c00001d060000000000000000);

        // dependency Operation.Redefines
        MDependency id_0148033c0001ae860000000000000000 = new MDependency("0148033c-0001-ae86-0000-000000000000","Redefines","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_0148033c0001ae860000000000000000);

        // dependency Operation.Caller
        MDependency id_7f76546f18d611e09cf7001ec947ccaf = new MDependency("7f76546f-18d6-11e0-9cf7-001ec947ccaf","Caller","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("BpmnCallActivity"),false,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_7f76546f18d611e09cf7001ec947ccaf);

        // dependency Operation.CallingAction
        MDependency id_00d00f2400000d320000000000000000 = new MDependency("00d00f24-0000-0d32-0000-000000000000","CallingAction","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("CallOperationAction"),false,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_00d00f2400000d320000000000000000);

        // dependency Operation.EntryPointAction
        MDependency id_00d012d80001ee4c0000000000000000 = new MDependency("00d012d8-0001-ee4c-0000-000000000000","EntryPointAction","0148033c-0000-0cb3-0000-000000000000.exml",this.mClass.get("AcceptCallEventAction"),false,false,false,false);
        this.mClass.get("Operation").getMDependencys().add(id_00d012d80001ee4c0000000000000000);

        // dependency Package.BpmnRepresents
        MDependency id_7f73f1da18d611e09cf7001ec947ccaf = new MDependency("7f73f1da-18d6-11e0-9cf7-001ec947ccaf","BpmnRepresents","0148033c-0000-0cab-0000-000000000000.exml",this.mClass.get("BpmnParticipant"),false,false,false,false);
        this.mClass.get("Package").getMDependencys().add(id_7f73f1da18d611e09cf7001ec947ccaf);

        // dependency Package.ReceivingMerge
        MDependency id_0008152c00001e490000000000000000 = new MDependency("0008152c-0000-1e49-0000-000000000000","ReceivingMerge","0148033c-0000-0cab-0000-000000000000.exml",this.mClass.get("PackageMerge"),false,false,false,false);
        this.mClass.get("Package").getMDependencys().add(id_0008152c00001e490000000000000000);

        // dependency Package.Represented
        MDependency id_0148033c0001b0640000000000000000 = new MDependency("0148033c-0001-b064-0000-000000000000","Represented","0148033c-0000-0cab-0000-000000000000.exml",this.mClass.get("Project"),true,false,false,false);
        this.mClass.get("Package").getMDependencys().add(id_0148033c0001b0640000000000000000);

        // dependency Package.Merge
        MDependency id_0008152c00001e3f0000000000000000 = new MDependency("0008152c-0000-1e3f-0000-000000000000","Merge","0148033c-0000-0cab-0000-000000000000.exml",this.mClass.get("PackageMerge"),false,false,false,true);
        this.mClass.get("Package").getMDependencys().add(id_0008152c00001e3f0000000000000000);

        // dependency Package.PackageImporting
        MDependency id_0008152c00001d580000000000000000 = new MDependency("0008152c-0000-1d58-0000-000000000000","PackageImporting","0148033c-0000-0cab-0000-000000000000.exml",this.mClass.get("PackageImport"),false,false,false,false);
        this.mClass.get("Package").getMDependencys().add(id_0008152c00001d580000000000000000);

        // dependency PackageImport.ImportingOperation
        MDependency id_0008152c00001ff60000000000000000 = new MDependency("0008152c-0000-1ff6-0000-000000000000","ImportingOperation","0008152c-0000-1bb1-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("PackageImport").getMDependencys().add(id_0008152c00001ff60000000000000000);

        // dependency PackageImport.ImportingNameSpace
        MDependency id_0008152c00001d440000000000000000 = new MDependency("0008152c-0000-1d44-0000-000000000000","ImportingNameSpace","0008152c-0000-1bb1-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("PackageImport").getMDependencys().add(id_0008152c00001d440000000000000000);

        // dependency PackageImport.ImportedPackage
        MDependency id_0008152c00001d590000000000000000 = new MDependency("0008152c-0000-1d59-0000-000000000000","ImportedPackage","0008152c-0000-1bb1-0000-000000000000.exml",this.mClass.get("Package"),true,false,false,false);
        this.mClass.get("PackageImport").getMDependencys().add(id_0008152c00001d590000000000000000);

        // dependency PackageMerge.MergedPackage
        MDependency id_0008152c00001e480000000000000000 = new MDependency("0008152c-0000-1e48-0000-000000000000","MergedPackage","0008152c-0000-1bb7-0000-000000000000.exml",this.mClass.get("Package"),true,false,false,false);
        this.mClass.get("PackageMerge").getMDependencys().add(id_0008152c00001e480000000000000000);

        // dependency PackageMerge.ReceivingPackage
        MDependency id_0008152c00001e400000000000000000 = new MDependency("0008152c-0000-1e40-0000-000000000000","ReceivingPackage","0008152c-0000-1bb7-0000-000000000000.exml",this.mClass.get("Package"),true,false,false,false);
        this.mClass.get("PackageMerge").getMDependencys().add(id_0008152c00001e400000000000000000);

        // dependency Parameter.BpmnRepresentingDataInput
        MDependency id_7f73f1f518d611e09cf7001ec947ccaf = new MDependency("7f73f1f5-18d6-11e0-9cf7-001ec947ccaf","BpmnRepresentingDataInput","0148033c-0000-0cb4-0000-000000000000.exml",this.mClass.get("BpmnDataInput"),false,false,false,false);
        this.mClass.get("Parameter").getMDependencys().add(id_7f73f1f518d611e09cf7001ec947ccaf);

        // dependency Parameter.Type
        MDependency id_0148033c00019f3d0000000000000000 = new MDependency("0148033c-0001-9f3d-0000-000000000000","Type","0148033c-0000-0cb4-0000-000000000000.exml",this.mClass.get("GeneralClass"),true,false,false,false);
        this.mClass.get("Parameter").getMDependencys().add(id_0148033c00019f3d0000000000000000);

        // dependency Parameter.Composed
        MDependency id_0148033c0001af290000000000000000 = new MDependency("0148033c-0001-af29-0000-000000000000","Composed","0148033c-0000-0cb4-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("Parameter").getMDependencys().add(id_0148033c0001af290000000000000000);

        // dependency Parameter.Matching
        MDependency id_00d00f2400000dc10000000000000000 = new MDependency("00d00f24-0000-0dc1-0000-000000000000","Matching","0148033c-0000-0cb4-0000-000000000000.exml",this.mClass.get("Pin"),false,false,false,false);
        this.mClass.get("Parameter").getMDependencys().add(id_00d00f2400000dc10000000000000000);

        // dependency Parameter.BpmnRepresentingDataOutput
        MDependency id_7f73f1f418d611e09cf7001ec947ccaf = new MDependency("7f73f1f4-18d6-11e0-9cf7-001ec947ccaf","BpmnRepresentingDataOutput","0148033c-0000-0cb4-0000-000000000000.exml",this.mClass.get("BpmnDataOutput"),false,false,false,false);
        this.mClass.get("Parameter").getMDependencys().add(id_7f73f1f418d611e09cf7001ec947ccaf);

        // dependency Parameter.SRepresentation
        MDependency id_0148033c0001b2260000000000000000 = new MDependency("0148033c-0001-b226-0000-000000000000","SRepresentation","0148033c-0000-0cb4-0000-000000000000.exml",this.mClass.get("Signal"),false,false,false,false);
        this.mClass.get("Parameter").getMDependencys().add(id_0148033c0001b2260000000000000000);

        // dependency Parameter.Returned
        MDependency id_0148033c0001af340000000000000000 = new MDependency("0148033c-0001-af34-0000-000000000000","Returned","0148033c-0000-0cb4-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("Parameter").getMDependencys().add(id_0148033c0001af340000000000000000);

        // dependency Parameter.BehaviorParam
        MDependency id_00d00f2400000cfa0000000000000000 = new MDependency("00d00f24-0000-0cfa-0000-000000000000","BehaviorParam","0148033c-0000-0cb4-0000-000000000000.exml",this.mClass.get("BehaviorParameter"),false,false,false,false);
        this.mClass.get("Parameter").getMDependencys().add(id_00d00f2400000cfa0000000000000000);

        // dependency Port.Provided
        MDependency id_0014116000000ca60000000000000000 = new MDependency("00141160-0000-0ca6-0000-000000000000","Provided","0008152c-0000-1bb2-0000-000000000000.exml",this.mClass.get("ProvidedInterface"),false,false,false,true);
        this.mClass.get("Port").getMDependencys().add(id_0014116000000ca60000000000000000);

        // dependency Port.Required
        MDependency id_0014116000000c9d0000000000000000 = new MDependency("00141160-0000-0c9d-0000-000000000000","Required","0008152c-0000-1bb2-0000-000000000000.exml",this.mClass.get("RequiredInterface"),false,false,false,true);
        this.mClass.get("Port").getMDependencys().add(id_0014116000000c9d0000000000000000);

        // dependency ProvidedInterface.ProvidedElement
        MDependency id_0014116000000c880000000000000000 = new MDependency("00141160-0000-0c88-0000-000000000000","ProvidedElement","00141160-0000-0bb0-0000-000000000000.exml",this.mClass.get("Interface"),false,false,false,false);
        this.mClass.get("ProvidedInterface").getMDependencys().add(id_0014116000000c880000000000000000);

        // dependency ProvidedInterface.Providing
        MDependency id_0014116000000cac0000000000000000 = new MDependency("00141160-0000-0cac-0000-000000000000","Providing","00141160-0000-0bb0-0000-000000000000.exml",this.mClass.get("Port"),true,false,false,false);
        this.mClass.get("ProvidedInterface").getMDependencys().add(id_0014116000000cac0000000000000000);

        // dependency ProvidedInterface.Consumer
        MDependency id_00281324000000270000000000000000 = new MDependency("00281324-0000-0027-0000-000000000000","Consumer","00141160-0000-0bb0-0000-000000000000.exml",this.mClass.get("LinkEnd"),false,false,false,false);
        this.mClass.get("ProvidedInterface").getMDependencys().add(id_00281324000000270000000000000000);

        // dependency ProvidedInterface.NaryConsumer
        MDependency id_0013b3fc131a10a188a0001ec947cd2a = new MDependency("0013b3fc-131a-10a1-88a0-001ec947cd2a","NaryConsumer","00141160-0000-0bb0-0000-000000000000.exml",this.mClass.get("NaryLinkEnd"),false,false,false,false);
        this.mClass.get("ProvidedInterface").getMDependencys().add(id_0013b3fc131a10a188a0001ec947cd2a);

        // dependency RaisedException.ThrownType
        MDependency id_0014116000000cbb0000000000000000 = new MDependency("00141160-0000-0cbb-0000-000000000000","ThrownType","00141160-0000-0c10-0000-000000000000.exml",this.mClass.get("Classifier"),true,false,false,false);
        this.mClass.get("RaisedException").getMDependencys().add(id_0014116000000cbb0000000000000000);

        // dependency RaisedException.Thrower
        MDependency id_0014116000000cc80000000000000000 = new MDependency("00141160-0000-0cc8-0000-000000000000","Thrower","00141160-0000-0c10-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("RaisedException").getMDependencys().add(id_0014116000000cc80000000000000000);

        // dependency RequiredInterface.RequiredElement
        MDependency id_0014116000000c7e0000000000000000 = new MDependency("00141160-0000-0c7e-0000-000000000000","RequiredElement","00141160-0000-0b50-0000-000000000000.exml",this.mClass.get("Interface"),false,false,false,false);
        this.mClass.get("RequiredInterface").getMDependencys().add(id_0014116000000c7e0000000000000000);

        // dependency RequiredInterface.Provider
        MDependency id_00281324000000570000000000000000 = new MDependency("00281324-0000-0057-0000-000000000000","Provider","00141160-0000-0b50-0000-000000000000.exml",this.mClass.get("LinkEnd"),false,false,false,false);
        this.mClass.get("RequiredInterface").getMDependencys().add(id_00281324000000570000000000000000);

        // dependency RequiredInterface.Requiring
        MDependency id_0014116000000ca30000000000000000 = new MDependency("00141160-0000-0ca3-0000-000000000000","Requiring","00141160-0000-0b50-0000-000000000000.exml",this.mClass.get("Port"),true,false,false,false);
        this.mClass.get("RequiredInterface").getMDependencys().add(id_0014116000000ca30000000000000000);

        // dependency RequiredInterface.NaryProvider
        MDependency id_0013b528131a10a188a0001ec947cd2a = new MDependency("0013b528-131a-10a1-88a0-001ec947cd2a","NaryProvider","00141160-0000-0b50-0000-000000000000.exml",this.mClass.get("NaryLinkEnd"),false,false,false,false);
        this.mClass.get("RequiredInterface").getMDependencys().add(id_0013b528131a10a188a0001ec947cd2a);

        // dependency StructuralFeature.RealizedInformationFlow
        MDependency id_00d00f24000012ab0000000000000000 = new MDependency("00d00f24-0000-12ab-0000-000000000000","RealizedInformationFlow","000565ea-cbd4-1f43-b54d-001ec947cd2a.exml",this.mClass.get("InformationFlow"),false,false,false,false);
        this.mClass.get("StructuralFeature").getMDependencys().add(id_00d00f24000012ab0000000000000000);

        // dependency TemplateBinding.ParameterSubstitution
        MDependency id_0008152c00001de30000000000000000 = new MDependency("0008152c-0000-1de3-0000-000000000000","ParameterSubstitution","0008152c-0000-1bb4-0000-000000000000.exml",this.mClass.get("TemplateParameterSubstitution"),false,false,false,true);
        this.mClass.get("TemplateBinding").getMDependencys().add(id_0008152c00001de30000000000000000);

        // dependency TemplateBinding.BoundOperation
        MDependency id_0008152c00001dbf0000000000000000 = new MDependency("0008152c-0000-1dbf-0000-000000000000","BoundOperation","0008152c-0000-1bb4-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("TemplateBinding").getMDependencys().add(id_0008152c00001dbf0000000000000000);

        // dependency TemplateBinding.InstanciatedTemplateOperation
        MDependency id_0008152c00001dc70000000000000000 = new MDependency("0008152c-0000-1dc7-0000-000000000000","InstanciatedTemplateOperation","0008152c-0000-1bb4-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("TemplateBinding").getMDependencys().add(id_0008152c00001dc70000000000000000);

        // dependency TemplateBinding.InstanciatedTemplate
        MDependency id_0008152c00001dd90000000000000000 = new MDependency("0008152c-0000-1dd9-0000-000000000000","InstanciatedTemplate","0008152c-0000-1bb4-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("TemplateBinding").getMDependencys().add(id_0008152c00001dd90000000000000000);

        // dependency TemplateBinding.BoundElement
        MDependency id_0008152c00001dd10000000000000000 = new MDependency("0008152c-0000-1dd1-0000-000000000000","BoundElement","0008152c-0000-1bb4-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("TemplateBinding").getMDependencys().add(id_0008152c00001dd10000000000000000);

        // dependency TemplateParameter.ParameterSubstitution
        MDependency id_0008152c00001dfa0000000000000000 = new MDependency("0008152c-0000-1dfa-0000-000000000000","ParameterSubstitution","0148033c-0000-0cba-0000-000000000000.exml",this.mClass.get("TemplateParameterSubstitution"),false,false,false,false);
        this.mClass.get("TemplateParameter").getMDependencys().add(id_0008152c00001dfa0000000000000000);

        // dependency TemplateParameter.Type
        MDependency id_00281854000017270000000000000000 = new MDependency("00281854-0000-1727-0000-000000000000","Type","0148033c-0000-0cba-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("TemplateParameter").getMDependencys().add(id_00281854000017270000000000000000);

        // dependency TemplateParameter.Parameterized
        MDependency id_0008152c00001fa00000000000000000 = new MDependency("0008152c-0000-1fa0-0000-000000000000","Parameterized","0148033c-0000-0cba-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("TemplateParameter").getMDependencys().add(id_0008152c00001fa00000000000000000);

        // dependency TemplateParameter.OwnedParameterElement
        MDependency id_0008152c00001f710000000000000000 = new MDependency("0008152c-0000-1f71-0000-000000000000","OwnedParameterElement","0148033c-0000-0cba-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,true);
        this.mClass.get("TemplateParameter").getMDependencys().add(id_0008152c00001f710000000000000000);

        // dependency TemplateParameter.DefaultType
        MDependency id_0008152c00001fa70000000000000000 = new MDependency("0008152c-0000-1fa7-0000-000000000000","DefaultType","0148033c-0000-0cba-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("TemplateParameter").getMDependencys().add(id_0008152c00001fa70000000000000000);

        // dependency TemplateParameter.ParameterizedOperation
        MDependency id_0008152c0000201d0000000000000000 = new MDependency("0008152c-0000-201d-0000-000000000000","ParameterizedOperation","0148033c-0000-0cba-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("TemplateParameter").getMDependencys().add(id_0008152c0000201d0000000000000000);

        // dependency TemplateParameterSubstitution.Owner
        MDependency id_0008152c00001de40000000000000000 = new MDependency("0008152c-0000-1de4-0000-000000000000","Owner","0008152c-0000-1bb5-0000-000000000000.exml",this.mClass.get("TemplateBinding"),true,false,false,false);
        this.mClass.get("TemplateParameterSubstitution").getMDependencys().add(id_0008152c00001de40000000000000000);

        // dependency TemplateParameterSubstitution.Actual
        MDependency id_0008152c00001e020000000000000000 = new MDependency("0008152c-0000-1e02-0000-000000000000","Actual","0008152c-0000-1bb5-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("TemplateParameterSubstitution").getMDependencys().add(id_0008152c00001e020000000000000000);

        // dependency TemplateParameterSubstitution.FormalParameter
        MDependency id_0008152c00001df90000000000000000 = new MDependency("0008152c-0000-1df9-0000-000000000000","FormalParameter","0008152c-0000-1bb5-0000-000000000000.exml",this.mClass.get("TemplateParameter"),true,false,false,false);
        this.mClass.get("TemplateParameterSubstitution").getMDependencys().add(id_0008152c00001df90000000000000000);

        // dependency AcceptCallEventAction.Called
        MDependency id_00d012d80001ee430000000000000000 = new MDependency("00d012d8-0001-ee43-0000-000000000000","Called","00d012d8-0001-ee0d-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("AcceptCallEventAction").getMDependencys().add(id_00d012d80001ee430000000000000000);

        // dependency AcceptSignalAction.Accepted
        MDependency id_00d00f24000011940000000000000000 = new MDependency("00d00f24-0000-1194-0000-000000000000","Accepted","00d00f24-0000-116f-0000-000000000000.exml",this.mClass.get("Signal"),false,false,false,false);
        this.mClass.get("AcceptSignalAction").getMDependencys().add(id_00d00f24000011940000000000000000);

        // dependency Activity.OwnedGroup
        MDependency id_00d00f2400000c7f0000000000000000 = new MDependency("00d00f24-0000-0c7f-0000-000000000000","OwnedGroup","0008152c-0000-1c93-0000-000000000000.exml",this.mClass.get("ActivityGroup"),false,false,false,true);
        this.mClass.get("Activity").getMDependencys().add(id_00d00f2400000c7f0000000000000000);

        // dependency Activity.OwnedNode
        MDependency id_00d00f2400000c750000000000000000 = new MDependency("00d00f24-0000-0c75-0000-000000000000","OwnedNode","0008152c-0000-1c93-0000-000000000000.exml",this.mClass.get("ActivityNode"),false,false,false,true);
        this.mClass.get("Activity").getMDependencys().add(id_00d00f2400000c750000000000000000);

        // dependency ActivityAction.Output
        MDependency id_00d012d800096c640000000000000000 = new MDependency("00d012d8-0009-6c64-0000-000000000000","Output","00d00f24-0000-094c-0000-000000000000.exml",this.mClass.get("OutputPin"),false,false,false,true);
        this.mClass.get("ActivityAction").getMDependencys().add(id_00d012d800096c640000000000000000);

        // dependency ActivityAction.Input
        MDependency id_00d012d800096bbb0000000000000000 = new MDependency("00d012d8-0009-6bbb-0000-000000000000","Input","00d00f24-0000-094c-0000-000000000000.exml",this.mClass.get("InputPin"),false,false,false,true);
        this.mClass.get("ActivityAction").getMDependencys().add(id_00d012d800096bbb0000000000000000);

        // dependency ActivityAction.Handler
        MDependency id_abfcfbb2f87c11dfa2c5001ec947ccaf = new MDependency("abfcfbb2-f87c-11df-a2c5-001ec947ccaf","Handler","00d00f24-0000-094c-0000-000000000000.exml",this.mClass.get("ExceptionHandler"),false,false,false,true);
        this.mClass.get("ActivityAction").getMDependencys().add(id_abfcfbb2f87c11dfa2c5001ec947ccaf);

        // dependency ActivityEdge.Target
        MDependency id_00d00f240000095e0000000000000000 = new MDependency("00d00f24-0000-095e-0000-000000000000","Target","00d00f24-0000-094e-0000-000000000000.exml",this.mClass.get("ActivityNode"),true,false,false,false);
        this.mClass.get("ActivityEdge").getMDependencys().add(id_00d00f240000095e0000000000000000);

        // dependency ActivityEdge.Source
        MDependency id_00d00f24000009610000000000000000 = new MDependency("00d00f24-0000-0961-0000-000000000000","Source","00d00f24-0000-094e-0000-000000000000.exml",this.mClass.get("ActivityNode"),true,false,false,false);
        this.mClass.get("ActivityEdge").getMDependencys().add(id_00d00f24000009610000000000000000);

        // dependency ActivityEdge.Interrupts
        MDependency id_00d00f2400000d150000000000000000 = new MDependency("00d00f24-0000-0d15-0000-000000000000","Interrupts","00d00f24-0000-094e-0000-000000000000.exml",this.mClass.get("InterruptibleActivityRegion"),true,false,false,false);
        this.mClass.get("ActivityEdge").getMDependencys().add(id_00d00f2400000d150000000000000000);

        // dependency ActivityEdge.RealizedInformationFlow
        MDependency id_00d00f24000012b60000000000000000 = new MDependency("00d00f24-0000-12b6-0000-000000000000","RealizedInformationFlow","00d00f24-0000-094e-0000-000000000000.exml",this.mClass.get("InformationFlow"),false,false,false,false);
        this.mClass.get("ActivityEdge").getMDependencys().add(id_00d00f24000012b60000000000000000);

        // dependency ActivityGroup.InActivity
        MDependency id_00d00f2400000c800000000000000000 = new MDependency("00d00f24-0000-0c80-0000-000000000000","InActivity","00d00f24-0000-0950-0000-000000000000.exml",this.mClass.get("Activity"),true,false,false,false);
        this.mClass.get("ActivityGroup").getMDependencys().add(id_00d00f2400000c800000000000000000);

        // dependency ActivityNode.Owner
        MDependency id_00d00f2400000c760000000000000000 = new MDependency("00d00f24-0000-0c76-0000-000000000000","Owner","00d00f24-0000-0954-0000-000000000000.exml",this.mClass.get("Activity"),true,false,false,false);
        this.mClass.get("ActivityNode").getMDependencys().add(id_00d00f2400000c760000000000000000);

        // dependency ActivityNode.OwnerPartition
        MDependency id_00d00f24000009760000000000000000 = new MDependency("00d00f24-0000-0976-0000-000000000000","OwnerPartition","00d00f24-0000-0954-0000-000000000000.exml",this.mClass.get("ActivityPartition"),true,false,false,false);
        this.mClass.get("ActivityNode").getMDependencys().add(id_00d00f24000009760000000000000000);

        // dependency ActivityNode.Incoming
        MDependency id_00d00f240000095f0000000000000000 = new MDependency("00d00f24-0000-095f-0000-000000000000","Incoming","00d00f24-0000-0954-0000-000000000000.exml",this.mClass.get("ActivityEdge"),false,false,false,false);
        this.mClass.get("ActivityNode").getMDependencys().add(id_00d00f240000095f0000000000000000);

        // dependency ActivityNode.OwnerClause
        MDependency id_00d012d80002eaf60000000000000000 = new MDependency("00d012d8-0002-eaf6-0000-000000000000","OwnerClause","00d00f24-0000-0954-0000-000000000000.exml",this.mClass.get("Clause"),true,false,false,false);
        this.mClass.get("ActivityNode").getMDependencys().add(id_00d012d80002eaf60000000000000000);

        // dependency ActivityNode.OwnerNode
        MDependency id_00d00f2400000db70000000000000000 = new MDependency("00d00f24-0000-0db7-0000-000000000000","OwnerNode","00d00f24-0000-0954-0000-000000000000.exml",this.mClass.get("StructuredActivityNode"),true,false,false,false);
        this.mClass.get("ActivityNode").getMDependencys().add(id_00d00f2400000db70000000000000000);

        // dependency ActivityNode.Outgoing
        MDependency id_00d00f24000009620000000000000000 = new MDependency("00d00f24-0000-0962-0000-000000000000","Outgoing","00d00f24-0000-0954-0000-000000000000.exml",this.mClass.get("ActivityEdge"),false,false,false,true);
        this.mClass.get("ActivityNode").getMDependencys().add(id_00d00f24000009620000000000000000);

        // dependency ActivityPartition.Represented
        MDependency id_00d00f2400000a850000000000000000 = new MDependency("00d00f24-0000-0a85-0000-000000000000","Represented","00d00f24-0000-0992-0000-000000000000.exml",this.mClass.get("ModelElement"),true,false,false,false);
        this.mClass.get("ActivityPartition").getMDependencys().add(id_00d00f2400000a850000000000000000);

        // dependency ActivityPartition.ContainedNode
        MDependency id_00d00f24000009750000000000000000 = new MDependency("00d00f24-0000-0975-0000-000000000000","ContainedNode","00d00f24-0000-0992-0000-000000000000.exml",this.mClass.get("ActivityNode"),true,false,false,false);
        this.mClass.get("ActivityPartition").getMDependencys().add(id_00d00f24000009750000000000000000);

        // dependency ActivityPartition.Outgoing
        MDependency id_00d00f2400000a360000000000000000 = new MDependency("00d00f24-0000-0a36-0000-000000000000","Outgoing","00d00f24-0000-0992-0000-000000000000.exml",this.mClass.get("MessageFlow"),false,false,false,true);
        this.mClass.get("ActivityPartition").getMDependencys().add(id_00d00f2400000a360000000000000000);

        // dependency ActivityPartition.SuperPartition
        MDependency id_00d00f240000096e0000000000000000 = new MDependency("00d00f24-0000-096e-0000-000000000000","SuperPartition","00d00f24-0000-0992-0000-000000000000.exml",this.mClass.get("ActivityPartition"),true,false,false,false);
        this.mClass.get("ActivityPartition").getMDependencys().add(id_00d00f240000096e0000000000000000);

        // dependency ActivityPartition.SubPartition
        MDependency id_00d00f240000096f0000000000000000 = new MDependency("00d00f24-0000-096f-0000-000000000000","SubPartition","00d00f24-0000-0992-0000-000000000000.exml",this.mClass.get("ActivityPartition"),false,false,false,true);
        this.mClass.get("ActivityPartition").getMDependencys().add(id_00d00f240000096f0000000000000000);

        // dependency ActivityPartition.Incoming
        MDependency id_00d00f2400000a420000000000000000 = new MDependency("00d00f24-0000-0a42-0000-000000000000","Incoming","00d00f24-0000-0992-0000-000000000000.exml",this.mClass.get("MessageFlow"),false,false,false,false);
        this.mClass.get("ActivityPartition").getMDependencys().add(id_00d00f2400000a420000000000000000);

        // dependency CallBehaviorAction.Called
        MDependency id_00d00f2400000d760000000000000000 = new MDependency("00d00f24-0000-0d76-0000-000000000000","Called","00d00f24-0000-0d20-0000-000000000000.exml",this.mClass.get("Behavior"),true,false,false,false);
        this.mClass.get("CallBehaviorAction").getMDependencys().add(id_00d00f2400000d760000000000000000);

        // dependency CallOperationAction.Called
        MDependency id_00d00f2400000d310000000000000000 = new MDependency("00d00f24-0000-0d31-0000-000000000000","Called","00d00f24-0000-0d1e-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("CallOperationAction").getMDependencys().add(id_00d00f2400000d310000000000000000);

        // dependency Clause.Body
        MDependency id_00d012d80002eaeb0000000000000000 = new MDependency("00d012d8-0002-eaeb-0000-000000000000","Body","00d012d8-0002-e9f8-0000-000000000000.exml",this.mClass.get("ActivityNode"),false,false,false,true);
        this.mClass.get("Clause").getMDependencys().add(id_00d012d80002eaeb0000000000000000);

        // dependency Clause.Owner
        MDependency id_00d012d8000336480000000000000000 = new MDependency("00d012d8-0003-3648-0000-000000000000","Owner","00d012d8-0002-e9f8-0000-000000000000.exml",this.mClass.get("ConditionalNode"),true,false,false,false);
        this.mClass.get("Clause").getMDependencys().add(id_00d012d8000336480000000000000000);

        // dependency ConditionalNode.OwnedClause
        MDependency id_00d012d80003363d0000000000000000 = new MDependency("00d012d8-0003-363d-0000-000000000000","OwnedClause","00d00f24-0000-0984-0000-000000000000.exml",this.mClass.get("Clause"),true,false,false,false);
        this.mClass.get("ConditionalNode").getMDependencys().add(id_00d012d80003363d0000000000000000);

        // dependency ExceptionHandler.ProtectedNode
        MDependency id_abfcfba1f87c11dfa2c5001ec947ccaf = new MDependency("abfcfba1-f87c-11df-a2c5-001ec947ccaf","ProtectedNode","abfcfba6-f87c-11df-a2c5-001ec947ccaf.exml",this.mClass.get("ActivityAction"),true,false,false,false);
        this.mClass.get("ExceptionHandler").getMDependencys().add(id_abfcfba1f87c11dfa2c5001ec947ccaf);

        // dependency ExceptionHandler.ExceptionInput
        MDependency id_abfcfba0f87c11dfa2c5001ec947ccaf = new MDependency("abfcfba0-f87c-11df-a2c5-001ec947ccaf","ExceptionInput","abfcfba6-f87c-11df-a2c5-001ec947ccaf.exml",this.mClass.get("InputPin"),true,false,false,false);
        this.mClass.get("ExceptionHandler").getMDependencys().add(id_abfcfba0f87c11dfa2c5001ec947ccaf);

        // dependency ExceptionHandler.ExceptionType
        MDependency id_af42d484f87e11dfa2c5001ec947ccaf = new MDependency("af42d484-f87e-11df-a2c5-001ec947ccaf","ExceptionType","abfcfba6-f87c-11df-a2c5-001ec947ccaf.exml",this.mClass.get("GeneralClass"),false,false,false,false);
        this.mClass.get("ExceptionHandler").getMDependencys().add(id_af42d484f87e11dfa2c5001ec947ccaf);

        // dependency ExpansionNode.RegionAsOutput
        MDependency id_6e7e979bf87811dfa2c5001ec947ccaf = new MDependency("6e7e979b-f878-11df-a2c5-001ec947ccaf","RegionAsOutput","361a58e9-f878-11df-a2c5-001ec947ccaf.exml",this.mClass.get("ExpansionRegion"),true,false,false,false);
        this.mClass.get("ExpansionNode").getMDependencys().add(id_6e7e979bf87811dfa2c5001ec947ccaf);

        // dependency ExpansionNode.RegionAsInput
        MDependency id_6ada6025f87811dfa2c5001ec947ccaf = new MDependency("6ada6025-f878-11df-a2c5-001ec947ccaf","RegionAsInput","361a58e9-f878-11df-a2c5-001ec947ccaf.exml",this.mClass.get("ExpansionRegion"),true,false,false,false);
        this.mClass.get("ExpansionNode").getMDependencys().add(id_6ada6025f87811dfa2c5001ec947ccaf);

        // dependency ExpansionRegion.OutputElement
        MDependency id_6e7e979af87811dfa2c5001ec947ccaf = new MDependency("6e7e979a-f878-11df-a2c5-001ec947ccaf","OutputElement","f0e31419-f877-11df-a2c5-001ec947ccaf.exml",this.mClass.get("ExpansionNode"),false,false,false,true);
        this.mClass.get("ExpansionRegion").getMDependencys().add(id_6e7e979af87811dfa2c5001ec947ccaf);

        // dependency ExpansionRegion.InputElement
        MDependency id_6ada6024f87811dfa2c5001ec947ccaf = new MDependency("6ada6024-f878-11df-a2c5-001ec947ccaf","InputElement","f0e31419-f877-11df-a2c5-001ec947ccaf.exml",this.mClass.get("ExpansionNode"),false,false,false,true);
        this.mClass.get("ExpansionRegion").getMDependencys().add(id_6ada6024f87811dfa2c5001ec947ccaf);

        // dependency InputPin.Handler
        MDependency id_abfcfbb1f87c11dfa2c5001ec947ccaf = new MDependency("abfcfbb1-f87c-11df-a2c5-001ec947ccaf","Handler","00d012d8-0009-6b90-0000-000000000000.exml",this.mClass.get("ExceptionHandler"),false,false,false,false);
        this.mClass.get("InputPin").getMDependencys().add(id_abfcfbb1f87c11dfa2c5001ec947ccaf);

        // dependency InputPin.Inputing
        MDependency id_00d012d800096bb70000000000000000 = new MDependency("00d012d8-0009-6bb7-0000-000000000000","Inputing","00d012d8-0009-6b90-0000-000000000000.exml",this.mClass.get("ActivityAction"),true,false,false,false);
        this.mClass.get("InputPin").getMDependencys().add(id_00d012d800096bb70000000000000000);

        // dependency InterruptibleActivityRegion.InterruptingEdge
        MDependency id_00d00f2400000d140000000000000000 = new MDependency("00d00f24-0000-0d14-0000-000000000000","InterruptingEdge","00d00f24-0000-09ce-0000-000000000000.exml",this.mClass.get("ActivityEdge"),false,false,false,false);
        this.mClass.get("InterruptibleActivityRegion").getMDependencys().add(id_00d00f2400000d140000000000000000);

        // dependency MessageFlow.TargetPartition
        MDependency id_00d00f2400000a410000000000000000 = new MDependency("00d00f24-0000-0a41-0000-000000000000","TargetPartition","00d00f24-0000-0990-0000-000000000000.exml",this.mClass.get("ActivityPartition"),true,false,false,false);
        this.mClass.get("MessageFlow").getMDependencys().add(id_00d00f2400000a410000000000000000);

        // dependency MessageFlow.SourcePartition
        MDependency id_00d00f2400000a350000000000000000 = new MDependency("00d00f24-0000-0a35-0000-000000000000","SourcePartition","00d00f24-0000-0990-0000-000000000000.exml",this.mClass.get("ActivityPartition"),true,false,false,false);
        this.mClass.get("MessageFlow").getMDependencys().add(id_00d00f2400000a350000000000000000);

        // dependency ObjectNode.Represented
        MDependency id_00d0113800035f2a0000000000000000 = new MDependency("00d01138-0003-5f2a-0000-000000000000","Represented","00d00f24-0000-097a-0000-000000000000.exml",this.mClass.get("Instance"),true,false,false,false);
        this.mClass.get("ObjectNode").getMDependencys().add(id_00d0113800035f2a0000000000000000);

        // dependency ObjectNode.RepresentedRealParameter
        MDependency id_00d012d80002f7910000000000000000 = new MDependency("00d012d8-0002-f791-0000-000000000000","RepresentedRealParameter","00d00f24-0000-097a-0000-000000000000.exml",this.mClass.get("BehaviorParameter"),true,false,false,false);
        this.mClass.get("ObjectNode").getMDependencys().add(id_00d012d80002f7910000000000000000);

        // dependency ObjectNode.Type
        MDependency id_00d00f2400000c8f0000000000000000 = new MDependency("00d00f24-0000-0c8f-0000-000000000000","Type","00d00f24-0000-097a-0000-000000000000.exml",this.mClass.get("GeneralClass"),true,false,false,false);
        this.mClass.get("ObjectNode").getMDependencys().add(id_00d00f2400000c8f0000000000000000);

        // dependency ObjectNode.RepresentedRole
        MDependency id_00d012d80002eabc0000000000000000 = new MDependency("00d012d8-0002-eabc-0000-000000000000","RepresentedRole","00d00f24-0000-097a-0000-000000000000.exml",this.mClass.get("AssociationEnd"),true,false,false,false);
        this.mClass.get("ObjectNode").getMDependencys().add(id_00d012d80002eabc0000000000000000);

        // dependency ObjectNode.RepresentedAttribute
        MDependency id_00d012d80002eaa80000000000000000 = new MDependency("00d012d8-0002-eaa8-0000-000000000000","RepresentedAttribute","00d00f24-0000-097a-0000-000000000000.exml",this.mClass.get("Attribute"),true,false,false,false);
        this.mClass.get("ObjectNode").getMDependencys().add(id_00d012d80002eaa80000000000000000);

        // dependency ObjectNode.InState
        MDependency id_00d0113800035ea10000000000000000 = new MDependency("00d01138-0003-5ea1-0000-000000000000","InState","00d00f24-0000-097a-0000-000000000000.exml",this.mClass.get("State"),true,false,false,false);
        this.mClass.get("ObjectNode").getMDependencys().add(id_00d0113800035ea10000000000000000);

        // dependency OutputPin.Outputing
        MDependency id_00d012d800096c600000000000000000 = new MDependency("00d012d8-0009-6c60-0000-000000000000","Outputing","00d012d8-0009-6c29-0000-000000000000.exml",this.mClass.get("ActivityAction"),true,false,false,false);
        this.mClass.get("OutputPin").getMDependencys().add(id_00d012d800096c600000000000000000);

        // dependency Pin.Matched
        MDependency id_00d00f2400000dc00000000000000000 = new MDependency("00d00f24-0000-0dc0-0000-000000000000","Matched","00d00f24-0000-097c-0000-000000000000.exml",this.mClass.get("Parameter"),true,false,false,false);
        this.mClass.get("Pin").getMDependencys().add(id_00d00f2400000dc00000000000000000);

        // dependency SendSignalAction.Sent
        MDependency id_00d00f240000118a0000000000000000 = new MDependency("00d00f24-0000-118a-0000-000000000000","Sent","00d00f24-0000-1169-0000-000000000000.exml",this.mClass.get("Signal"),true,false,false,false);
        this.mClass.get("SendSignalAction").getMDependencys().add(id_00d00f240000118a0000000000000000);

        // dependency StructuredActivityNode.Body
        MDependency id_00d00f2400000db60000000000000000 = new MDependency("00d00f24-0000-0db6-0000-000000000000","Body","00d00f24-0000-0980-0000-000000000000.exml",this.mClass.get("ActivityNode"),false,false,false,true);
        this.mClass.get("StructuredActivityNode").getMDependencys().add(id_00d00f2400000db60000000000000000);

        // dependency Behavior.BpmnCaller
        MDependency id_7f73f21318d611e09cf7001ec947ccaf = new MDependency("7f73f213-18d6-11e0-9cf7-001ec947ccaf","BpmnCaller","0008152c-0000-1bac-0000-000000000000.exml",this.mClass.get("BpmnCallActivity"),false,false,false,false);
        this.mClass.get("Behavior").getMDependencys().add(id_7f73f21318d611e09cf7001ec947ccaf);

        // dependency Behavior.Owner
        MDependency id_0148033c0001a1fb0000000000000000 = new MDependency("0148033c-0001-a1fb-0000-000000000000","Owner","0008152c-0000-1bac-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("Behavior").getMDependencys().add(id_0148033c0001a1fb0000000000000000);

        // dependency Behavior.Parameter
        MDependency id_00d011380001a7060000000000000000 = new MDependency("00d01138-0001-a706-0000-000000000000","Parameter","0008152c-0000-1bac-0000-000000000000.exml",this.mClass.get("BehaviorParameter"),false,false,false,true);
        this.mClass.get("Behavior").getMDependencys().add(id_00d011380001a7060000000000000000);

        // dependency Behavior.OwnerOperation
        MDependency id_0148033c0001af3e0000000000000000 = new MDependency("0148033c-0001-af3e-0000-000000000000","OwnerOperation","0008152c-0000-1bac-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("Behavior").getMDependencys().add(id_0148033c0001af3e0000000000000000);

        // dependency Behavior.OwnedCollaboration
        MDependency id_00d012d80002f7a00000000000000000 = new MDependency("00d012d8-0002-f7a0-0000-000000000000","OwnedCollaboration","0008152c-0000-1bac-0000-000000000000.exml",this.mClass.get("Collaboration"),false,false,false,true);
        this.mClass.get("Behavior").getMDependencys().add(id_00d012d80002f7a00000000000000000);

        // dependency Behavior.Caller
        MDependency id_00d00f2400000d770000000000000000 = new MDependency("00d00f24-0000-0d77-0000-000000000000","Caller","0008152c-0000-1bac-0000-000000000000.exml",this.mClass.get("CallBehaviorAction"),false,false,false,false);
        this.mClass.get("Behavior").getMDependencys().add(id_00d00f2400000d770000000000000000);

        // dependency Behavior.EComponent
        MDependency id_0148033c00019d7f0000000000000000 = new MDependency("0148033c-0001-9d7f-0000-000000000000","EComponent","0008152c-0000-1bac-0000-000000000000.exml",this.mClass.get("Event"),false,false,false,true);
        this.mClass.get("Behavior").getMDependencys().add(id_0148033c00019d7f0000000000000000);

        // dependency Behavior.EffectOf
        MDependency id_00d00f24000017750000000000000000 = new MDependency("00d00f24-0000-1775-0000-000000000000","EffectOf","0008152c-0000-1bac-0000-000000000000.exml",this.mClass.get("Transition"),false,false,false,false);
        this.mClass.get("Behavior").getMDependencys().add(id_00d00f24000017750000000000000000);

        // dependency BehaviorParameter.RepresentingObjectNode
        MDependency id_00d012d80002f78a0000000000000000 = new MDependency("00d012d8-0002-f78a-0000-000000000000","RepresentingObjectNode","00d00f24-0000-098a-0000-000000000000.exml",this.mClass.get("ObjectNode"),true,false,false,false);
        this.mClass.get("BehaviorParameter").getMDependencys().add(id_00d012d80002f78a0000000000000000);

        // dependency BehaviorParameter.Owner
        MDependency id_00d011380001a7070000000000000000 = new MDependency("00d01138-0001-a707-0000-000000000000","Owner","00d00f24-0000-098a-0000-000000000000.exml",this.mClass.get("Behavior"),true,false,false,false);
        this.mClass.get("BehaviorParameter").getMDependencys().add(id_00d011380001a7070000000000000000);

        // dependency BehaviorParameter.Mapped
        MDependency id_00d00f2400000cf90000000000000000 = new MDependency("00d00f24-0000-0cf9-0000-000000000000","Mapped","00d00f24-0000-098a-0000-000000000000.exml",this.mClass.get("Parameter"),true,false,false,false);
        this.mClass.get("BehaviorParameter").getMDependencys().add(id_00d00f2400000cf90000000000000000);

        // dependency Signal.Sender
        MDependency id_00d00f240000118b0000000000000000 = new MDependency("00d00f24-0000-118b-0000-000000000000","Sender","0148033c-0000-0cbe-0000-000000000000.exml",this.mClass.get("SendSignalAction"),false,false,false,false);
        this.mClass.get("Signal").getMDependencys().add(id_00d00f240000118b0000000000000000);

        // dependency Signal.Usage
        MDependency id_00d00f24000016e20000000000000000 = new MDependency("00d00f24-0000-16e2-0000-000000000000","Usage","0148033c-0000-0cbe-0000-000000000000.exml",this.mClass.get("Message"),false,false,false,false);
        this.mClass.get("Signal").getMDependencys().add(id_00d00f24000016e20000000000000000);

        // dependency Signal.Sends
        MDependency id_0148033c0001b8430000000000000000 = new MDependency("0148033c-0001-b843-0000-000000000000","Sends","0148033c-0000-0cbe-0000-000000000000.exml",this.mClass.get("Transition"),false,false,false,false);
        this.mClass.get("Signal").getMDependencys().add(id_0148033c0001b8430000000000000000);

        // dependency Signal.PBase
        MDependency id_0148033c0001b2270000000000000000 = new MDependency("0148033c-0001-b227-0000-000000000000","PBase","0148033c-0000-0cbe-0000-000000000000.exml",this.mClass.get("Parameter"),true,false,false,false);
        this.mClass.get("Signal").getMDependencys().add(id_0148033c0001b2270000000000000000);

        // dependency Signal.OBase
        MDependency id_0148033c0001ae820000000000000000 = new MDependency("0148033c-0001-ae82-0000-000000000000","OBase","0148033c-0000-0cbe-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("Signal").getMDependencys().add(id_0148033c0001ae820000000000000000);

        // dependency Signal.CommunicationUsage
        MDependency id_01ec00cc00172e120000000000000000 = new MDependency("01ec00cc-0017-2e12-0000-000000000000","CommunicationUsage","0148033c-0000-0cbe-0000-000000000000.exml",this.mClass.get("CommunicationMessage"),false,false,false,false);
        this.mClass.get("Signal").getMDependencys().add(id_01ec00cc00172e120000000000000000);

        // dependency Signal.DOccurence
        MDependency id_0148033c00019a050000000000000000 = new MDependency("0148033c-0001-9a05-0000-000000000000","DOccurence","0148033c-0000-0cbe-0000-000000000000.exml",this.mClass.get("DataFlow"),false,false,false,false);
        this.mClass.get("Signal").getMDependencys().add(id_0148033c00019a050000000000000000);

        // dependency Signal.EOccurence
        MDependency id_0148033c00019dcb0000000000000000 = new MDependency("0148033c-0001-9dcb-0000-000000000000","EOccurence","0148033c-0000-0cbe-0000-000000000000.exml",this.mClass.get("Event"),false,false,false,false);
        this.mClass.get("Signal").getMDependencys().add(id_0148033c00019dcb0000000000000000);

        // dependency Signal.Base
        MDependency id_0148033c00019f430000000000000000 = new MDependency("0148033c-0001-9f43-0000-000000000000","Base","0148033c-0000-0cbe-0000-000000000000.exml",this.mClass.get("GeneralClass"),true,false,false,false);
        this.mClass.get("Signal").getMDependencys().add(id_0148033c00019f430000000000000000);

        // dependency Signal.Receiver
        MDependency id_00d00f24000011950000000000000000 = new MDependency("00d00f24-0000-1195-0000-000000000000","Receiver","0148033c-0000-0cbe-0000-000000000000.exml",this.mClass.get("AcceptSignalAction"),false,false,false,false);
        this.mClass.get("Signal").getMDependencys().add(id_00d00f24000011950000000000000000);

        // dependency Event.Triggered
        MDependency id_0148033c00019d820000000000000000 = new MDependency("0148033c-0001-9d82-0000-000000000000","Triggered","0148033c-0000-0ce8-0000-000000000000.exml",this.mClass.get("Transition"),false,false,false,false);
        this.mClass.get("Event").getMDependencys().add(id_0148033c00019d820000000000000000);

        // dependency Event.Model
        MDependency id_0148033c00019dca0000000000000000 = new MDependency("0148033c-0001-9dca-0000-000000000000","Model","0148033c-0000-0ce8-0000-000000000000.exml",this.mClass.get("Signal"),true,false,false,false);
        this.mClass.get("Event").getMDependencys().add(id_0148033c00019dca0000000000000000);

        // dependency Event.Origin
        MDependency id_0148033c00019d790000000000000000 = new MDependency("0148033c-0001-9d79-0000-000000000000","Origin","0148033c-0000-0ce8-0000-000000000000.exml",this.mClass.get("State"),false,false,false,false);
        this.mClass.get("Event").getMDependencys().add(id_0148033c00019d790000000000000000);

        // dependency Event.Called
        MDependency id_0148033c00019dd30000000000000000 = new MDependency("0148033c-0001-9dd3-0000-000000000000","Called","0148033c-0000-0ce8-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("Event").getMDependencys().add(id_0148033c00019dd30000000000000000);

        // dependency Event.Composed
        MDependency id_0148033c00019d7e0000000000000000 = new MDependency("0148033c-0001-9d7e-0000-000000000000","Composed","0148033c-0000-0ce8-0000-000000000000.exml",this.mClass.get("Behavior"),true,false,false,false);
        this.mClass.get("Event").getMDependencys().add(id_0148033c00019d7e0000000000000000);

        // dependency CombinedFragment.Operand
        MDependency id_00d00f24000010210000000000000000 = new MDependency("00d00f24-0000-1021-0000-000000000000","Operand","00d00f24-0000-0fd2-0000-000000000000.exml",this.mClass.get("InteractionOperand"),false,false,false,true);
        this.mClass.get("CombinedFragment").getMDependencys().add(id_00d00f24000010210000000000000000);

        // dependency CombinedFragment.FragmentGate
        MDependency id_00d00f240000101c0000000000000000 = new MDependency("00d00f24-0000-101c-0000-000000000000","FragmentGate","00d00f24-0000-0fd2-0000-000000000000.exml",this.mClass.get("Gate"),false,false,false,true);
        this.mClass.get("CombinedFragment").getMDependencys().add(id_00d00f240000101c0000000000000000);

        // dependency ExecutionOccurenceSpecification.Finished
        MDependency id_00d00f240000103a0000000000000000 = new MDependency("00d00f24-0000-103a-0000-000000000000","Finished","00d00f24-0000-0fd6-0000-000000000000.exml",this.mClass.get("ExecutionSpecification"),true,false,false,false);
        this.mClass.get("ExecutionOccurenceSpecification").getMDependencys().add(id_00d00f240000103a0000000000000000);

        // dependency ExecutionOccurenceSpecification.Started
        MDependency id_00d00f24000010320000000000000000 = new MDependency("00d00f24-0000-1032-0000-000000000000","Started","00d00f24-0000-0fd6-0000-000000000000.exml",this.mClass.get("ExecutionSpecification"),true,false,false,false);
        this.mClass.get("ExecutionOccurenceSpecification").getMDependencys().add(id_00d00f24000010320000000000000000);

        // dependency ExecutionSpecification.Finish
        MDependency id_00d00f24000010380000000000000000 = new MDependency("00d00f24-0000-1038-0000-000000000000","Finish","00d00f24-0000-0fd8-0000-000000000000.exml",this.mClass.get("ExecutionOccurenceSpecification"),true,false,false,false);
        this.mClass.get("ExecutionSpecification").getMDependencys().add(id_00d00f24000010380000000000000000);

        // dependency ExecutionSpecification.Start
        MDependency id_00d00f24000010300000000000000000 = new MDependency("00d00f24-0000-1030-0000-000000000000","Start","00d00f24-0000-0fd8-0000-000000000000.exml",this.mClass.get("ExecutionOccurenceSpecification"),true,false,false,false);
        this.mClass.get("ExecutionSpecification").getMDependencys().add(id_00d00f24000010300000000000000000);

        // dependency Gate.OwnerUse
        MDependency id_00d00f24000010910000000000000000 = new MDependency("00d00f24-0000-1091-0000-000000000000","OwnerUse","00d00f24-0000-0fda-0000-000000000000.exml",this.mClass.get("InteractionUse"),true,false,false,false);
        this.mClass.get("Gate").getMDependencys().add(id_00d00f24000010910000000000000000);

        // dependency Gate.Actual
        MDependency id_00d00f240000103e0000000000000000 = new MDependency("00d00f24-0000-103e-0000-000000000000","Actual","00d00f24-0000-0fda-0000-000000000000.exml",this.mClass.get("Gate"),false,false,false,false);
        this.mClass.get("Gate").getMDependencys().add(id_00d00f240000103e0000000000000000);

        // dependency Gate.OwnerInteraction
        MDependency id_00d00f24000010510000000000000000 = new MDependency("00d00f24-0000-1051-0000-000000000000","OwnerInteraction","00d00f24-0000-0fda-0000-000000000000.exml",this.mClass.get("Interaction"),true,false,false,false);
        this.mClass.get("Gate").getMDependencys().add(id_00d00f24000010510000000000000000);

        // dependency Gate.OwnerFragment
        MDependency id_00d00f240000101e0000000000000000 = new MDependency("00d00f24-0000-101e-0000-000000000000","OwnerFragment","00d00f24-0000-0fda-0000-000000000000.exml",this.mClass.get("CombinedFragment"),true,false,false,false);
        this.mClass.get("Gate").getMDependencys().add(id_00d00f240000101e0000000000000000);

        // dependency Gate.Formal
        MDependency id_00d00f240000103c0000000000000000 = new MDependency("00d00f24-0000-103c-0000-000000000000","Formal","00d00f24-0000-0fda-0000-000000000000.exml",this.mClass.get("Gate"),true,false,false,false);
        this.mClass.get("Gate").getMDependencys().add(id_00d00f240000103c0000000000000000);

        // dependency GeneralOrdering.Before
        MDependency id_00d00f24000016c20000000000000000 = new MDependency("00d00f24-0000-16c2-0000-000000000000","Before","00d00f24-0000-0fdc-0000-000000000000.exml",this.mClass.get("OccurrenceSpecification"),true,false,false,false);
        this.mClass.get("GeneralOrdering").getMDependencys().add(id_00d00f24000016c20000000000000000);

        // dependency GeneralOrdering.After
        MDependency id_00d00f24000010400000000000000000 = new MDependency("00d00f24-0000-1040-0000-000000000000","After","00d00f24-0000-0fdc-0000-000000000000.exml",this.mClass.get("OccurrenceSpecification"),true,false,false,false);
        this.mClass.get("GeneralOrdering").getMDependencys().add(id_00d00f24000010400000000000000000);

        // dependency Interaction.FormalGate
        MDependency id_00d00f24000010500000000000000000 = new MDependency("00d00f24-0000-1050-0000-000000000000","FormalGate","0148033c-0000-0cc1-0000-000000000000.exml",this.mClass.get("Gate"),false,false,false,true);
        this.mClass.get("Interaction").getMDependencys().add(id_00d00f24000010500000000000000000);

        // dependency Interaction.Fragment
        MDependency id_00d00f240000105a0000000000000000 = new MDependency("00d00f24-0000-105a-0000-000000000000","Fragment","0148033c-0000-0cc1-0000-000000000000.exml",this.mClass.get("InteractionFragment"),false,false,false,true);
        this.mClass.get("Interaction").getMDependencys().add(id_00d00f240000105a0000000000000000);

        // dependency Interaction.OwnedLine
        MDependency id_00d00f240000106e0000000000000000 = new MDependency("00d00f24-0000-106e-0000-000000000000","OwnedLine","0148033c-0000-0cc1-0000-000000000000.exml",this.mClass.get("Lifeline"),false,false,false,true);
        this.mClass.get("Interaction").getMDependencys().add(id_00d00f240000106e0000000000000000);

        // dependency Interaction.ReferedUse
        MDependency id_00d00f240000108d0000000000000000 = new MDependency("00d00f24-0000-108d-0000-000000000000","ReferedUse","0148033c-0000-0cc1-0000-000000000000.exml",this.mClass.get("InteractionUse"),false,false,false,false);
        this.mClass.get("Interaction").getMDependencys().add(id_00d00f240000108d0000000000000000);

        // dependency InteractionFragment.EnclosingOperand
        MDependency id_00d00f24000010880000000000000000 = new MDependency("00d00f24-0000-1088-0000-000000000000","EnclosingOperand","00d00f24-0000-0fde-0000-000000000000.exml",this.mClass.get("InteractionOperand"),true,false,false,false);
        this.mClass.get("InteractionFragment").getMDependencys().add(id_00d00f24000010880000000000000000);

        // dependency InteractionFragment.EnclosingInteraction
        MDependency id_00d00f240000105b0000000000000000 = new MDependency("00d00f24-0000-105b-0000-000000000000","EnclosingInteraction","00d00f24-0000-0fde-0000-000000000000.exml",this.mClass.get("Interaction"),true,false,false,false);
        this.mClass.get("InteractionFragment").getMDependencys().add(id_00d00f240000105b0000000000000000);

        // dependency InteractionFragment.Covered
        MDependency id_00d00f240000107f0000000000000000 = new MDependency("00d00f24-0000-107f-0000-000000000000","Covered","00d00f24-0000-0fde-0000-000000000000.exml",this.mClass.get("Lifeline"),false,false,false,false);
        this.mClass.get("InteractionFragment").getMDependencys().add(id_00d00f240000107f0000000000000000);

        // dependency InteractionOperand.Fragment
        MDependency id_00d00f24000010860000000000000000 = new MDependency("00d00f24-0000-1086-0000-000000000000","Fragment","00d00f24-0000-0fe0-0000-000000000000.exml",this.mClass.get("InteractionFragment"),false,false,false,true);
        this.mClass.get("InteractionOperand").getMDependencys().add(id_00d00f24000010860000000000000000);

        // dependency InteractionOperand.OwnerFragment
        MDependency id_00d00f24000010230000000000000000 = new MDependency("00d00f24-0000-1023-0000-000000000000","OwnerFragment","00d00f24-0000-0fe0-0000-000000000000.exml",this.mClass.get("CombinedFragment"),true,false,false,false);
        this.mClass.get("InteractionOperand").getMDependencys().add(id_00d00f24000010230000000000000000);

        // dependency InteractionUse.ActualGate
        MDependency id_00d00f240000108f0000000000000000 = new MDependency("00d00f24-0000-108f-0000-000000000000","ActualGate","00d00f24-0000-0fe2-0000-000000000000.exml",this.mClass.get("Gate"),false,false,false,true);
        this.mClass.get("InteractionUse").getMDependencys().add(id_00d00f240000108f0000000000000000);

        // dependency InteractionUse.RefersTo
        MDependency id_00d00f240000108b0000000000000000 = new MDependency("00d00f24-0000-108b-0000-000000000000","RefersTo","00d00f24-0000-0fe2-0000-000000000000.exml",this.mClass.get("Interaction"),true,false,false,false);
        this.mClass.get("InteractionUse").getMDependencys().add(id_00d00f240000108b0000000000000000);

        // dependency Lifeline.CoveredBy
        MDependency id_00d00f24000010810000000000000000 = new MDependency("00d00f24-0000-1081-0000-000000000000","CoveredBy","00d00f24-0000-0fe4-0000-000000000000.exml",this.mClass.get("InteractionFragment"),false,false,false,false);
        this.mClass.get("Lifeline").getMDependencys().add(id_00d00f24000010810000000000000000);

        // dependency Lifeline.DecomposedAs
        MDependency id_00d00f240000109a0000000000000000 = new MDependency("00d00f24-0000-109a-0000-000000000000","DecomposedAs","00d00f24-0000-0fe4-0000-000000000000.exml",this.mClass.get("PartDecomposition"),true,false,false,true);
        this.mClass.get("Lifeline").getMDependencys().add(id_00d00f240000109a0000000000000000);

        // dependency Lifeline.Owner
        MDependency id_00d00f240000106f0000000000000000 = new MDependency("00d00f24-0000-106f-0000-000000000000","Owner","00d00f24-0000-0fe4-0000-000000000000.exml",this.mClass.get("Interaction"),true,false,false,false);
        this.mClass.get("Lifeline").getMDependencys().add(id_00d00f240000106f0000000000000000);

        // dependency Lifeline.Represented
        MDependency id_00d00f24000010960000000000000000 = new MDependency("00d00f24-0000-1096-0000-000000000000","Represented","00d00f24-0000-0fe4-0000-000000000000.exml",this.mClass.get("Instance"),true,false,false,false);
        this.mClass.get("Lifeline").getMDependencys().add(id_00d00f24000010960000000000000000);

        // dependency Message.SignalSignature
        MDependency id_00d00f24000016e10000000000000000 = new MDependency("00d00f24-0000-16e1-0000-000000000000","SignalSignature","0148033c-0000-0cce-0000-000000000000.exml",this.mClass.get("Signal"),true,false,false,false);
        this.mClass.get("Message").getMDependencys().add(id_00d00f24000016e10000000000000000);

        // dependency Message.ReceiveEvent
        MDependency id_00d00f24000012840000000000000000 = new MDependency("00d00f24-0000-1284-0000-000000000000","ReceiveEvent","0148033c-0000-0cce-0000-000000000000.exml",this.mClass.get("MessageEnd"),true,false,false,false);
        this.mClass.get("Message").getMDependencys().add(id_00d00f24000012840000000000000000);

        // dependency Message.SendEvent
        MDependency id_00d00f240000127a0000000000000000 = new MDependency("00d00f24-0000-127a-0000-000000000000","SendEvent","0148033c-0000-0cce-0000-000000000000.exml",this.mClass.get("MessageEnd"),true,false,false,false);
        this.mClass.get("Message").getMDependencys().add(id_00d00f240000127a0000000000000000);

        // dependency Message.Invoked
        MDependency id_0148033c0001a6030000000000000000 = new MDependency("0148033c-0001-a603-0000-000000000000","Invoked","0148033c-0000-0cce-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("Message").getMDependencys().add(id_0148033c0001a6030000000000000000);

        // dependency Message.RealizedInformationFlow
        MDependency id_00d00f24000012c10000000000000000 = new MDependency("00d00f24-0000-12c1-0000-000000000000","RealizedInformationFlow","0148033c-0000-0cce-0000-000000000000.exml",this.mClass.get("InformationFlow"),false,false,false,false);
        this.mClass.get("Message").getMDependencys().add(id_00d00f24000012c10000000000000000);

        // dependency MessageEnd.ReceivedMessage
        MDependency id_00d00f24000012850000000000000000 = new MDependency("00d00f24-0000-1285-0000-000000000000","ReceivedMessage","00d00f24-0000-0fe6-0000-000000000000.exml",this.mClass.get("Message"),true,false,false,false);
        this.mClass.get("MessageEnd").getMDependencys().add(id_00d00f24000012850000000000000000);

        // dependency MessageEnd.SentMessage
        MDependency id_00d00f240000127b0000000000000000 = new MDependency("00d00f24-0000-127b-0000-000000000000","SentMessage","00d00f24-0000-0fe6-0000-000000000000.exml",this.mClass.get("Message"),true,false,false,true);
        this.mClass.get("MessageEnd").getMDependencys().add(id_00d00f240000127b0000000000000000);

        // dependency OccurrenceSpecification.ToAfter
        MDependency id_00d00f24000016c10000000000000000 = new MDependency("00d00f24-0000-16c1-0000-000000000000","ToAfter","00d00f24-0000-0fe8-0000-000000000000.exml",this.mClass.get("GeneralOrdering"),false,false,false,true);
        this.mClass.get("OccurrenceSpecification").getMDependencys().add(id_00d00f24000016c10000000000000000);

        // dependency OccurrenceSpecification.ToBefore
        MDependency id_00d00f24000010420000000000000000 = new MDependency("00d00f24-0000-1042-0000-000000000000","ToBefore","00d00f24-0000-0fe8-0000-000000000000.exml",this.mClass.get("GeneralOrdering"),false,false,false,false);
        this.mClass.get("OccurrenceSpecification").getMDependencys().add(id_00d00f24000010420000000000000000);

        // dependency PartDecomposition.Decomposed
        MDependency id_00d00f240000109c0000000000000000 = new MDependency("00d00f24-0000-109c-0000-000000000000","Decomposed","00d00f24-0000-0fea-0000-000000000000.exml",this.mClass.get("Lifeline"),true,false,false,false);
        this.mClass.get("PartDecomposition").getMDependencys().add(id_00d00f240000109c0000000000000000);

        // dependency ConnectionPointReference.Exit
        MDependency id_00d00f240000178b0000000000000000 = new MDependency("00d00f24-0000-178b-0000-000000000000","Exit","00d00f24-0000-1779-0000-000000000000.exml",this.mClass.get("ExitPointPseudoState"),true,false,false,false);
        this.mClass.get("ConnectionPointReference").getMDependencys().add(id_00d00f240000178b0000000000000000);

        // dependency ConnectionPointReference.Entry
        MDependency id_00d00f24000017820000000000000000 = new MDependency("00d00f24-0000-1782-0000-000000000000","Entry","00d00f24-0000-1779-0000-000000000000.exml",this.mClass.get("EntryPointPseudoState"),true,false,false,false);
        this.mClass.get("ConnectionPointReference").getMDependencys().add(id_00d00f24000017820000000000000000);

        // dependency ConnectionPointReference.OwnerState
        MDependency id_00d00f24000017990000000000000000 = new MDependency("00d00f24-0000-1799-0000-000000000000","OwnerState","00d00f24-0000-1779-0000-000000000000.exml",this.mClass.get("State"),true,false,false,false);
        this.mClass.get("ConnectionPointReference").getMDependencys().add(id_00d00f24000017990000000000000000);

        // dependency EntryPointPseudoState.EntryOf
        MDependency id_2bcde3eaa50311dd81f5001ec947ccaf = new MDependency("2bcde3ea-a503-11dd-81f5-001ec947ccaf","EntryOf","00d00f24-0000-1725-0000-000000000000.exml",this.mClass.get("State"),true,false,false,false);
        this.mClass.get("EntryPointPseudoState").getMDependencys().add(id_2bcde3eaa50311dd81f5001ec947ccaf);

        // dependency EntryPointPseudoState.Connection
        MDependency id_00d00f24000017830000000000000000 = new MDependency("00d00f24-0000-1783-0000-000000000000","Connection","00d00f24-0000-1725-0000-000000000000.exml",this.mClass.get("ConnectionPointReference"),false,false,false,false);
        this.mClass.get("EntryPointPseudoState").getMDependencys().add(id_00d00f24000017830000000000000000);

        // dependency EntryPointPseudoState.EntryOfMachine
        MDependency id_f3fd19af401f11e08d8f001ec947ccaf = new MDependency("f3fd19af-401f-11e0-8d8f-001ec947ccaf","EntryOfMachine","00d00f24-0000-1725-0000-000000000000.exml",this.mClass.get("StateMachine"),true,false,false,false);
        this.mClass.get("EntryPointPseudoState").getMDependencys().add(id_f3fd19af401f11e08d8f001ec947ccaf);

        // dependency ExitPointPseudoState.ExitOf
        MDependency id_30b18407a50311dd81f5001ec947ccaf = new MDependency("30b18407-a503-11dd-81f5-001ec947ccaf","ExitOf","00d00f24-0000-1727-0000-000000000000.exml",this.mClass.get("State"),true,false,false,false);
        this.mClass.get("ExitPointPseudoState").getMDependencys().add(id_30b18407a50311dd81f5001ec947ccaf);

        // dependency ExitPointPseudoState.Connection
        MDependency id_00d00f240000178c0000000000000000 = new MDependency("00d00f24-0000-178c-0000-000000000000","Connection","00d00f24-0000-1727-0000-000000000000.exml",this.mClass.get("ConnectionPointReference"),false,false,false,false);
        this.mClass.get("ExitPointPseudoState").getMDependencys().add(id_00d00f240000178c0000000000000000);

        // dependency ExitPointPseudoState.ExitOfMachine
        MDependency id_f3fd19b0401f11e08d8f001ec947ccaf = new MDependency("f3fd19b0-401f-11e0-8d8f-001ec947ccaf","ExitOfMachine","00d00f24-0000-1727-0000-000000000000.exml",this.mClass.get("StateMachine"),true,false,false,false);
        this.mClass.get("ExitPointPseudoState").getMDependencys().add(id_f3fd19b0401f11e08d8f001ec947ccaf);

        // dependency InternalTransition.SComposed
        MDependency id_0148033c0001a2c80000000000000000 = new MDependency("0148033c-0001-a2c8-0000-000000000000","SComposed","0148033c-0000-0ce6-0000-000000000000.exml",this.mClass.get("State"),true,false,false,false);
        this.mClass.get("InternalTransition").getMDependencys().add(id_0148033c0001a2c80000000000000000);

        // dependency State.ExitPoint
        MDependency id_30b18406a50311dd81f5001ec947ccaf = new MDependency("30b18406-a503-11dd-81f5-001ec947ccaf","ExitPoint","0148033c-0000-0ce3-0000-000000000000.exml",this.mClass.get("ExitPointPseudoState"),false,false,false,true);
        this.mClass.get("State").getMDependencys().add(id_30b18406a50311dd81f5001ec947ccaf);

        // dependency State.BpmnDataStateRefs
        MDependency id_7f73f20f18d611e09cf7001ec947ccaf = new MDependency("7f73f20f-18d6-11e0-9cf7-001ec947ccaf","BpmnDataStateRefs","0148033c-0000-0ce3-0000-000000000000.exml",this.mClass.get("BpmnDataState"),false,false,false,false);
        this.mClass.get("State").getMDependencys().add(id_7f73f20f18d611e09cf7001ec947ccaf);

        // dependency State.Deffered
        MDependency id_0148033c00019d7a0000000000000000 = new MDependency("0148033c-0001-9d7a-0000-000000000000","Deffered","0148033c-0000-0ce3-0000-000000000000.exml",this.mClass.get("Event"),false,false,false,false);
        this.mClass.get("State").getMDependencys().add(id_0148033c00019d7a0000000000000000);

        // dependency State.Internal
        MDependency id_0148033c0001a2c90000000000000000 = new MDependency("0148033c-0001-a2c9-0000-000000000000","Internal","0148033c-0000-0ce3-0000-000000000000.exml",this.mClass.get("InternalTransition"),false,false,false,true);
        this.mClass.get("State").getMDependencys().add(id_0148033c0001a2c90000000000000000);

        // dependency State.EntryPoint
        MDependency id_2bcde3e9a50311dd81f5001ec947ccaf = new MDependency("2bcde3e9-a503-11dd-81f5-001ec947ccaf","EntryPoint","0148033c-0000-0ce3-0000-000000000000.exml",this.mClass.get("EntryPointPseudoState"),false,false,false,true);
        this.mClass.get("State").getMDependencys().add(id_2bcde3e9a50311dd81f5001ec947ccaf);

        // dependency State.OwnedRegion
        MDependency id_0148033c0001b6100000000000000000 = new MDependency("0148033c-0001-b610-0000-000000000000","OwnedRegion","0148033c-0000-0ce3-0000-000000000000.exml",this.mClass.get("Region"),false,false,false,true);
        this.mClass.get("State").getMDependencys().add(id_0148033c0001b6100000000000000000);

        // dependency State.RequiredStateOfBpmnMessage
        MDependency id_24aa38c4fbc811e086b2001ec947ccaf = new MDependency("24aa38c4-fbc8-11e0-86b2-001ec947ccaf","RequiredStateOfBpmnMessage","0148033c-0000-0ce3-0000-000000000000.exml",this.mClass.get("BpmnMessage"),false,false,false,false);
        this.mClass.get("State").getMDependencys().add(id_24aa38c4fbc811e086b2001ec947ccaf);

        // dependency State.RequiredStateOf
        MDependency id_00d0113800035ea20000000000000000 = new MDependency("00d01138-0003-5ea2-0000-000000000000","RequiredStateOf","0148033c-0000-0ce3-0000-000000000000.exml",this.mClass.get("ObjectNode"),false,false,false,false);
        this.mClass.get("State").getMDependencys().add(id_00d0113800035ea20000000000000000);

        // dependency State.Connection
        MDependency id_00d00f24000017980000000000000000 = new MDependency("00d00f24-0000-1798-0000-000000000000","Connection","0148033c-0000-0ce3-0000-000000000000.exml",this.mClass.get("ConnectionPointReference"),false,false,false,true);
        this.mClass.get("State").getMDependencys().add(id_00d00f24000017980000000000000000);

        // dependency State.SubMachine
        MDependency id_00d00f240000111a0000000000000000 = new MDependency("00d00f24-0000-111a-0000-000000000000","SubMachine","0148033c-0000-0ce3-0000-000000000000.exml",this.mClass.get("StateMachine"),true,false,false,false);
        this.mClass.get("State").getMDependencys().add(id_00d00f240000111a0000000000000000);

        // dependency State.RequiredStateOfBpmnItem
        MDependency id_b45c0fa1fbc711e086b2001ec947ccaf = new MDependency("b45c0fa1-fbc7-11e0-86b2-001ec947ccaf","RequiredStateOfBpmnItem","0148033c-0000-0ce3-0000-000000000000.exml",this.mClass.get("BpmnItemAwareElement"),false,false,false,false);
        this.mClass.get("State").getMDependencys().add(id_b45c0fa1fbc711e086b2001ec947ccaf);

        // dependency StateMachine.Top
        MDependency id_0148033c0001b8ec0000000000000000 = new MDependency("0148033c-0001-b8ec-0000-000000000000","Top","0148033c-0000-0ce1-0000-000000000000.exml",this.mClass.get("Region"),true,false,false,true);
        this.mClass.get("StateMachine").getMDependencys().add(id_0148033c0001b8ec0000000000000000);

        // dependency StateMachine.SubmachineState
        MDependency id_00d00f240000111b0000000000000000 = new MDependency("00d00f24-0000-111b-0000-000000000000","SubmachineState","0148033c-0000-0ce1-0000-000000000000.exml",this.mClass.get("State"),false,false,false,false);
        this.mClass.get("StateMachine").getMDependencys().add(id_00d00f240000111b0000000000000000);

        // dependency StateMachine.EntryPoint
        MDependency id_f3fd19b3401f11e08d8f001ec947ccaf = new MDependency("f3fd19b3-401f-11e0-8d8f-001ec947ccaf","EntryPoint","0148033c-0000-0ce1-0000-000000000000.exml",this.mClass.get("EntryPointPseudoState"),false,false,false,true);
        this.mClass.get("StateMachine").getMDependencys().add(id_f3fd19b3401f11e08d8f001ec947ccaf);

        // dependency StateMachine.ExitPoint
        MDependency id_f3fd19b4401f11e08d8f001ec947ccaf = new MDependency("f3fd19b4-401f-11e0-8d8f-001ec947ccaf","ExitPoint","0148033c-0000-0ce1-0000-000000000000.exml",this.mClass.get("ExitPointPseudoState"),false,false,false,true);
        this.mClass.get("StateMachine").getMDependencys().add(id_f3fd19b4401f11e08d8f001ec947ccaf);

        // dependency StateVertex.OutGoing
        MDependency id_0148033c0001bc330000000000000000 = new MDependency("0148033c-0001-bc33-0000-000000000000","OutGoing","0148033c-0000-0ce2-0000-000000000000.exml",this.mClass.get("Transition"),false,false,false,true);
        this.mClass.get("StateVertex").getMDependencys().add(id_0148033c0001bc330000000000000000);

        // dependency StateVertex.Incoming
        MDependency id_0148033c0001bbd70000000000000000 = new MDependency("0148033c-0001-bbd7-0000-000000000000","Incoming","0148033c-0000-0ce2-0000-000000000000.exml",this.mClass.get("Transition"),false,false,false,false);
        this.mClass.get("StateVertex").getMDependencys().add(id_0148033c0001bbd70000000000000000);

        // dependency StateVertex.Parent
        MDependency id_0148033c0001b8ef0000000000000000 = new MDependency("0148033c-0001-b8ef-0000-000000000000","Parent","0148033c-0000-0ce2-0000-000000000000.exml",this.mClass.get("Region"),true,false,false,false);
        this.mClass.get("StateVertex").getMDependencys().add(id_0148033c0001b8ef0000000000000000);

        // dependency Transition.Processed
        MDependency id_0148033c0001ae920000000000000000 = new MDependency("0148033c-0001-ae92-0000-000000000000","Processed","0148033c-0000-0ce5-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("Transition").getMDependencys().add(id_0148033c0001ae920000000000000000);

        // dependency Transition.Trigger
        MDependency id_0148033c00019d830000000000000000 = new MDependency("0148033c-0001-9d83-0000-000000000000","Trigger","0148033c-0000-0ce5-0000-000000000000.exml",this.mClass.get("Event"),true,false,false,false);
        this.mClass.get("Transition").getMDependencys().add(id_0148033c00019d830000000000000000);

        // dependency Transition.BehaviorEffect
        MDependency id_00d00f24000017740000000000000000 = new MDependency("00d00f24-0000-1774-0000-000000000000","BehaviorEffect","0148033c-0000-0ce5-0000-000000000000.exml",this.mClass.get("Behavior"),true,false,false,false);
        this.mClass.get("Transition").getMDependencys().add(id_00d00f24000017740000000000000000);

        // dependency Transition.Target
        MDependency id_0148033c0001bbd80000000000000000 = new MDependency("0148033c-0001-bbd8-0000-000000000000","Target","0148033c-0000-0ce5-0000-000000000000.exml",this.mClass.get("StateVertex"),true,false,false,false);
        this.mClass.get("Transition").getMDependencys().add(id_0148033c0001bbd80000000000000000);

        // dependency Transition.Source
        MDependency id_0148033c0001bc340000000000000000 = new MDependency("0148033c-0001-bc34-0000-000000000000","Source","0148033c-0000-0ce5-0000-000000000000.exml",this.mClass.get("StateVertex"),true,false,false,false);
        this.mClass.get("Transition").getMDependencys().add(id_0148033c0001bc340000000000000000);

        // dependency Transition.Effects
        MDependency id_0148033c0001b8440000000000000000 = new MDependency("0148033c-0001-b844-0000-000000000000","Effects","0148033c-0000-0ce5-0000-000000000000.exml",this.mClass.get("Signal"),true,false,false,false);
        this.mClass.get("Transition").getMDependencys().add(id_0148033c0001b8440000000000000000);

        // dependency Region.Parent
        MDependency id_0148033c0001b60f0000000000000000 = new MDependency("0148033c-0001-b60f-0000-000000000000","Parent","d79b6c03-a42c-11dd-a00b-001ec947ccaf.exml",this.mClass.get("State"),true,false,false,false);
        this.mClass.get("Region").getMDependencys().add(id_0148033c0001b60f0000000000000000);

        // dependency Region.Represented
        MDependency id_0148033c0001b8eb0000000000000000 = new MDependency("0148033c-0001-b8eb-0000-000000000000","Represented","d79b6c03-a42c-11dd-a00b-001ec947ccaf.exml",this.mClass.get("StateMachine"),true,false,false,false);
        this.mClass.get("Region").getMDependencys().add(id_0148033c0001b8eb0000000000000000);

        // dependency Region.Sub
        MDependency id_0148033c0001b8f00000000000000000 = new MDependency("0148033c-0001-b8f0-0000-000000000000","Sub","d79b6c03-a42c-11dd-a00b-001ec947ccaf.exml",this.mClass.get("StateVertex"),false,false,false,true);
        this.mClass.get("Region").getMDependencys().add(id_0148033c0001b8f00000000000000000);

        // dependency UseCase.Used
        MDependency id_0148033c0001c1df0000000000000000 = new MDependency("0148033c-0001-c1df-0000-000000000000","Used","0148033c-0000-0cd2-0000-000000000000.exml",this.mClass.get("UseCaseDependency"),false,false,false,true);
        this.mClass.get("UseCase").getMDependencys().add(id_0148033c0001c1df0000000000000000);

        // dependency UseCase.OwnedExtension
        MDependency id_00d0002400000c860000000000000000 = new MDependency("00d00024-0000-0c86-0000-000000000000","OwnedExtension","0148033c-0000-0cd2-0000-000000000000.exml",this.mClass.get("ExtensionPoint"),false,false,false,true);
        this.mClass.get("UseCase").getMDependencys().add(id_00d0002400000c860000000000000000);

        // dependency UseCase.User
        MDependency id_0148033c0001c1710000000000000000 = new MDependency("0148033c-0001-c171-0000-000000000000","User","0148033c-0000-0cd2-0000-000000000000.exml",this.mClass.get("UseCaseDependency"),false,false,false,false);
        this.mClass.get("UseCase").getMDependencys().add(id_0148033c0001c1710000000000000000);

        // dependency UseCaseDependency.Origin
        MDependency id_0148033c0001c1e00000000000000000 = new MDependency("0148033c-0001-c1e0-0000-000000000000","Origin","0148033c-0000-0cd4-0000-000000000000.exml",this.mClass.get("UseCase"),true,false,false,false);
        this.mClass.get("UseCaseDependency").getMDependencys().add(id_0148033c0001c1e00000000000000000);

        // dependency UseCaseDependency.ExtensionLocation
        MDependency id_00d0002400000caa0000000000000000 = new MDependency("00d00024-0000-0caa-0000-000000000000","ExtensionLocation","0148033c-0000-0cd4-0000-000000000000.exml",this.mClass.get("ExtensionPoint"),false,false,false,false);
        this.mClass.get("UseCaseDependency").getMDependencys().add(id_00d0002400000caa0000000000000000);

        // dependency UseCaseDependency.Target
        MDependency id_0148033c0001c1720000000000000000 = new MDependency("0148033c-0001-c172-0000-000000000000","Target","0148033c-0000-0cd4-0000-000000000000.exml",this.mClass.get("UseCase"),true,false,false,false);
        this.mClass.get("UseCaseDependency").getMDependencys().add(id_0148033c0001c1720000000000000000);

        // dependency ExtensionPoint.Extended
        MDependency id_00d0002400000ca60000000000000000 = new MDependency("00d00024-0000-0ca6-0000-000000000000","Extended","00d00024-0000-0c00-0000-000000000000.exml",this.mClass.get("UseCaseDependency"),false,false,false,false);
        this.mClass.get("ExtensionPoint").getMDependencys().add(id_00d0002400000ca60000000000000000);

        // dependency ExtensionPoint.Owner
        MDependency id_00d0002400000c900000000000000000 = new MDependency("00d00024-0000-0c90-0000-000000000000","Owner","00d00024-0000-0c00-0000-000000000000.exml",this.mClass.get("UseCase"),true,false,false,false);
        this.mClass.get("ExtensionPoint").getMDependencys().add(id_00d0002400000c900000000000000000);

        // dependency CommunicationInteraction.Owned
        MDependency id_01ec00cc00172b640000000000000000 = new MDependency("01ec00cc-0017-2b64-0000-000000000000","Owned","01ec00cc-0017-2ad3-0000-000000000000.exml",this.mClass.get("CommunicationNode"),false,false,false,true);
        this.mClass.get("CommunicationInteraction").getMDependencys().add(id_01ec00cc00172b640000000000000000);

        // dependency CommunicationNode.Owner
        MDependency id_01ec00cc00172b600000000000000000 = new MDependency("01ec00cc-0017-2b60-0000-000000000000","Owner","01ec00cc-0017-2b33-0000-000000000000.exml",this.mClass.get("CommunicationInteraction"),true,false,false,false);
        this.mClass.get("CommunicationNode").getMDependencys().add(id_01ec00cc00172b600000000000000000);

        // dependency CommunicationNode.Represented
        MDependency id_01ec00cc00172b6d0000000000000000 = new MDependency("01ec00cc-0017-2b6d-0000-000000000000","Represented","01ec00cc-0017-2b33-0000-000000000000.exml",this.mClass.get("Instance"),true,false,false,false);
        this.mClass.get("CommunicationNode").getMDependencys().add(id_01ec00cc00172b6d0000000000000000);

        // dependency CommunicationNode.Started
        MDependency id_01ec00cc00172ccd0000000000000000 = new MDependency("01ec00cc-0017-2ccd-0000-000000000000","Started","01ec00cc-0017-2b33-0000-000000000000.exml",this.mClass.get("CommunicationChannel"),false,false,false,true);
        this.mClass.get("CommunicationNode").getMDependencys().add(id_01ec00cc00172ccd0000000000000000);

        // dependency CommunicationNode.Ended
        MDependency id_01ec00cc00172cd80000000000000000 = new MDependency("01ec00cc-0017-2cd8-0000-000000000000","Ended","01ec00cc-0017-2b33-0000-000000000000.exml",this.mClass.get("CommunicationChannel"),false,false,false,false);
        this.mClass.get("CommunicationNode").getMDependencys().add(id_01ec00cc00172cd80000000000000000);

        // dependency CommunicationMessage.RealizedInformationFlow
        MDependency id_01ec00cc00172dda0000000000000000 = new MDependency("01ec00cc-0017-2dda-0000-000000000000","RealizedInformationFlow","01ec00cc-0017-2da0-0000-000000000000.exml",this.mClass.get("InformationFlow"),false,false,false,false);
        this.mClass.get("CommunicationMessage").getMDependencys().add(id_01ec00cc00172dda0000000000000000);

        // dependency CommunicationMessage.Channel
        MDependency id_5ffb8c43b2434049b61f969fa38ad315 = new MDependency("5ffb8c43-b243-4049-b61f-969fa38ad315","Channel","01ec00cc-0017-2da0-0000-000000000000.exml",this.mClass.get("CommunicationChannel"),true,false,false,false);
        this.mClass.get("CommunicationMessage").getMDependencys().add(id_5ffb8c43b2434049b61f969fa38ad315);

        // dependency CommunicationMessage.InvertedChannel
        MDependency id_13359df9a9f04442aa81835d8d9f8426 = new MDependency("13359df9-a9f0-4442-aa81-835d8d9f8426","InvertedChannel","01ec00cc-0017-2da0-0000-000000000000.exml",this.mClass.get("CommunicationChannel"),true,false,false,false);
        this.mClass.get("CommunicationMessage").getMDependencys().add(id_13359df9a9f04442aa81835d8d9f8426);

        // dependency CommunicationMessage.Invoked
        MDependency id_01ec00cc00172dc60000000000000000 = new MDependency("01ec00cc-0017-2dc6-0000-000000000000","Invoked","01ec00cc-0017-2da0-0000-000000000000.exml",this.mClass.get("Operation"),true,false,false,false);
        this.mClass.get("CommunicationMessage").getMDependencys().add(id_01ec00cc00172dc60000000000000000);

        // dependency CommunicationMessage.SignalSignature
        MDependency id_01ec00cc00172e090000000000000000 = new MDependency("01ec00cc-0017-2e09-0000-000000000000","SignalSignature","01ec00cc-0017-2da0-0000-000000000000.exml",this.mClass.get("Signal"),true,false,false,false);
        this.mClass.get("CommunicationMessage").getMDependencys().add(id_01ec00cc00172e090000000000000000);

        // dependency CommunicationChannel.StartToEndMessage
        MDependency id_32e34bc947364042b4d255acb153d897 = new MDependency("32e34bc9-4736-4042-b4d2-55acb153d897","StartToEndMessage","fbce3b8c-0768-42e0-a09b-78f366bdeb73.exml",this.mClass.get("CommunicationMessage"),false,false,false,true);
        this.mClass.get("CommunicationChannel").getMDependencys().add(id_32e34bc947364042b4d255acb153d897);

        // dependency CommunicationChannel.Channel
        MDependency id_4ad99f06fb3c47a4b8052ee9dad28888 = new MDependency("4ad99f06-fb3c-47a4-b805-2ee9dad28888","Channel","fbce3b8c-0768-42e0-a09b-78f366bdeb73.exml",this.mClass.get("Link"),true,false,false,false);
        this.mClass.get("CommunicationChannel").getMDependencys().add(id_4ad99f06fb3c47a4b8052ee9dad28888);

        // dependency CommunicationChannel.Start
        MDependency id_01ec00cc00172cc80000000000000000 = new MDependency("01ec00cc-0017-2cc8-0000-000000000000","Start","fbce3b8c-0768-42e0-a09b-78f366bdeb73.exml",this.mClass.get("CommunicationNode"),true,false,false,false);
        this.mClass.get("CommunicationChannel").getMDependencys().add(id_01ec00cc00172cc80000000000000000);

        // dependency CommunicationChannel.NaryChannel
        MDependency id_0013c0d6131a10a188a0001ec947cd2a = new MDependency("0013c0d6-131a-10a1-88a0-001ec947cd2a","NaryChannel","fbce3b8c-0768-42e0-a09b-78f366bdeb73.exml",this.mClass.get("NaryLink"),true,false,false,false);
        this.mClass.get("CommunicationChannel").getMDependencys().add(id_0013c0d6131a10a188a0001ec947cd2a);

        // dependency CommunicationChannel.EndToStartMessage
        MDependency id_205c4095048941e1a714af46792896a3 = new MDependency("205c4095-0489-41e1-a714-af46792896a3","EndToStartMessage","fbce3b8c-0768-42e0-a09b-78f366bdeb73.exml",this.mClass.get("CommunicationMessage"),false,false,false,true);
        this.mClass.get("CommunicationChannel").getMDependencys().add(id_205c4095048941e1a714af46792896a3);

        // dependency CommunicationChannel.End
        MDependency id_01ec00cc00172cd30000000000000000 = new MDependency("01ec00cc-0017-2cd3-0000-000000000000","End","fbce3b8c-0768-42e0-a09b-78f366bdeb73.exml",this.mClass.get("CommunicationNode"),true,false,false,false);
        this.mClass.get("CommunicationChannel").getMDependencys().add(id_01ec00cc00172cd30000000000000000);

        // dependency InformationFlow.Owner
        MDependency id_00d00f24000012f50000000000000000 = new MDependency("00d00f24-0000-12f5-0000-000000000000","Owner","00d00f24-0000-128a-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("InformationFlow").getMDependencys().add(id_00d00f24000012f50000000000000000);

        // dependency InformationFlow.InformationSource
        MDependency id_00d00f24000012e80000000000000000 = new MDependency("00d00f24-0000-12e8-0000-000000000000","InformationSource","00d00f24-0000-128a-0000-000000000000.exml",this.mClass.get("ModelElement"),false,false,false,false);
        this.mClass.get("InformationFlow").getMDependencys().add(id_00d00f24000012e80000000000000000);

        // dependency InformationFlow.InformationTarget
        MDependency id_00d00f24000012dd0000000000000000 = new MDependency("00d00f24-0000-12dd-0000-000000000000","InformationTarget","00d00f24-0000-128a-0000-000000000000.exml",this.mClass.get("ModelElement"),false,false,false,false);
        this.mClass.get("InformationFlow").getMDependencys().add(id_00d00f24000012dd0000000000000000);

        // dependency InformationFlow.RealizingActivityEdge
        MDependency id_00d00f24000012b50000000000000000 = new MDependency("00d00f24-0000-12b5-0000-000000000000","RealizingActivityEdge","00d00f24-0000-128a-0000-000000000000.exml",this.mClass.get("ActivityEdge"),false,false,false,false);
        this.mClass.get("InformationFlow").getMDependencys().add(id_00d00f24000012b50000000000000000);

        // dependency InformationFlow.RealizingCommunicationMessage
        MDependency id_01ec00cc00172de10000000000000000 = new MDependency("01ec00cc-0017-2de1-0000-000000000000","RealizingCommunicationMessage","00d00f24-0000-128a-0000-000000000000.exml",this.mClass.get("CommunicationMessage"),false,false,false,false);
        this.mClass.get("InformationFlow").getMDependencys().add(id_01ec00cc00172de10000000000000000);

        // dependency InformationFlow.RealizingFeature
        MDependency id_00d00f24000012aa0000000000000000 = new MDependency("00d00f24-0000-12aa-0000-000000000000","RealizingFeature","00d00f24-0000-128a-0000-000000000000.exml",this.mClass.get("StructuralFeature"),false,false,false,false);
        this.mClass.get("InformationFlow").getMDependencys().add(id_00d00f24000012aa0000000000000000);

        // dependency InformationFlow.RealizingLink
        MDependency id_00d00f24000012a00000000000000000 = new MDependency("00d00f24-0000-12a0-0000-000000000000","RealizingLink","00d00f24-0000-128a-0000-000000000000.exml",this.mClass.get("LinkEnd"),false,false,false,false);
        this.mClass.get("InformationFlow").getMDependencys().add(id_00d00f24000012a00000000000000000);

        // dependency InformationFlow.RealizingMessage
        MDependency id_00d00f24000012c00000000000000000 = new MDependency("00d00f24-0000-12c0-0000-000000000000","RealizingMessage","00d00f24-0000-128a-0000-000000000000.exml",this.mClass.get("Message"),false,false,false,false);
        this.mClass.get("InformationFlow").getMDependencys().add(id_00d00f24000012c00000000000000000);

        // dependency InformationFlow.RealizingNaryLink
        MDependency id_0013b776131a10a188a0001ec947cd2a = new MDependency("0013b776-131a-10a1-88a0-001ec947cd2a","RealizingNaryLink","00d00f24-0000-128a-0000-000000000000.exml",this.mClass.get("NaryLink"),false,false,false,false);
        this.mClass.get("InformationFlow").getMDependencys().add(id_0013b776131a10a188a0001ec947cd2a);

        // dependency InformationFlow.Conveyed
        MDependency id_00d00f24000012ca0000000000000000 = new MDependency("00d00f24-0000-12ca-0000-000000000000","Conveyed","00d00f24-0000-128a-0000-000000000000.exml",this.mClass.get("Classifier"),false,false,false,false);
        this.mClass.get("InformationFlow").getMDependencys().add(id_00d00f24000012ca0000000000000000);

        // dependency InformationFlow.Channel
        MDependency id_0075a3fad1911f43b54d001ec947cd2a = new MDependency("0075a3fa-d191-1f43-b54d-001ec947cd2a","Channel","00d00f24-0000-128a-0000-000000000000.exml",this.mClass.get("AssociationEnd"),true,false,false,false);
        this.mClass.get("InformationFlow").getMDependencys().add(id_0075a3fad1911f43b54d001ec947cd2a);

        // dependency InformationItem.Represented
        MDependency id_00d00f24000012d30000000000000000 = new MDependency("00d00f24-0000-12d3-0000-000000000000","Represented","00d00f24-0000-128c-0000-000000000000.exml",this.mClass.get("Classifier"),false,false,false,false);
        this.mClass.get("InformationItem").getMDependencys().add(id_00d00f24000012d30000000000000000);

        // dependency DataFlow.Destination
        MDependency id_0148033c00019a0e0000000000000000 = new MDependency("0148033c-0001-9a0e-0000-000000000000","Destination","0148033c-0000-0cbf-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("DataFlow").getMDependencys().add(id_0148033c00019a0e0000000000000000);

        // dependency DataFlow.Origin
        MDependency id_0148033c000199b20000000000000000 = new MDependency("0148033c-0001-99b2-0000-000000000000","Origin","0148033c-0000-0cbf-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("DataFlow").getMDependencys().add(id_0148033c000199b20000000000000000);

        // dependency DataFlow.Owner
        MDependency id_0148033c000199ae0000000000000000 = new MDependency("0148033c-0001-99ae-0000-000000000000","Owner","0148033c-0000-0cbf-0000-000000000000.exml",this.mClass.get("NameSpace"),true,false,false,false);
        this.mClass.get("DataFlow").getMDependencys().add(id_0148033c000199ae0000000000000000);

        // dependency DataFlow.SModel
        MDependency id_0148033c00019a040000000000000000 = new MDependency("0148033c-0001-9a04-0000-000000000000","SModel","0148033c-0000-0cbf-0000-000000000000.exml",this.mClass.get("Signal"),true,false,false,false);
        this.mClass.get("DataFlow").getMDependencys().add(id_0148033c00019a040000000000000000);
    }

    public List<MPackage> getMPackages() {

        return mPackages;
    }

    public MClass getClassByName(String name) {

        return this.mClass.get(name);
    }

    public MDataType getDataTypeByName(String name) {

        return this.mBaseTypes.get(name);
    }

    private void initEnum() {



         // ########### Enums ###########

        this.mBaseTypes.put("BpmnProcessType", new MEnum("7f718f1d-18d6-11e0-9cf7-001ec947ccaf","BpmnProcessType","enum",java.util.Arrays.asList("NoneProcess","PublicProcess","PrivateProcess")));
        this.mBaseTypes.put("OptionalBoolean", new MEnum("5b68d75b-1982-11e0-9cf7-001ec947ccaf","OptionalBoolean","enum",java.util.Arrays.asList("OFalse","OTrue","OUndefined")));
        this.mBaseTypes.put("BpmnAssociationDirection", new MEnum("7f78b740-18d6-11e0-9cf7-001ec947ccaf","BpmnAssociationDirection","enum",java.util.Arrays.asList("NoneDirection","OneDirection","BothDirection")));
        this.mBaseTypes.put("AdHocOrdering", new MEnum("7f765489-18d6-11e0-9cf7-001ec947ccaf","AdHocOrdering","enum",java.util.Arrays.asList("ParallelOrdering","SequentialOrdering")));
        this.mBaseTypes.put("MultiInstanceBehavior", new MEnum("7f765475-18d6-11e0-9cf7-001ec947ccaf","MultiInstanceBehavior","enum",java.util.Arrays.asList("NoneBehavior","OneBehavior","AllBehavior","ComplexBehavior")));
        this.mBaseTypes.put("TransactionMethod", new MEnum("7f73f223-18d6-11e0-9cf7-001ec947ccaf","TransactionMethod","enum",java.util.Arrays.asList("compensateTransaction","storeTransaction","imageTransaction")));
        this.mBaseTypes.put("BpmnEventBasedGatewayType", new MEnum("7f7654b1-18d6-11e0-9cf7-001ec947ccaf","BpmnEventBasedGatewayType","enum",java.util.Arrays.asList("ParallelGateway","ExclusiveGateway")));
        this.mBaseTypes.put("BpmnGatewayDirection", new MEnum("7f7654cf-18d6-11e0-9cf7-001ec947ccaf","BpmnGatewayDirection","enum",java.util.Arrays.asList("UnspecifiedDirection","ConvergingDirection","DivergingDirection","MixedDirection")));
        this.mBaseTypes.put("BpmnItemKind", new MEnum("7f7654c6-18d6-11e0-9cf7-001ec947ccaf","BpmnItemKind","enum",java.util.Arrays.asList("physical","information")));
        this.mBaseTypes.put("ModuleState", new MEnum("0148033c-0000-0d27-0000-000000000000","ModuleState","enum",java.util.Arrays.asList("SoModuleStateDesactivated","SoModuleStateActivated")));
        this.mBaseTypes.put("ModuleParameterType", new MEnum("0148033c-0001-d3a5-0000-000000000000","ModuleParameterType","enum",java.util.Arrays.asList("TYPE_PARAM_BOOLEAN","TYPE_PARAM_STRING","TYPE_PARAM_ENUM","TYPE_PARAM_FILE","TYPE_PARAM_INTEGER","TYPE_PARAM_DIRECTORY","TYPE_PARAM_PASSWORD","TYPE_PARAM_COLOR")));
        this.mBaseTypes.put("PropertyBaseType", new MEnum("20603d99-27f1-11e2-b500-001ec947ccaf","PropertyBaseType","enum",java.util.Arrays.asList("String","Text","Boolean","Integer","Unsigned","Float","Enumerate","Date","Time","Element","Richtext")));
        this.mBaseTypes.put("AggregationKind", new MEnum("0148033c-0000-0ca2-0000-000000000000","AggregationKind","enum",java.util.Arrays.asList("KindIsAssociation","KindIsAggregation","KindIsComposition")));
        this.mBaseTypes.put("KindOfAccess", new MEnum("0148033c-0000-0c4e-0000-000000000000","KindOfAccess","enum",java.util.Arrays.asList("Read","Write","ReadWrite","AccesNone")));
        this.mBaseTypes.put("MethodPassingMode", new MEnum("0148033c-0000-0c58-0000-000000000000","MethodPassingMode","enum",java.util.Arrays.asList("MethodIn","MethodOut")));
        this.mBaseTypes.put("PassingMode", new MEnum("0148033c-0000-0c5b-0000-000000000000","PassingMode","enum",java.util.Arrays.asList("In","Out","Inout")));
        this.mBaseTypes.put("VisibilityMode", new MEnum("0148033c-0000-0c53-0000-000000000000","VisibilityMode","enum",java.util.Arrays.asList("Public","Protected","Private","VisibilityUndefined","PackageVisibility")));
        this.mBaseTypes.put("PortOrientation", new MEnum("f4130521-bb9f-11e1-ac85-001ec947ccaf","PortOrientation","enum",java.util.Arrays.asList("None","In","Out","Inout")));
        this.mBaseTypes.put("Navigability", new MEnum("00886b34-4709-1081-943a-001ec947cd2a","Navigability","enum",java.util.Arrays.asList("None","ThisSide","OtherSide","BothSides")));
        this.mBaseTypes.put("DecisionNodeKind", new MEnum("00d00f24-0000-0a96-0000-000000000000","DecisionNodeKind","enum",java.util.Arrays.asList("ComplexDecision","ExclusiveDecision","InclusiveDecision","EventBasedDecision")));
        this.mBaseTypes.put("ExpansionKind", new MEnum("041e6c10-f878-11df-a2c5-001ec947ccaf","ExpansionKind","enum",java.util.Arrays.asList("Parallel","Iterative","Stream")));
        this.mBaseTypes.put("ObjectFlowEffectKind", new MEnum("00d00f24-0000-0a1f-0000-000000000000","ObjectFlowEffectKind","enum",java.util.Arrays.asList("CreateFlow","ReadFlow","Updateflow","DeleteFlow","ExceptionFlow")));
        this.mBaseTypes.put("ObjectNodeOrderingKind", new MEnum("00d00f24-0000-0cd7-0000-000000000000","ObjectNodeOrderingKind","enum",java.util.Arrays.asList("Unordered","Ordered","LIFO","FIFO")));
        this.mBaseTypes.put("PinPassingMode", new MEnum("00d00f24-0000-0cec-0000-000000000000","PinPassingMode","enum",java.util.Arrays.asList("InPin","OutPin")));
        this.mBaseTypes.put("ParameterEffectKind", new MEnum("00d00f24-0000-0a02-0000-000000000000","ParameterEffectKind","enum",java.util.Arrays.asList("CreateEffect","ReadEffect","UpdateEffect","DeleteEffect")));
        this.mBaseTypes.put("EventType", new MEnum("0148033c-0000-0c82-0000-000000000000","EventType","enum",java.util.Arrays.asList("SignalEvent","CallEvent","TimeEvent","ChangeEvent")));
        this.mBaseTypes.put("InteractionOperator", new MEnum("00d00f24-0000-0ff0-0000-000000000000","InteractionOperator","enum",java.util.Arrays.asList("SeqOp","AltOp","OptOp","BreakOp","ParOp","StrictOp","LoopOp","CriticalOp","NegOp","AssertOp","IgnoreOp","ConsiderOp")));
        this.mBaseTypes.put("MessageKind", new MEnum("00d00f24-0000-0ff2-0000-000000000000","MessageKind","enum",java.util.Arrays.asList("CompleteKind","LostKind","FoundKind","UnknownKind")));
        this.mBaseTypes.put("MessageSort", new MEnum("0148033c-0000-0c79-0000-000000000000","MessageSort","enum",java.util.Arrays.asList("SyncCall","ASyncCall","ASyncSignal","DestroyMessage","CreateMessage","ReturnMessage")));
        this.mBaseTypes.put("RelativeTime", new MEnum("01ec00cc-001c-31bb-0000-000000000000","RelativeTime","enum",java.util.Arrays.asList("Before","During","After","On")));
        this.mBaseTypes.put("KindOfControl", new MEnum("0148033c-0000-0c5f-0000-000000000000","KindOfControl","enum",java.util.Arrays.asList("If","Case")));
        this.mBaseTypes.put("KindOfStateMachine", new MEnum("0148033c-0000-0c7f-0000-000000000000","KindOfStateMachine","enum",java.util.Arrays.asList("Dynamic","Protocol")));
        this.mBaseTypes.put("PredefinedEventType", new MEnum("0148033c-0000-0c9e-0000-000000000000","PredefinedEventType","enum",java.util.Arrays.asList("EntryEvent","DoEvent","ExitEvent")));
        this.mBaseTypes.put("StateKind", new MEnum("0148033c-0000-0c87-0000-000000000000","StateKind","enum",java.util.Arrays.asList("InitialState","DeepHistoryState","ShallowHistoryState","JoinState","ForkState","BranchState","OldFinalState","SignalReceiptState","SignalSendingState","SynchronizationState")));
    }

}
