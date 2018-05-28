package iox.sds4emf;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class PathFinderTest {

	private static final Logger log = LogManager.getLogger(PathFinderTest.class);

//	@Test
//	public void testFindPath() {
//		System.out.println("xxx==>");
//		log.info("testFindPath");
//		EList<CClass> eObjects = createModel();
//		String path0 = PathFinder.findPath(eObjects.get(0));
//		String path1 = PathFinder.findPath(eObjects.get(1));
//		String path2 = PathFinder.findPath(eObjects.get(2));
//		EList<EAttribute> eAttributes = eObjects.get(0).eClass().getEAttributes();
//		String path3 = PathFinder.findPath(eAttributes.get(0));
//		assertNotNull(path0);
//		log.info("path0=" + path0);
//		log.info("path1=" + path1);
//		log.info("path2=" + path2);
//		log.info("path3=" + path3);
//		EObject eObjectB = eObjects.get(0).eContainer();
//		EClass eClassB = eObjectB.eClass();
//		if (eClassB.getEReferences().get(0).isContainment()) {
//			for (EReference eReferenceCs : eClassB.getEReferences()) {
//				if(eReferenceCs.isMany()) {
//					for (EObject eObjectC : eReferenceCs.eContents()) {
//						EObject eRO = (EObject) eObjectC.eGet(eReferenceCs);
//						eRO.eClass();
//					}
//				} else {
//					
//				}
//			}
//		}
//	}

	@Test
	public void testGetIndex() {
		System.out.println("yyy==>");
	}

//	public EList<CClass> createModel() {
//		CClass cClass1 = TestModelFactory.eINSTANCE.createCClass();
//		cClass1.setCClassAttr1(true);
//		cClass1.setCClassAttr2("GHI1");
//		CClass cClass2 = TestModelFactory.eINSTANCE.createCClass();
//		cClass2.setCClassAttr1(true);
//		cClass2.setCClassAttr2("GHI2");
//		CClass cClass3 = TestModelFactory.eINSTANCE.createCClass();
//		cClass3.setCClassAttr1(true);
//		cClass3.setCClassAttr2("GHI3");
//		BClass bClass = TestModelFactory.eINSTANCE.createBClass();
//		bClass.setBClassAttr1(true);
//		bClass.getBClassAttr2().add("DEF1");
//		bClass.getBClassAttr2().add("DEF2");
//		bClass.getBClassAttr2().add("DEF3");
//		bClass.getBClassRef1().add(cClass1);
//		bClass.getBClassRef1().add(cClass2);
//		bClass.getBClassRef1().add(cClass3);
//		AClass aClass = TestModelFactory.eINSTANCE.createAClass();
//		aClass.setAClassAttr1(true);
//		aClass.setAClassAttr2("ABC");
//		aClass.setAClassRef1(bClass);
//		return bClass.getBClassRef1();
//	}
}
