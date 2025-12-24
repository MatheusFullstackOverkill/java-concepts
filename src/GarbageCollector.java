public class GarbageCollector {
    public static void main() {
        // When you run a Java project, the JVM allocates a space in the RAM memory
        // for it, and this space it's split into two, Stack Memory and Heap Memory,
        // the JVM stores something in the first, and others in the second.
        
        // Stack Memory
        // - The stack of method callings;
        // - Informations of Threads that are running;
        // - Primitive local variables;

        // When a method end it's execution, all this it's wiped from the memory.

        // Fun Fact: The name StackOverflow comes from the Stack Memory concept,
        // it's when you have so much items in your Stack Memory, that causes
        // an overflow and the crashing of your machine.

        // Heap Memory
        // - All the objects that we will create or manipulate,
        // the instances, not the definitions of the classes,
        // from ourselfs or from external libs.

        // The role of the Gabage Collector it's periodicly run over our code,
        // to scam for unused objects and delete them from memory, to prevent
        // an overuse of our memory, and the crashing of our machine, using
        // algorithms like Mark and Swip.

        // Garbage Collector, Stack and Heap Memories are programming concepts present
        // in a lot of languages, but here are the particularities of them in the
        // Java language:

        // Java has 5 types of Garbage Collectors, you can configure to use any of them,
        // the default nowdays is G1 GC:
        // - Serial GC - It uses one thread to clear our application,
        // it pauses your application to do it, so it's not recomend for applications
        // that require fast responses, like programs with interfaces. It's recomend
        // for simple, or lightweight applications, were performance it's not the important.

        // - Parellel GC - More processing power, it uses more threads, more throughput.
        // It's suitable for systems with multiple processors. Ideal for batch processing.
        // But it has some problems, it's impredictable, it's not ideal for systems that
        // require low latency, it use more machine resources and can add overhead to our systems.

        // - G1 GC - It's objective it's find a balance between throughput and low latency.
        // It splits the memory in small regions, and starts to clean the more stored regions
        // of the memory. This is the default Garbage Collector for Java since Java 9, because it's
        // very eficient in most cases, most suited for medium and large applications,
        // it does not require to look in the memory heap, because of it's memory split logic
        // to do it's work.
        // A problem of G1 GC it's that it can consume more CPU, requiring a tuning to aquire
        // maximum eficiency.

        // - Z GC - It's ideal for applications that cannot have ANY pauses, critical systems
        // like for hospitals, banks, or airplanes, or for games servers, or for systems that
        // have large heaps, like 50GB.
        // It has ultra lowe latency. It compacts the memory while the application is running,
        // without any implact in it.
        // It has more CPU consumption, it's not ideal for small apps or apps with high workloads,
        // and require more recent Java versions, 11 and above.

        // Shenondoah - It was created by the Red Hat, it follows the same idea of the Z GC,
        // but using different techniques. It has suport of optimized JDK distributions, like
        // OpenJDK, that it's also from Red Hat.
        // It's suitable for the same snarios of the Z GC, including distributed systems,
        // distributed heaps, where each "nós" has it's heap.
        // It's not suitable for really large heap programs, for that it's better use Z GC.
        // It's not compactible for new Java versions.

        // Two programs to check the memory usage of your Java programs:
        // JProfiler;
        // VisualM;
    }
}