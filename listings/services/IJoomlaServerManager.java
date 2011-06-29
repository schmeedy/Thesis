public interface IJoomlaServerManager {
  AvailableServers getAvailableServers();
	
  void updateAvailableServers(AvailableServers servers);
	
  LocalJoomlaServer getDefaultServer(JoomlaExtensionProject prj);
}