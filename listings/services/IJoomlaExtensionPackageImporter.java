public interface IJoomlaExtensionPackageImporter {
  List<ArchivedExtensionManifest> findExtensionManifests(
      File extensionArchive, IProgressMonitor progresMonitor);
	
  void importExtension(ArchivedExtensionManifest extension, 
      File destinationDir, IProgressMonitor progressMonitor) 
	  throws ExtensionImportException;
}