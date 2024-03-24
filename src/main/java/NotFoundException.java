public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Товара с ID=" + id + "не существует");
    }

}
