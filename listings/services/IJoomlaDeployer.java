public interface IJoomlaDeployer {
  DeploymentDescriptor getDeploymentDescriptor();

  IStatus install(BasicExtensionModel extension,
      DeploymentRuntime runtime, IProgressMonitor progressMonitor);
	
  IStatus uninstall(JoomlaExtensionDeployment extensionDeployment, 
      IProgressMonitor progressMonitor);
}