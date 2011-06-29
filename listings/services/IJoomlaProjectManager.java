public interface IJoomlaProjectManager {
  JoomlaExtensionProject getExtensionProjectModel(IProject prj);
  
  List<JoomlaExtensionProject> getExtensionProjects();

  BasicExtensionModel getBasicExtensionModel(IFile manifestFile);
}