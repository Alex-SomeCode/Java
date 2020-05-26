package hw_4_2019;

public class Notebook {

    private String notebookBrand;
    private String notebookModel;
    private String notebookColor;
    private String processorBrand;
    private String processorModel;
    private String videoCardBrand;
    private String videoCardModel;
    private String RAMBrand;
    private String RAMModel;
    private byte RAMSize;

    static NotebookBuilder builder (){
        return new NotebookBuilder();
    }

    public static class NotebookBuilder {

        private Notebook notebook = new Notebook();

        public NotebookBuilder setNotebookBrand(String notebookBrand) {
            notebook.notebookBrand = notebookBrand;
            return this;
        }

        public NotebookBuilder setNotebookColor(String notebookColor) {
            notebook.notebookColor = notebookColor;
            return this;
        }

        public NotebookBuilder setNotebookModel(String notebookModel) {
            notebook.notebookModel = notebookModel;
            return this;
        }

        public NotebookBuilder setProcessorBrand(String processorBrand) {
            notebook.processorBrand = processorBrand;
            return this;
        }

        public NotebookBuilder setProcessorModel(String processorModel) {
            notebook.processorModel = processorModel;
            return this;
        }

        public NotebookBuilder setVideoCardBrand(String videoCardBrand) {
            notebook.videoCardBrand = videoCardBrand;
            return this;
        }

        public NotebookBuilder setVideoCardModel(String videoCardModel) {
            notebook.videoCardModel = videoCardModel;
            return this;
        }

        public NotebookBuilder setRAMBrand(String RAMBrand) {
            notebook.RAMBrand = RAMBrand;
            return this;
        }

        public NotebookBuilder setRAMModel(String RAMModel) {
            notebook.RAMModel = RAMModel;
            return this;
        }

        public NotebookBuilder setRAMSize(byte RAMSize) {
            notebook.RAMSize = RAMSize;
            return this;
        }

        public Notebook notebookBuild() {
            return this.notebook;
        }
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "notebookBrand='" + notebookBrand + '\'' +
                ", notebookModel='" + notebookModel + '\'' +
                ", notebookColor='" + notebookColor + '\'' +
                ", processorBrand='" + processorBrand + '\'' +
                ", processorModel='" + processorModel + '\'' +
                ", videoCardBrand='" + videoCardBrand + '\'' +
                ", videoCardModel='" + videoCardModel + '\'' +
                ", RAMBrand='" + RAMBrand + '\'' +
                ", RAMModel='" + RAMModel + '\'' +
                ", RAMSize=" + RAMSize +
                '}';
    }
}
