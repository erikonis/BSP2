package lu.uni.programming1.lab10.exercise3;

public abstract class Software {
    private String name;
    private int size;

    public Software(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void install(Disk disk) throws Exception {
        switch (disk.install(this)) {
        case ALREADYINSTALLED:
            System.out.println("Can't install " + name + " to " + disk + ": already installed.");
            break;
        case INSUFFICIENTSPACE:
            System.out.println("Can't install " + this + " to " + disk + ": insufficient space.");
            break;
        case SUCCESS:
            System.out.println("Installed " + this + " to " + disk);
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Software other = (Software) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return name + " (" + size + "GB)";
    }
}
