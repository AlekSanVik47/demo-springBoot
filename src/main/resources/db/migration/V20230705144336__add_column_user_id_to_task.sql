ALTER TABLE public.task ADD user_id BIGSERIAL;
ALTER TABLE public.task ADD CONSTRAINT task_fk FOREIGN KEY (user_id) REFERENCES public.users(id);

