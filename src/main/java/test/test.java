package test;

import org.modelio.metamodel.MAttribute;
import org.modelio.metamodel.MClass;
import org.modelio.metamodel.MDependency;
import org.modelio.metamodel.MEnum;
import org.modelio.metamodel.MMetamodel;

public class test {

	public static void main(String[] args) {
		MMetamodel metamodel = new MMetamodel();

		// Find "Attribute" metaclass
		MClass mClass = metamodel.getClassByName("ModuleParameter");

		// Find SuperType of Attribute meta-class
		String superType = "null";
		if(mClass.getMSuperType().size() > 0){
			superType = mClass.getMSuperType().get(0).getName();
		}
		System.out.println("class " + mClass.getName() + " : " + superType);

		// Find attibutes of Attribute meta-class
		for(MAttribute mAttr : mClass.getMAttributes()){
			System.out.println(" - " + mAttr.getName() + " : " + mAttr.getMDataType().getName());

			if(mAttr.getMDataType() instanceof MEnum){
				MEnum enums = (MEnum) mAttr.getMDataType();

				for(String val : enums.getValues()){
					System.out.println("    * " + val);
				}
			}
		}

		// Find dependency of Attribute meta-class
		for(MDependency mDep : mClass.getMDependencys()){
			System.out.println(" ++ " + mDep.getName() +" : " + mDep.getMClass().getName());
		}

	}

}
